<%--
  Created by IntelliJ IDEA.
  User: 鑫
  Date: 2018/11/30
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/Login.css"/>
</head>
<body>
<form action = "helloServ" method="post">
    <div id="out">
        <div id="wenzi">登录</div>
        <div id="div1">用户名: <input type="text" name="username" id="text1" placeholder="用户名" value="${username}"></div>
        <div id="div2">密&nbsp;&nbsp;&nbsp;码: <input type="password" name="password" id="psw" placeholder="密码"></div>
        <div id="button"><input type="submit" value="登录" id="bt"/></div>
    </div>
</form>
</body>
</html>
