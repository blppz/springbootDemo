package com.bl.springbootdemo.springbootdemo5.controller;

import com.bl.springbootdemo.springbootdemo5.domain.Account;
import com.bl.springbootdemo.springbootdemo5.service.AccountService;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/17 11:08
 */
@Controller
public class AccountController {

  @Autowired
  private AccountService service;

  /**
   * 获取所有的Account
   */
  @RequestMapping("/list")
  public String all(Model model) {
    List<Account> allAccount = service.findAll();
    model.addAttribute("allAccount",allAccount);

    return "list";
  }

  @RequestMapping("/add")
  public String add(Account account,Model model) {
    System.out.println(ToStringBuilder.reflectionToString(account));
    Account saveAccount = service.saveOne(account);
    if(saveAccount==null || saveAccount.getId()==null) {
      model.addAttribute("isSaveSuccess", false);
    } else {
      model.addAttribute("isSaveSuccess", true);
    }

    return "index";
  }
}
