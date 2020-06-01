<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 6/1/2020
  Time: 8:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <div class="content" style="border: 1px solid black">
    <form method="post" action="./discount">
      <h2>Information</h2>
      <input type="text" size="30" name="description" placeholder="Description"><br/><br/>
      <input type="number" placeholder="List Price" name="price" size="30"><br/><br/>
      <input type="number" size="30" name="percent" placeholder="Discount percent"><br/><br/>
      <input type="submit" id="submit" value="discount">
    </form>
  </div>
  </body>
</html>
