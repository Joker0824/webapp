<%@ page import="com.swx.bean.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: swx
  Date: 2019/1/13
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!--输出,条件,迭代标签库-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> <!--数据格式化标签库-->
<html>
<head>
    <title>Title</title>
</head>
<body>
<% pageContext.setAttribute("name","joker");%>
<%=pageContext.getAttribute("name")%>
<%--<c:set var="" value=""></c:set>--%>
<%
    List<Person> list=new ArrayList();
    list.add(new Person(19,"joker"));
    list.add(new Person(20,"lisi"));
    list.add(new Person(21,"tesla"));
    list.add(new Person(22,"john"));
    pageContext.setAttribute("list",list);
%>
<c:forEach var="user" items="${list}">
  ${user.name}
</c:forEach>
</body>
</html>
