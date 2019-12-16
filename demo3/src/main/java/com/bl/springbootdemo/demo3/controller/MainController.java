package com.bl.springbootdemo.demo3.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/16 19:50
 */
public class MainController {
  @RequestMapping("/")
  public String toIndex() {
    return "index";
  }
}
