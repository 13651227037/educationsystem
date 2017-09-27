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
    <title>登陆</title>
  </head>
  <jsp:include page="basejsp/basic.jsp"/>
  <body>
  <div class="easyui-window" title="登陆窗口" style="left: 30%;top: 30%;width: 350px;height: 300px;padding: 60px 50px 25px 50px;">
    <form action="${pageContext.request.contextPath}/login/login.controller" method="post">
      <table>
        <tr>
          <td>用户名</td>
          <td>
            <input type="text" name="username">
          </td>
        </tr>
        <tr>
          <td>
            <br>
          </td>
        </tr>
        <tr>
          <td>密码</td>
          <td>
            <input type="text" name="password">
          </td>
        </tr>
        <tr>
          <td colspan="2" align="center">
            <input type="submit" value="登陆">
          </td>
        </tr>
      </table>
    </form>
  </div>

  </body>
</html>
