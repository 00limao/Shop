<%--
  Created by IntelliJ IDEA.
  User: 鑫
  Date: 2018/12/1
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/i2.jsp.css"/>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <script type="text/javascript" src="/js/getImges.js"></script>
</head>
<body>
<form action="InsertServlet" method="post" enctype="multipart/form-data">
<div id="out">
    <div id="left">
        <div class="row">
            <span>类别id：</span></br></br>
            <input type="text" placeholder="类别ID" name="type_id"/>
        </div>
        <div class="row">
            <span>商品id:</span></br></br>
            <input type="text" placeholder="商品ID" name="shop_id"/>
        </div>
        <div class="row">
            <span>商品名:</span></br></br>
            <input type="text" placeholder="商品名" name="shop_name"/>
            </br></br>
            <input type="submit" value="提交"/>
        </div>
    </div>
    <div id="middle1">
        <div class="row">
            <span>商品价格:</span></br></br>
            <input type="text" placeholder="价格" name="shop_price"/>
        </div>
        <div class="row">
            <span>商品库存:</span></br></br>
            <input type="text" placeholder="库存" name="shop_stock"/>
        </div>
    </div>
    <div id="middle2">
        <div class="row1">
            <span>商品描述:</span></br></br>
            <textarea name="shop_des" placeholder="描述..." style="height: 200px;"></textarea>
        </div>
    </div>
    <div id="right1">
        <div class="row1">
            <span>商品图片:</span></br></br>
            <div  id="tupian">
                <label style="font-size: 15px;width: 90px;height: 20px;margin-left: 2px;background-color: #E1E1E1" >
                    选择图片
                    <input type="file" name="shop_img" value="${shop.shop_img}" id="file" style="display: none"/>
                </label>
                <img src="http://localhost:8080/img/${shop.shop_img}" width="50px" height="50px" id="imgs"
                style="margin-top: 0px;margin-left: 0px"/>
                <%--<input type="text" name="shop_img"/>--%> </div>
        </div>
    </div>
</div>
</form>
</body>
</html>
