package com.bl.listener;

import com.bl.domain.Account;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/29 19:15
 */
public class HelloListener implements HttpSessionListener {

  public static int online = 0;

  @Override
  public void sessionCreated(HttpSessionEvent se) {
    online++;
    System.out.println("创建 session");
  }

  @Override
  public void sessionDestroyed(HttpSessionEvent se) {
    online--;
    System.out.println("销毁 session");
  }
}
