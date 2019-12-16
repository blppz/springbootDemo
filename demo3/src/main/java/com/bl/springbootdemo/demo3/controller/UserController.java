package com.bl.springbootdemo.demo3.controller;

import com.bl.springbootdemo.demo3.domain.User;
import com.bl.springbootdemo.demo3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/15 9:13
 */
@Controller
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService service;

  @RequestMapping("/all")
  public String userList(Model model) {
    List<User> list = service.queryAll();
    model.addAttribute("userList", list);
    return "userList";
  }

  @RequestMapping("add")
  @ResponseBody
  public String add(Integer id, String username, String password) {
    boolean res = service.addUser(id,username,password);
    if(res) {
      return "添加成功";
    } else {
      return "添加失败";
    }
  }
}
