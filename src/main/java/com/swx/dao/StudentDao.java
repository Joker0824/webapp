package com.swx.dao;

import com.swx.bean.Student;

import java.util.List;

public interface StudentDao {
  List<Student> findAll();
}
