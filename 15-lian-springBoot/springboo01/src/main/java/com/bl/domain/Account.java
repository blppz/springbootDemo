package com.bl.domain;

import java.io.Serializable;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/29 19:17
 */
public class Account implements Serializable {
  private Integer id;
  private String loginName;
  private String password;

  @Override
  public String toString() {
    return "Account{" +
        "id=" + id +
        ", loginName='" + loginName + '\'' +
        ", password='" + password + '\'' +
        '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
