package app.entity;

import java.sql.Date;

public class EverydayMaster {

  private int userId;

  private byte color;

  private Date today;

  private Date createTime;

  // TODO update_time

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

}
