package com.jinx.Serv;

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
import java.util.List;

@WebServlet(name = "FileServlet",value = "/FileServlet")
public class FileServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
                    }else {
                        req.setAttribute("message","不支持格式");
                        req.getRequestDispatcher("i2.jsp").forward(req,resp);
                    }
                }/*else {
                    if ("username".equals(f.getFieldName())){
                        System.out.println(f.getString());
                    }
                    if ("psw".equals(f.getFieldName())){
                        System.out.println(f.getString());
                    }
                }*/

            }

        } catch (FileUploadException e) {
            e.printStackTrace();
        }
    }
}
