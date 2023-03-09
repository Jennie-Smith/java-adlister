<%--
  Created by IntelliJ IDEA.
  User: RedSugar
  Date: 3/9/23
  Time: 11:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Colored Page</title>
</head>
<body style="background-color:${color}">
<p>"color" parameter: <%= request.getParameter("color") %></p>
</body>
</html>
