<%--
  Created by IntelliJ IDEA.
  User: 鑫
  Date: 2018/12/1
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/i2.jsp.css"/>
</head>
<body>
<form action="UpdateServlet" method="post" >
    <div id="out" >
        <div id="left">
            <div class="row">
                <span>类别id：</span></br></br>
                <input type="text" placeholder="类别ID" name="stid" value="${shop.type_id}"/>
            </div>
            <div class="row">
                <span>商品id:</span></br></br>
                <input type="text" placeholder="商品ID" name="sid" value="${shop.shop_id}"readonly="readonly"/>
            </div>
            <div class="row">
                <span>商品名:</span></br></br>
                <input type="text" placeholder="商品名" name="sname" value="${shop.shop_name}"/>
                </br></br>
                <input type="submit" value="提交"/>
            </div>
        </div>
        <div id="middle1">
            <div class="row">
                <span>商品价格:</span></br></br>
                <input type="text" placeholder="价格" name="sprice" value="${shop.shop_price}"/>
            </div>
            <div class="row">
                <span>商品库存:</span></br></br>
                <input type="text" placeholder="库存" name="sstock" value="${shop.shop_stock}"/>
            </div>
        </div>
        <div id="middle2">
            <div class="row1">
                <span>商品描述:</span></br></br>
                <textarea name="sdes" placeholder="描述..." style="height: 200px;" >${shop.shop_des}</textarea>
            </div>
        </div>
        <div id="right1">
            <div class="row1">
                <span>商品图片:</span></br></br>
                <div  id="tupian">
                   <%-- <input type="file" name="simg" value="${shop.shop_img}"/>--%>
                    <input type="text" name="simg" value="${shop.shop_img}"/> </div>
            </div>
        </div>

    </div>
</form>
</body>
</html>
