package com.bl.springbootdemo.demo2.controller;

import com.bl.springbootdemo.demo2.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/14 12:32
 */
@RequestMapping
@RestController
public class UserRestController {
  private Map<Integer, User> userMap = Collections.synchronizedMap(new HashMap<>());

  @RequestMapping("/getUserList")
  public Map<Integer, User> getUserList() {
    return userMap;
  }

  @RequestMapping("/addUser")
  public String addUser(User user) {
    userMap.put(user.getId(),user);
    return "index";
  }

}
