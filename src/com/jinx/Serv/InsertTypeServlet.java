package com.jinx.Serv;

import com.jinx.Dao.InsertType;
import com.jinx.projos.Type;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InsertTypeServlet",value = "/InsertTypeServlet")
public class InsertTypeServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String type_id = req.getParameter("type_id");
        String type_name = req.getParameter("type_name");
        int i = Integer.parseInt(type_id);
        Type type = new Type(i,type_name);
        InsertType insertType = new InsertType();
        boolean b = insertType.InsertTypeDate(type);
        if (b)
        {
            req.getRequestDispatcher("SelectTypeServ").forward(req,resp);
            return;
        }
    }
}
