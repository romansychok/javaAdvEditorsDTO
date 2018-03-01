<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 28.02.2018
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${dtos}" var="dto">
    ${dto.idUser}<br>
    ${dto.name}<br>
    ${dto.age}<br>
    <br>
    ${dto.idProduct}<br>
    ${dto.PName}<br>
    ${dto.PType}<br>
    <hr>
</c:forEach>
</body>
</html>
