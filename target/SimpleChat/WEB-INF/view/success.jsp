<%@ page import="com.xin.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: wuzexin
  Date: 2020/9/26
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
    <h1>User-Inf</h1>
    <p>
        <%=session.getAttribute("user").toString()%>
    </p>
</body>
</html>
