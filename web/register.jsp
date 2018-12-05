<%--
  Created by IntelliJ IDEA.
  User: 鑫
  Date: 2018/12/2
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>用户注册界面功能</title>
    <link rel="stylesheet" href="css/regtister.css"/>
    <script type="text/javascript" src="js/homework.js"></script>
</head>
<body>

<form action="registerServ">
    <div id="out">
        <h1>用户注册</h1>
        <ul>
            <li>用&nbsp;户&nbsp;名：<input type="text" id="username" name="username"/>
                <span id="span1"></span></li>
            <li>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" id="psw" name="psw"/>
                <span id="span2"></span>
            </li>
            <li>确认密码：<input type="password" id="psw1" name="cpsw"/>
                <span id="span3"></span></li>
            <li>邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱：<input type="email" id="em" name="email"/>
                <span id="span4"></span></li>
            <li>手&nbsp;机&nbsp;号：<input type="tel" id="tell" name="telphone"/>
                <span id="span5"></span>
            </li>
        </ul>
        <input type="submit" value="注册" id="sub"/>
    </div>
    <%--<%=request.getAttribute("message")%>--%>
</form>

</body>
</html>