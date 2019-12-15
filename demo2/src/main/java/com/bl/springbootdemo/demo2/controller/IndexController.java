package com.bl.springbootdemo.demo2.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/15 8:38
 */
public class IndexController {
  @RequestMapping("/")
  public String toIndex() {
    System.out.println("toIndex");
    return "index";
  }
  @RequestMapping("/addUser")
  public String addUser() {
    System.out.println("laile ..");
    return "addUser";
  }
}
