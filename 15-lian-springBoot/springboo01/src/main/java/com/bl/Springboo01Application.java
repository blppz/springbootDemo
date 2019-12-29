package com.bl;

import com.bl.servlet.HelloServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@ServletComponentScan
public class Springboo01Application {

  public static void main(String[] args) {
    SpringApplication.run(Springboo01Application.class, args);
  }

  //@Bean
  //public ServletRegistrationBean<HelloServlet> getServletRegistrationBean(){
  //  ServletRegistrationBean<HelloServlet> bean = new ServletRegistrationBean<>(new HelloServlet());
  //  bean.setLoadOnStartup(1);
  //  return bean;
  //}

}
