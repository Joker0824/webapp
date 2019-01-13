package com.swx.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LoginServlet extends HttpServlet {
  public LoginServlet() {
    super();
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("这是get请求");
  }
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("这是post请求");
    //提交的数据有可能有中文， 怎么处理。
    req.setCharacterEncoding("UTF-8");
    resp.setContentType("text/html;charset=utf-8");
    String username = req.getParameter("username");
    System.out.println("这是get请求");
    System.out.println(username);
  }
}
