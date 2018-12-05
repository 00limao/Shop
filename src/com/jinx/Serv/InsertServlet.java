package com.jinx.Serv;

import com.jinx.Dao.InsertDao;
import com.jinx.projos.Shops;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.List;

@WebServlet(name = "InsertServlet",value = "/InsertServlet")
public class InsertServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /* String shop_name = req.getParameter("shop_name");
        String shop_img = req.getParameter("shop_img");
        String shop_des = req.getParameter("shop_des");
        String shop_price1 = req.getParameter("shop_price");
        String type_id = req.getParameter("type_id");
        String shop_stock = req.getParameter("shop_stock");
        System.out.println(type_id);
        int type_id1 = Integer.parseInt(type_id);*/
        /*BigDecimal shop_price = new BigDecimal(shop_price1);
        int shop_stock1 = Integer.parseInt(shop_stock);*/
       /* Shops shops = new Shops(0,shop_name,shop_img,shop_des,shop_price,type_id1,shop_stock1);*/
        Shops shops = new Shops();
        InsertDao insertDao = new InsertDao();
        /*boolean b = insertDao.InsertDate(shops);
        if (b = true)
        {
            req.getRequestDispatcher("PageServlet").forward(req,resp);
            return;
        }*//*else {
            req.getRequestDispatcher("i2.jsp").forward(req,resp);
        }*/

        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
        ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
        servletFileUpload.setHeaderEncoding("uft-8");
        try {
            List<FileItem> fileItems = servletFileUpload.parseRequest(req);
            for (FileItem f: fileItems) {
                if (!f.isFormField()){
                    System.out.println(f.getName()); //拿值
                    String s = f.getName().toLowerCase();
                    if (s.endsWith(".jpg")||s.endsWith(".jpeg")||s.endsWith("png")){
                        //拿到文件的输入流
                        InputStream inputStream = f.getInputStream();
                        OutputStream outputStream = new FileOutputStream("E:\\img\\"+f.getName());
                        byte[] cache = new byte[1024];
                        int len = 0;
                        while((len = inputStream.read(cache))!=-1){
                            outputStream.write(cache,0,len);
                        }
                        outputStream.flush();
                        outputStream.close();
                        inputStream.close();
                        shops.setShop_img(f.getName());
                    }else {
                        req.setAttribute("message","不支持格式");
                        req.getRequestDispatcher("i2.jsp").forward(req,resp);
                    }
                }else {
                    if ("type_id".equals(f.getFieldName())){
                        System.out.println(f.getString());
                        shops.setType_id(new Integer(f.getString("utf-8")));
                    }
                    if ("shop_id".equals(f.getFieldName())){
                        System.out.println(f.getString());
                        shops.setShop_id(new Integer(f.getString("utf-8")));
                    }
                    if ("shop_name".equals(f.getFieldName())){
                        System.out.println(f.getString());
                        shops.setShop_name(f.getString("utf-8"));
                    }
                    if ("shop_price".equals(f.getFieldName())){
                        System.out.println(f.getString());
                        shops.setShop_price(new BigDecimal(f.getString("utf-8")));
                    }
                    if ("shop_stock".equals(f.getFieldName())){
                        System.out.println(f.getString());
                        shops.setShop_stock(new Integer(f.getString("utf-8")));
                    }
                    if ("shop_des".equals(f.getFieldName())){
                        System.out.println(f.getString());
                        shops.setShop_des(f.getString("utf-8"));
                    }
                }
            }
            System.out.println(shops.toString());
            boolean b1 = insertDao.InsertDate(shops);
            if(b1 = true)
            {
                req.getRequestDispatcher("PageServlet").forward(req,resp);
                return;
            }


        } catch (FileUploadException e) {
            e.printStackTrace();
        }

    }
}
