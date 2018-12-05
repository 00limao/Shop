<%--
  Created by IntelliJ IDEA.
  User: 鑫
  Date: 2018/12/1
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/i1.css"/>
</head>
<body>
<table id="table1">
    <tr>
        <th>商品ID</th>
        <th>商品名称</th>
        <th>商品图片</th>
        <th>商品描述</th>
        <th>商品价格</th>
        <th>类别ID</th>
        <th>商品库存</th>
        <th>

        </th>
    </tr>
    <c:forEach items="${shop}" var="shop">
        <tr>
            <td>${shop.shop_id}</td>
            <td>${shop.shop_name}</td>
            <td><img src="http://10.25.148.208:8080/img/${shop.shop_img}" width="50px" height="50px"/></td>
            <td>${shop.shop_des}</td>
            <td>${shop.shop_price}</td>
            <td>${shop.type_id}</td>
            <td>${shop.shop_stock}</td>
            <td align="center">
                <a href="QueryServlet?sid=${shop.shop_id}"><span>修改</span></a>&nbsp;&nbsp;&nbsp;
                <a href="DeletServlet?delID=${shop.shop_id}"><span>删除</span></a></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
