package com.swx.dao.impl;

import com.swx.bean.Student;
import com.swx.dao.StudentDao;
import com.swx.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
  @Override
  public List<Student> findAll() {
    ArrayList<Student> list = new ArrayList<>();
    Connection conn = JDBCUtil.getConn();
    String sql = "select * from students";
    try {
      PreparedStatement preparedStatement = conn.prepareStatement(sql);
      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        Student student = new Student();
        String name = resultSet.getString(2);
        String address = resultSet.getString(3);
        int age = resultSet.getInt(4);
        student.setAddress(address);
        student.setName(name);
        student.setAge(age);
        list.add(student);
      }
      return list;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return list;
  }
}
