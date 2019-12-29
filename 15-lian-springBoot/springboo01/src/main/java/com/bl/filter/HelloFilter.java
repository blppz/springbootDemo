package com.bl.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import java.io.IOException;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/29 19:09
 */
@WebFilter("/*")
public class HelloFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    System.out.println("filter init");
  }

  @Override
  public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
    System.out.println("do filter");
    chain.doFilter(req, resp);
  }

  @Override
  public void destroy() {
    System.out.println("filter destory");
  }
}
