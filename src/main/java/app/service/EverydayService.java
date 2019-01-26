package app.service;

import app.entity.EverydayMaster;

import java.util.List;

public interface EverydayService {

  List<EverydayMaster> everydays(int userId);

}
