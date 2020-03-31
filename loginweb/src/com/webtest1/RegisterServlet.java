package com.webtest1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserInfo RegisterInfo = new UserInfo();
        String name,password;

        name = request.getParameter("username");
        password = request.getParameter("userpassword");

        RegisterInfo.setName(name);
        RegisterInfo.setPassword(password);

        request.setAttribute("registerinfo",RegisterInfo);
        request.getRequestDispatcher("../registerresults.jsp").forward(request,response);
    }
}
