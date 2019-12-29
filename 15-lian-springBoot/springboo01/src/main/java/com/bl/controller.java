package com.bl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/29 18:55
 */
@Controller
public class controller {
  @RequestMapping("hello")
  public String hello() {
    return "hello";
  }
}
