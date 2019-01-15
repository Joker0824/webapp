package com.swx.dao;

public interface UserDao {

  /**
   * 登录功能
   */

  boolean login(String username, String password);
}
