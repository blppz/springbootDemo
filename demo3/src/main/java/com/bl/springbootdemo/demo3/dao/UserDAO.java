package com.bl.springbootdemo.demo3.dao;

import com.bl.springbootdemo.demo3.domain.User;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/16 19:57
 */
@Repository
public class UserDAO {

  private ConcurrentMap<Integer,User> userMap = new ConcurrentHashMap<>();

  /**
   * 查找所有的User
   * @return
   */
  public List<User> queryAll() {
    return new ArrayList<>(userMap.values());
  }

  /**
   * 添加一个User
   * @param user
   * @return
   */
  public boolean addUser(User user) {
    if(user==null || user.getId()==null) {
      return false;
    }

    userMap.put(user.getId(),user);
    return true;
  }
}
