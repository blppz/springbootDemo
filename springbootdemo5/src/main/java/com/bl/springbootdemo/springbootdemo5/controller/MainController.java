package com.bl.springbootdemo.springbootdemo5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/17 11:08
 */
@Controller
public class MainController {
  @RequestMapping("/")
  public String toIndex() {
    return "index";
  }
}
