package com.jinx.Serv;

import com.jinx.Dao.SelectTypeDao;
import com.jinx.projos.Shops;
import com.jinx.projos.Type;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SelectTypeServ",value = "/SelectTypeServ")
public class SelectTypeServ extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
        SelectTypeDao selectTypeDao = new SelectTypeDao();
        List<Type> types = selectTypeDao.SelectTypeDate();
        req.setAttribute("types",types);
        req.getRequestDispatcher("ii1.jsp").forward(req,resp);
    }
}
