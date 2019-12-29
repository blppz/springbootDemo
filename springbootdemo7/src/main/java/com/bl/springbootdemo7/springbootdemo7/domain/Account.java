package com.bl.springbootdemo7.springbootdemo7.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/23 8:36
 */
public class Account implements Serializable {
  /**
   * 用户 Id
   */
  private Integer id;

  /**
   * 用户名
   */
  private String loginName;

  /**
   * 用户密码
   */
  private String password;

  /**
   * 用户昵称
   */
  private String nickName;

  /**
   * 用户年龄
   */
  private Integer age;

  /**
   * 用户地址
   */
  private String location;

  /**
   * 用户账号余额
   */
  private Double balance;

  public Account() {
  }

  public Account(String loginName, String password, String nickName, Integer age, String location, Double balance) {
    this.loginName = loginName;
    this.password = password;
    this.nickName = nickName;
    this.age = age;
    this.location = location;
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "Account{" +
        "id=" + id +
        ", loginName='" + loginName + '\'' +
        ", password='" + password + '\'' +
        ", nickName='" + nickName + '\'' +
        ", age=" + age +
        ", location='" + location + '\'' +
        ", balance=" + balance +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Account account = (Account) o;
    return id.equals(account.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
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

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }
}
