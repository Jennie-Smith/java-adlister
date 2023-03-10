<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--<% String login = request.getParameter("login");--%>
<%--   String password = request.getParameter("password");--%>
<%--   if (login != null && login == "admin" && password != null && password == "password"){--%>
<%--       response.sendRedirect("/profile.jsp");--%>
<%--   }--%>

<%--%>--%>

<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Login</h1>
    <p>"login" parameter: <%= request.getParameter("login") %></p>
    <p>"password" parameter: <%= request.getParameter("password") %></p>
    <form method="POST" action="login">
        <div  class="form-group">
            <label for="login" class="form-label">Username</label>
            <input type="text" id="login" name="login" class="form-control">
        </div>
        <div  class="form-group">
            <label for="password" class="form-label">Password</label>
            <input type="text" id="password" name="password" class="form-control">
        </div>
        <button type="submit">Login</button>
    </form>

<%--submit to pickcolor as a post
get color and redirect to viewcolor and add a query color--%>

</body>
</html>
