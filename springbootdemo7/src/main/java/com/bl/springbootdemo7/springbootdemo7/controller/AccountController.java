package com.bl.springbootdemo7.springbootdemo7.controller;

import com.bl.springbootdemo7.springbootdemo7.domain.Account;
import com.bl.springbootdemo7.springbootdemo7.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    service.saveOne(account);
    System.out.println(account);
    //if(saveAccount==null || saveAccount.getId()==null) {
    //  model.addAttribute("isSaveSuccess", false);
    //} else {
    //  model.addAttribute("isSaveSuccess", true);
    //}

    return "index";
  }
}
