package com.bl.springbootdemo.springbootdemo4.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/16 21:29
 */
@Entity
@Table(name="t_user")
public class User implements Serializable {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;
  private String username;
  private String password;

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", username='" + username + '\'' +
        ", password='" + password + '\'' +
        '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
