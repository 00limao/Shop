<%--
  Created by IntelliJ IDEA.
  User: 鑫
  Date: 2018/11/28
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="FileServlet" method="post" enctype="multipart/form-data">
    <input type="text" name="username"/>
    <input type="password" name="psw"/>
    <input type="file" name="file1"/><span>${message}</span>
    <input type="submit" name="submit"/>
</form>

</body>
</html>
