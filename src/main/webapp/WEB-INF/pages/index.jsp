<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 27.02.2018
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Index page
<br>
<sf:form action="/save" method="post" modelAttribute="user">
    <sf:input path="name"/>
    <sf:input path="age"/>
    <sf:input path="product"/>
    <input type="submit" value="save"/>
</sf:form>
<br>
<a href="/userPage"> Users page</a>
</body>
</html>
