package com.bl.springbootdemo.springbootdemo5.service;

import com.bl.springbootdemo.springbootdemo5.dao.AccountDAO;
import com.bl.springbootdemo.springbootdemo5.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/17 11:03
 */
@Service
public class AccountService {
  @Autowired
  AccountDAO accountDao;

  /**
   * 新增一个Account
   * @param account
   * @return
   */
  public Account saveOne(Account account) {
    return accountDao.save(account);
  }

  /**
   * 根据id删除一个Account
   * @param id
   */
  public void deleteOne(Integer id) {
    accountDao.deleteById(id);
  }

  /**
   * 查找所有的Account
   * @return
   */
  public List<Account> findAll() {
    return accountDao.findAll();
  }
}
