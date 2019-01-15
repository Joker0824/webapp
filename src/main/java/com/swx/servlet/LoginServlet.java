package com.swx.servlet;

import com.swx.bean.Student;
import com.swx.dao.impl.StudentDaoImpl;
import com.swx.dao.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


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
    String password = req.getParameter("password");
    boolean isSuccess = new UserDaoImpl().login(username, password);
    System.out.println(isSuccess);
    if (isSuccess) {
      System.out.println("登录成功");
      StudentDaoImpl studentDao = new StudentDaoImpl();
      List<Student> all = studentDao.findAll();
      System.out.println(all);
      HttpSession session = req.getSession();
      session.setAttribute("listStu", all);
      resp.sendRedirect("stu_list.jsp");
    }
  }
}
