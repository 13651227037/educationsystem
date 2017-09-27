    <%--
      Created by IntelliJ IDEA.
      User: Mr.W
      Date: 2017/9/23
      Time: 23:07
      To change this template use File | Settings | File Templates.
    --%>
    <%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
    <head>
        <title>Title</title>
        <script src="${pageContext.request.contextPath}/static/jquery-3.2.1.min.js"></script>


    </head>
    <body>
        <%--guest标签，验证未登录或未验证用户显示内容--%>
    <shiro:guest>
        Hi there! Pleas Signuptoday!<br>
    </shiro:guest>
        <%--user标签，已验证用户，subject为已登录或remeberme--%>
        <shiro:user>
            Welcome back John! Not John? Click<br>
        </shiro:user>
        <%--成功在回话中通过身份验证的用户才能显示访问的内容--%>
        <shiro:authenticated>
            <a href="#">Update your contact information</a><br>
        </shiro:authenticated>
        <%--未通过验证的用户显示的内容--%>
        <shiro:notAuthenticated>
            Please <a href="login.jsp">login</a> in order to update your credit card information<br>
        </shiro:notAuthenticated>
        <%--拥有角色的用户显示的内容--%>
        <%--<shiro:hasRole name="教务主管">--%>
            <%--<a href="admin.jsp">Administer the system</a><br>--%>
        <%--</shiro:hasRole>--%>
        <%--未被分配具体角色的用户--%>
        <%--<shiro:lacksRole name="administrator">--%>
            Sorry, you are not allowed to administer the system.<br>
        <%--</shiro:lacksRole>--%>
        <%--分配任意其中的一个即可显示--%>
        <%--<shiro:hasAnyRoles name="developer, project manager, administrator"><br>--%>
            <%--You are either a developer, project manager, or administrater--%>
        <%--</shiro:hasAnyRoles>--%>
        <%--&lt;%&ndash;具有特定角色，特定权限&ndash;%&gt;--%>
        <%--<shiro:hasPermission name="user:create">--%>
            <%--<a href="createUser.jsp">Create a new User</a><br>--%>
        <%--</shiro:hasPermission>--%>
        <%--&lt;%&ndash;没有特定角色特定权限显示&ndash;%&gt;--%>
        <%--<shiro:lacksPermission name="user:delete">--%>
            <%--Sorry, you are not allowed to deleted user accounts<br>--%>
        <%--</shiro:lacksPermission>--%>


        首页
            <form action="${pageContext.request.contextPath}/login/testPremission.controller" method="post">
                <button type="submit" id="testButton">测试权限</button>

            </form>
    </body>
    </html>
