package com.bl.controller;

import com.bl.domain.Account;
import com.bl.listener.HelloListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/29 19:19
 */
@Controller
public class AccountController {

  @RequestMapping("login")
  public String login(HttpSession session) {
    System.out.println("login"+session);
    return "login";
  }

  @RequestMapping("online")
  @ResponseBody
  public String online() {
    return "当前在线人数："+ HelloListener.online;
  }
}
