package com.jinx.Serv;

import com.jinx.business.ShopBusiness;
import com.jinx.business.ShopBusinessImpl;
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

@WebServlet(name = "UpdateServlet",value = "/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String sid = req.getParameter("sid");
        String sname = req.getParameter("sname");
        String simg = req.getParameter("simg");
        String sdes = req.getParameter("sdes");
        String sprice = req.getParameter("sprice");
        String sstock = req.getParameter("sstock");
        String stid = req.getParameter("stid");
        int stid1 = Integer.parseInt(stid);
        int sstock1 = Integer.parseInt(sstock);
        int i = Integer.parseInt(sid);
        BigDecimal bigDecimal = new BigDecimal(sprice);
        ShopBusiness shopBusiness = new ShopBusinessImpl();
        Shops shops = new Shops(i,sname,simg,sdes,bigDecimal,stid1,sstock1);
        System.out.println(shops.toString());
        shopBusiness.UpdateDao(shops);
        req.getRequestDispatcher("PageServlet").forward(req,resp);

       /* DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
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
                    }else {
                        req.setAttribute("message","不支持格式");
                        req.getRequestDispatcher("i3.jsp").forward(req,resp);
                    }
                }else {
                    if ("stid".equals(f.getFieldName())){
                        System.out.println(f.getString());
                    }
                    if ("sid".equals(f.getFieldName())){
                        System.out.println(f.getString());
                    }
                    if ("sname".equals(f.getFieldName())){
                        System.out.println(f.getString());
                    }
                    if ("sprice".equals(f.getFieldName())){
                        System.out.println(f.getString());
                    }
                    if ("sstock".equals(f.getFieldName())){
                        System.out.println(f.getString());
                    }
                    if ("sdes".equals(f.getFieldName())){
                        System.out.println(f.getString());
                    }
                }

            }

        } catch (FileUploadException e) {
            e.printStackTrace();
        }*/
    }
}
