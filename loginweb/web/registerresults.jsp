<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.webtest1.UserInfo" %>
<%@ page import="com.webtest1.Dao" %>
<%@ page import="com.webtest1.DBHelper" %>
<html>
<head>
    <title>注册结果</title>
</head>
<body>
<%
    UserInfo registerinfo = (UserInfo)request.getAttribute("registerinfo");
    Dao.InsertUser(registerinfo.getName(),registerinfo.getPassword());
    out.print("<h1>注册成功</h1>");
    out.print("<h2>返回登录界面</h2>");
    response.sendRedirect("../index.jsp");
%>
</body>
</html>
