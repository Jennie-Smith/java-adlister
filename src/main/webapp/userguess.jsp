<%--
  Created by IntelliJ IDEA.
  User: RedSugar
  Date: 3/9/23
  Time: 11:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess!</title>
</head>
<body>
<h1>Guess!</h1>

<form method="POST" action="/guess">
    <p>"number" parameter: <%= request.getParameter("number") %></p>
    <div  class="form-group">
        <label for="login" class="form-label">Username</label>
        <input type="text" id="login" name="number" class="form-control">
    </div>
    <button type="submit">Guess</button>
</form>

</body>
</html>
