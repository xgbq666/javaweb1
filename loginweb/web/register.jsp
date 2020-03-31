<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<form action="servlet/RegisterServlet" name="registerform" method="post">
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
            <td colspan="2"><input type="submit" value="注册"/></td>
        </tr>
    </table>
</form>
</body>
</html>
