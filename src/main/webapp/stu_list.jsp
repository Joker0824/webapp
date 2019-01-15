<%--
  Created by IntelliJ IDEA.
  User: swx
  Date: 2019/1/15
  Time: 0:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--输出,条件,迭代标签库-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!--数据格式化标签库-->

<html>
<head>
    <title>学生展示页面</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>姓名</th>
        <th>年龄</th>
        <th>地址</th>
    </tr>
    </thead>
    <tbody>
    <%--不写sessionScope默认从pageScope开始往上找--%>
    <c:forEach var="all" items="${sessionScope.listStu}">
        <tr>
            <td>${stu.name}</td>
            <td>${stu.age}</td>
            <td>${stu.address}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<c:forEach items="${sessionScope.listStu}" var="stu">

</c:forEach>
</body>
</html>
