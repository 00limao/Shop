package com.jinx.Serv;

import com.jinx.Dao.SelectDao;
import com.jinx.Dao.SelectDaoImpl;
import com.jinx.projos.Shops;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "shopsServlet",value = "/shopsServlet")
public class shopsServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SelectDao selectDao = new SelectDaoImpl();
        List<Shops> allShop = selectDao.getAllshop();
        req.setAttribute("shop", allShop);
        req.getRequestDispatcher("i1.jsp").forward(req,resp);
    }
}
