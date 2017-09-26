<%--
  Created by IntelliJ IDEA.
  User: Mr.W
  Date: 2017/9/23
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/login/login.controller" method="post">
    <table>
      <tr>
        <td></td>
        <td>
          <input type="text" name="username">
        </td>
      </tr>
      <tr>

        <td>
          <input type="text" name="password">
        </td>
      </tr>
      <tr>
        <td>
          <input type="submit" value="王大仙">
        </td>
      </tr>
    </table>
  </form>
  </body>
</html>
