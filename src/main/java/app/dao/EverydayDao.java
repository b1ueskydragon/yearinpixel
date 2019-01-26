package app.dao;

import app.entity.EverydayMaster;

import java.util.List;

public interface EverydayDao {

  List<EverydayMaster> getEverydays(int userId);

}
