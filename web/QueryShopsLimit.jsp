<%--
  Created by IntelliJ IDEA.
  User: 鑫
  Date: 2018/12/2
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>

    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <%--<script type="text/javascript" src="js/jquery.min.js"/>--%>
    <%--<script type="text/javascript" src="js/bootstrap.min.js"/>--%>
</head>
<body>
<table class = "table table-hover">
    <tr>
    <td>类别ID</td>
    <td>商品ID</td>
    <td>商品名称</td>
    <td>商品图片</td>
    <td>商品描述</td>
    <td>商品价格</td>
    <td>商品库存</td>
        <td></td>
    </tr>
    <c:forEach items="${pageBean.shops}" var="shop">
        <tr>
            <td>${shop.type_id}</td>
            <td>${shop.shop_id}</td>
            <td>${shop.shop_name}</td>
            <td><img src="http://localhost:8080/img/${shop.shop_img}" width="50px" height="50px"/></td>
            <td>${shop.shop_des}</td>
            <td>${shop.shop_price}</td>
            <td>${shop.shop_stock}</td>
            <td align="center">
                <a href="QueryServlet?sid=${shop.shop_id}"><span>修改</span></a>&nbsp;&nbsp;&nbsp;
                <a href="DeletServlet?delID=${shop.shop_id}"><span>删除</span></a></td>
        </tr>
    </c:forEach>
</table>
<div style="text-align: center">
<ul class="pagination">
    <li>
        <c:if test="${pageBean.pageNum >1 }">
            <a href="PageServlet?pageNum=${pageBean.pageNum-1}" aria-label="Previous">
                <span aria-hidden="true">&laquo;</span>
            </a>
        </c:if>

    </li>
    <c:forEach begin="${pageBean.startPage}" end="${pageBean.endPage}" step="1" var="i">
    <li><a href="PageServlet?pageNum=${i}">${i}</a></li>
    </c:forEach>
    <li>
        <c:if test="${pageBean.pageNum <pageBean.allPages}">
            <a href="PageServlet?pageNum=${pageBean.pageNum+1}" aria-label="Next">
                <span aria-hidden="true">&raquo;</span>
            </a>
        </c:if>

    </li>
</ul>
</div>


</body>
</html>
