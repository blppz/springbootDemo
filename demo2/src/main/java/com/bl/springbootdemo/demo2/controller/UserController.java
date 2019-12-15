package com.bl.springbootdemo.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/13 22:22
 */
@Controller
@RequestMapping("/user")
public class UserController {
  @RequestMapping("/list")
  public String list(ModelMap map) {
    map.put("username","老干妈");
    return "list";
  }
}
