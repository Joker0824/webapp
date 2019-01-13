<%--
  Created by IntelliJ IDEA.
  User: swx
  Date: 2019/1/13
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="loginServlet" method="post">
    <span>请输入用户名</span>
    <input type="text" name="username" id="username">
    <span>请输入密码</span>
    <input type="password" name="password" id="password">
    <input type="submit" value="提交表单">
</form>
</body>
</html>
