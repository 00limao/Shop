package com.jinx.Serv;

import com.jinx.Dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "hello",urlPatterns ="/helloServ" )
public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String psw = req.getParameter("password");
        HttpSession session = req.getSession();
        session.setAttribute("username",username);
        UserDao userDao = new UserDao();
        boolean exists = userDao.isExists(username,psw);
        if(exists == true)
        {
          /*  req.getRequestDispatcher("index1.jsp").forward(req,resp);
            return;*/
          //创建一个名为username的cookie
            Cookie username1 = new Cookie("username1",username);
            Cookie psw1 = new Cookie("psw1",psw);
            //设置过期时间
            username1.setMaxAge(60);
            psw1.setMaxAge(60);
            //添加到响应里面
            resp.addCookie(username1);
            resp.addCookie(psw1);
            //跳到首页
            resp.sendRedirect("index.jsp");
        }else
        {
       //     req.getRequestDispatcher("index.jsp").forward(req,resp);
            resp.sendRedirect("Login.jsp");
        }
    }

}
