package com.bl.config;

import com.bl.listener.HelloListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Deacription 配置 Listener
 * @Author BarryLee
 * @Date 2019/12/29 19:35
 */
@Configuration
public class MyMVCConfig implements WebMvcConfigurer {

  // 配置 HelloListener
  @Bean
  public ServletListenerRegistrationBean listenerRegist(){
    ServletListenerRegistrationBean srb = new ServletListenerRegistrationBean();
    srb.setListener(new HelloListener());
    System.out.println("listener");
    return srb;
  }
}
