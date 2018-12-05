<%--
  Created by IntelliJ IDEA.
  User: 鑫
  Date: 2018/12/3
  Time: 15:56
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
        <th>列表ID</th>
        <th>列表名称</th>
        <th>

        </th>
    </tr>
    <c:forEach items="${types}" var="type">
        <tr>
            <td>${type.type_id}</td>
            <td>${type.type_name}</td>
            <td align="center">
                <a href="DeletTypeServlet?deltypeID=${type.type_id}"><span>删除</span></a></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
