package com.jinx.Serv;

import com.jinx.Dao.DeletTypeDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeletTypeServlet",value = "/DeletTypeServlet")
public class DeletTypeServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String deltypeID = req.getParameter("deltypeID");
        DeletTypeDao deletTypeDao = new DeletTypeDao();
        int i = Integer.parseInt(deltypeID);
        int i1 = deletTypeDao.DelTypeDate(i);
        resp.sendRedirect("/SelectTypeServ");
    }
}
