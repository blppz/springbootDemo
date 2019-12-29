package com.bl.springbootdemo7.springbootdemo7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/23 8:41
 */
@Controller
public class MainController {
  @RequestMapping("/")
  public String toIndex() {
    return "index";
  }
}
