<%--
  Created by IntelliJ IDEA.
  User: 鑫
  Date: 2018/11/30
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" href="/css/index.css"/>
    <script type="text/javascript" src="/js/new_file.js"></script>
      <script type="text/javascript" src="/js/index.js"></script>
  </head>
  <body>
<div id="all">
  <div id="top">
    <div id="top_text">管理系统</div>
    <div id="exit"><a href="LoginOutServlet"> 注销</a>&nbsp;&nbsp;&nbsp;
      <a href="Login.jsp">重新登录</a></div>

  </div>
  <div id="button">
    <div id="left">
     <%-- <ul id="biglist">
        <li id="li1">商品管理</li>
        <li>列表管理</li>
        <li>关于应用</li>--%>
       <div class="left_click">商品管理</div>
         <ul class="Firlist">
           <li><a href="PageServlet" target="iii"> 查询商品</a></li>
           <li><a href="i2.jsp" target="iii">添加商品</a></li>
         </ul>
       <div class="left_click1">列表管理</div>
          <ul class="Firlist1">
            <li><a href="SelectTypeServ" target="iii">查询类别</a></li>
            <li><a href="ii2.jsp" target="iii">添加类别</a></li>
          </ul>
       <div class="left_click2">关于应用</div>
      </ul>

    </div>
    <div id="right">
        <iframe src="First.jsp" id="likediv" scrolling="no" frameborder="0" name="iii"></iframe>
    </div>
  </div>
</div>
  </body>
</html>
