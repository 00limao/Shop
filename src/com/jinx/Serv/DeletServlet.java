package com.jinx.Serv;

import com.jinx.Dao.DeletDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeletServlet",value = "/DeletServlet")
public class DeletServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String shop_id = req.getParameter("delID");
        DeletDao deletDao = new DeletDao();
        int shop_id1 = Integer.parseInt(shop_id);
        int  shop= deletDao.delDate(shop_id1);
/*        shopsDao shopsdao = new shopsDao();
        List<shops> alldate = shopsdao.getALLdate();
        req.setAttribute("shop",alldate);
        req.getRequestDispatcher("shopServlet").forward(req,resp);*/
        resp.sendRedirect("/PageServlet");
    }
}
