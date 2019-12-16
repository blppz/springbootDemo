package com.bl.springbootdemo.springbootdemo4.dao;

import com.bl.springbootdemo.springbootdemo4.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/16 21:30
 */
public interface UserDAO extends JpaRepository<User, Integer> {
  @Query(nativeQuery = true, value = "select * from t_user limit 100")
  List<User> findUser();
}
