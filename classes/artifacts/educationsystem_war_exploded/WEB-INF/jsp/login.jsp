<%--
  Created by IntelliJ IDEA.
  User: thinkpad
  Date: 2017/8/31
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Title</title>
    <jsp:include page="basic.jsp"></jsp:include>
    <script type="text/javascript">
        $(function () {
            $("#loginButton").click(function () {
                $("#loginWindow").window("open");
            });
        });
    </script>
</head>
<body>

    <div id="loginWindow" class="easyui-window" title="登录"
         style="left: 35%;top: 25%; width: 400px;height: 250px; padding: 45px 60px"
         >

        <form id="loginForm" action="${pageContext.request.contextPath}/login/doLoginController.controller" method="get">
            <table>
                <tr>
                    <td>用户名:</td>
                    <td>
                        <input class="easyui-textbox" name="username"/>
                    </td>
                </tr>
                <tr>
                    <td>密码：</td>
                    <td>
                        <input class="easyui-passwordbox" name="password"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input class="easyui-linkbutton" type="submit" value="登录"></input>
                    </td>
                    <td></td>
                </tr>
            </table>
        </form>
    </div>
    <div>
        ${msg}
    </div>

</body>
</html>
