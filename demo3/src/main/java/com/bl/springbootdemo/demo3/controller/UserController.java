package com.bl.springbootdemo.demo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/15 9:13
 */
@Controller
@RequestMapping("/user")
public class UserController {
  private Map<Integer,User>map = Collections.synchronizedMap(new HashMap<>());
  @RequestMapping("/userlist")
  public String userList() {

    return "userList";
  }
}
