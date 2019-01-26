package app.service;

import app.dao.EverydayDao;
import app.entity.EverydayMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("EverydayService")
public class EverydayServiceImpl implements EverydayService {

  @Autowired
  private EverydayDao everydayDao;

  @Override
  public List<EverydayMaster> everydays(int userId) {
    return everydayDao.getEverydays(userId);
  }
}
