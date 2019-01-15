package com.swx.dao.impl;

import com.swx.dao.UserDao;
import com.swx.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

  @Override
  public boolean login(String username, String password) {
    Connection conn = JDBCUtil.getConn();
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String sql = "select * from stu where username=? and password=? ";
    try {
      preparedStatement = conn.prepareStatement(sql);
      preparedStatement.setString(1, username);
      preparedStatement.setString(2, password);
      resultSet = preparedStatement.executeQuery();
      System.out.println(resultSet);
      return resultSet.next();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      JDBCUtil.release(conn, preparedStatement, resultSet);
    }
    return false;
  }
}
