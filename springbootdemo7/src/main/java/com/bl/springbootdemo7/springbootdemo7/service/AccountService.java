package com.bl.springbootdemo7.springbootdemo7.service;

import com.bl.springbootdemo7.springbootdemo7.domain.Account;
import com.bl.springbootdemo7.springbootdemo7.mapper.AccountMapper;
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
  AccountMapper mapper;

  /**
   * 新增一个Account
   * @param account
   * @return
   */
  public void saveOne(Account account) {
    mapper.saveOne(account);
  }

  /**
   * 根据id删除一个Account
   * @param id
   */
  public void deleteOne(Integer id) {
    mapper.deleteById(id);
  }

  /**
   * 查找所有的Account
   * @return
   */
  public List<Account> findAll() {
    return mapper.findAll();
  }
}
