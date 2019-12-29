package com.bl.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/12/29 18:59
 */
@WebServlet(name="hello", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("do .. ");
    super.doGet(req,resp);
  }

}
