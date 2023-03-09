<%--
  Created by IntelliJ IDEA.
  User: RedSugar
  Date: 3/9/23
  Time: 9:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Pizza Order</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1>Pizza Order</h1>
<%--<p>Path: <%= request.getRequestURL() %></p>--%>
<p>"crust" parameter: <%= request.getParameter("crust") %></p>
<p>"toppings1" parameter: <%= request.getParameter("toppings") %></p>
<p>"address" parameter: <%= request.getParameter("address") %></p>
<form method="POST" action="/pizza-order">
    <select class="form-select" name="crust">
        <option selected>Pizza Crust</option>
        <option value="1">Thin</option>
        <option value="2">Thick</option>
        <option value="3">Stuffed</option>
    </select>

    <div class="form-check">
        <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault" name="toppings">
        <label class="form-check-label" for="flexCheckDefault">
            Pepperoni
        </label>
    </div>
    <div class="form-check" >
        <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked" name="toppings">
        <label class="form-check-label" for="flexCheckChecked">
            Cheese
        </label>
    </div>

    <div  class="form-group">
        <label for="address" class="form-label">Address</label>
        <input type="text" id="address" name="address" class="form-control">
    </div>

    <button type="submit">Get Pizza</button>

</form>

</body>
</html>
