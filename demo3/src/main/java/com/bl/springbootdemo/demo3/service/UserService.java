package com.bl.springbootdemo.demo3.service;

import com.bl.springbootdemo.demo3.dao.UserDAO;
import com.bl.springbootdemo.demo3.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/16 19:55
 */
@Service
public class UserService {

  @Autowired
  private UserDAO userDao;

  public List<User> queryAll() {
    return userDao.queryAll();
  }

  public boolean addUser(Integer id, String username, String password) {
    User user = new User();
    user.setId(id);
    user.setUsername(username);
    user.setPassword(password);

    return userDao.addUser(user);
  }

}
