package com.bl.springbootdemo.springbootdemo4.controller;

import com.bl.springbootdemo.springbootdemo4.domain.User;
import com.bl.springbootdemo.springbootdemo4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/16 21:31
 */
@Controller
@RequestMapping("/user")
public class UserController {

  @Autowired
  UserService service;

  @RequestMapping("/all")
  public String userList(Model model) {
    List<User> list = service.queryAll();
    model.addAttribute("userList", list);
    return "userList";
  }

  @RequestMapping("add")
  @ResponseBody
  public String add(String username, String password) {
    User user = service.addUser(username,password);

    if(null != user) {
      return "添加成功" + user.toString();
    } else {
      return "添加失败";
    }
  }
}
