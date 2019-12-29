package com.bl.springbootdemo7.springbootdemo7.mapper;

import com.bl.springbootdemo7.springbootdemo7.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/17 11:02
 */
@Repository
public interface AccountMapper {
  /**
   * 新增一个 Account
   */
  Account saveOne(Account account);

  /**
   * 根据 id 删除
   */
  void deleteById(Integer id);

  /**
   * 查找所有 Account
   */
  List<Account> findAll();
}
