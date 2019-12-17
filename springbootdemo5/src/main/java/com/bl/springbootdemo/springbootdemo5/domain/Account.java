package com.bl.springbootdemo.springbootdemo5.domain;

import javax.persistence.*;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/17 10:57
 */
@Entity
@Table(name="account")
public class Account {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String password;
  private String nickname;
  private Integer age;

  public Account() {
  }

  public Account(Integer id, String name, String password, String nickname, Integer age) {
    this.id = id;
    this.name = name;
    this.password = password;
    this.nickname = nickname;
    this.age = age;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}
