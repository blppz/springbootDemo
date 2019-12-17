package com.bl.springbootdemo.springbootdemo5.dao;

import com.bl.springbootdemo.springbootdemo5.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/17 11:02
 */
@Repository
public interface AccountDAO extends JpaRepository<Account,Integer> {
}
