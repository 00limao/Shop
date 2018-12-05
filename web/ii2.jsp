<%--
  Created by IntelliJ IDEA.
  User: 鑫
  Date: 2018/12/3
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加类别</title>
    <link rel="stylesheet" href="css/ii2.css"/>
</head>
<body>
<form action="InsertTypeServlet" method="post">
<div id="out">
    <div id="in1">类别ID:</br><input type="text" name="type_id" class="input"/></div>
    <div id="in2">类别名称:</br><input type="text" name="type_name" class="input"/></div>
    <div id="in3"><input type="submit" value="提交"/></div>
</div>
</form>
</body>
</html>
