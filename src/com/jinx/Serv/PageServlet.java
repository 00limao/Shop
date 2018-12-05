package com.jinx.Serv;

import com.jinx.business.ShopBusiness;
import com.jinx.business.ShopBusinessImpl;
import com.jinx.projos.PageBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PageServlet",value = "/PageServlet")
public class PageServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pageNum = req.getParameter("pageNum");
        int changePage = 0;
        if (pageNum == null || "".equals(pageNum)){
            changePage = 1;
        }else
        {
            changePage = Integer.parseInt(pageNum);
        }
        ShopBusiness shopBusiness = new ShopBusinessImpl();
        PageBean shopByPaging = shopBusiness.getShopByPaging(changePage, 5);
        req.setAttribute("pageBean",shopByPaging);
        System.out.println(shopByPaging.getShops().toString());
        req.getRequestDispatcher("QueryShopsLimit.jsp").forward(req,resp);
    }
}
