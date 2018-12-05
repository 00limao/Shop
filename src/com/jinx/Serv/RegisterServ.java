package com.jinx.Serv;

import com.jinx.Dao.UserDaoImpl;
import com.jinx.Dao.UsersDao;
import com.jinx.projos.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServ",value = {"/registerServ"})
public class RegisterServ extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String psw = req.getParameter("psw");
        String email = req.getParameter("email");
        String telphone = req.getParameter("telphone");
        //构建一个user对象
        User user = new User(null,username,psw,email,telphone);
        UsersDao usersDao = new UserDaoImpl();
        boolean b = usersDao.addOneUser(user);
        if(b == true)
        {
            req.getRequestDispatcher("Login.jsp").forward(req,resp);
            return;
        }else
        {
            req.setAttribute("message","注册失败");
            req.getRequestDispatcher("register.jsp").forward(req,resp);
        }


    }
}
