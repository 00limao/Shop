package com.jinx.Serv;

import com.jinx.business.ShopBusiness;
import com.jinx.business.ShopBusinessImpl;
import com.jinx.projos.Shops;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "QueryServlet",value = "/QueryServlet")
public class QueryServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sid = req.getParameter("sid");
        System.out.println("接收参数："+sid);
        int i = Integer.parseInt(sid);
        System.out.println("转型参数："+i);
        ShopBusiness shopBusiness = new ShopBusinessImpl();
        Shops oneShop = shopBusiness.getOneShop(i);
        System.out.println(oneShop.toString());
        req.setAttribute("shop",oneShop);
        req.getRequestDispatcher("i3.jsp").forward(req,resp);
    }
}
