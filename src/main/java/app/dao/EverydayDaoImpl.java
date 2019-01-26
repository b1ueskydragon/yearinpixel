package app.dao;

import app.entity.EverydayMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("EverydayDao")
public class EverydayDaoImpl implements EverydayDao {

  @Autowired
  private NamedParameterJdbcTemplate namedParameterTemplate;

  @Override
  public List<EverydayMaster> getEverydays(int userId) {
    String sql = "SELECT * FROM everyday_master WHERE user_id = :user_id";

    MapSqlParameterSource paramMap = new MapSqlParameterSource()
        .addValue("user_id", userId);

    return namedParameterTemplate.query(sql, paramMap, (rs, rowNum) -> {
      EverydayMaster entity = new EverydayMaster();
      entity.setUserId(rs.getInt("user_id"));
      entity.setColor(rs.getByte("color"));
      entity.setToday(rs.getDate("today"));
      return entity;
    });
  }
}
