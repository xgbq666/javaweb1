<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.webtest1.UserInfo"%>
<%@ page import="com.webtest1.DBHelper"%>
<%@ page import="com.webtest1.Dao"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.io.PrintWriter" %>
<html>
<head>
    <title>登录结果</title>
</head>
<body>
<%
    UserInfo logininfo = (UserInfo) request.getAttribute("logininfo");
    if(Dao.SearchUser(logininfo.getName(),logininfo.getPassword())){
        out.print("<h1>登录成功</h1>");
    }else{
        out.print("<h1>登录失败</h1><br><h2>自动返回登陆界面</h2><br>");
        out.print("<META HTTP-EQUIV=REFRESH CONTENT=\"2;URL=../index.jsp\">\n" +
                "<span id=yu>2</span><a href=javascript:countDown></a>\n" +
                "<script>\n" +
                "function countDown(secs){\n" +
                "  yu.innerText=secs;\n" +
                "  if(--secs>0){\n" +
                "       setTimeout(\"countDown(\"+secs+\")\",1000);\n" +
                "    }\n" +
                "  }\n" +
                " countDown(2);\n" +
                " </script>");
    }
%>
</body>
</html>
