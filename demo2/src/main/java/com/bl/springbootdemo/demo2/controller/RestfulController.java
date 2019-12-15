package com.bl.springbootdemo.demo2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/14 9:28
 */
@RestController
public class RestfulController {
  @RequestMapping("/testRest")
  public Map<String,String> testRest() {
    Map<String,String>map = new HashMap<>();
    map.put("123","老干妈");
    map.put("321","雷神");

    return map;
  }
}
