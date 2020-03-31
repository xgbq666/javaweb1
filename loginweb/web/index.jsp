<%@ page contentType="text/html;charset=UTF-8" language="java" import ="java.util.*,java.text.*"%>
<html>
<head>
  <title>登陆界面</title>
</head>
<body>
<h1>用户登录</h1>
<hr>
<form action="servlet/LoginServlet" name="loginform" method="post">
  <table>
    <tr>
      <td>用户名:</td>
      <td><label>
        <input type="text" name="username"/>
      </label></td>
    </tr>
    <tr>
      <td>密码:</td>
      <td><label>
        <input type="password" name="userpassword"/>
      </label></td>
    </tr>
    <tr>
      <td colspan="2"><input type="submit" value="登录"/></td>
      <td colspan="2"><a href="register.jsp"><input type="button" value="注册"></a> </td>
    </tr>
  </table>
</form>
</body>
</html>
