package com.webtest1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserInfo LoginInfo = new UserInfo();
        String name,password;

        name = request.getParameter("username");
        password = request.getParameter("userpassword");

        LoginInfo.setName(name);
        LoginInfo.setPassword(password);

        request.setAttribute("logininfo",LoginInfo);
        request.getRequestDispatcher("../loginresults.jsp").forward(request,response);

    }

}
