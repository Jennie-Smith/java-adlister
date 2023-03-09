<%--
  Created by IntelliJ IDEA.
  User: RedSugar
  Date: 3/9/23
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color Page</title>
</head>
<p>"color" parameter: <%= request.getParameter("color") %></p>
<form method="POST" action="/pickcolor">
    <div  class="form-group">
        <label for="color" class="form-label">Enter Your Favorite Color: </label>
        <input type="text" id="color" name="color" class="form-control">
    </div>
    <button type="submit">Submit</button>
</form>

</body>
</html>
