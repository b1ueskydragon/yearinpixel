package app.model;

import app.entity.EverydayMaster;

import java.sql.Date;
import java.util.List;
import java.util.Map;

public class EverydaySearch {

  private List<EverydayMaster> everydays;

  // TODO annotation validate

  private int userId;

  private byte color;

  private Date today;

  private Date createTime;

  // TODO color mapping in server?
  private Map<Integer, String> colorDict;

  // TODO update_time

  public List<EverydayMaster> getEverydays() {
    return everydays;
  }

  public void setEverydays(List<EverydayMaster> everydays) {
    this.everydays = everydays;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public byte getColor() {
    return color;
  }

  public void setColor(byte color) {
    this.color = color;
  }

  public Date getToday() {
    return today;
  }

  public void setToday(Date today) {
    this.today = today;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Map<Integer, String> getColorDict() {
    return colorDict;
  }

  public void setColorDict(Map<Integer, String> colorDict) {
    this.colorDict = colorDict;
  }
}
