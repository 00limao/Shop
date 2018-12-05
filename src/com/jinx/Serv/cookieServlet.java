package com.jinx.Serv;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "cookieServlet",value = "/cookieServlet")
public class cookieServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        if (cookies !=null)
        {
           req.getRequestDispatcher("index.jsp").forward(req,resp);
        }else
        {
            req.getRequestDispatcher("Login.jsp").forward(req,resp);
        }

    }
}
