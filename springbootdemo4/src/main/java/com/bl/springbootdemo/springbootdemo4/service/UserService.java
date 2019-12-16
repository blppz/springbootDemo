package com.bl.springbootdemo.springbootdemo4.service;

import com.bl.springbootdemo.springbootdemo4.dao.UserDAO;
import com.bl.springbootdemo.springbootdemo4.domain.User;
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
  UserDAO userDao;

  public List<User> queryAll() {
    return userDao.findUser();
  }

  public User addUser(String username, String password) {
    User user = new User();
    user.setUsername(username);
    user.setPassword(password);

    return userDao.save(user);
  }

}
