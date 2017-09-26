<%--
  Created by IntelliJ IDEA.
  User: thinkpad
  Date: 2017/9/3
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>北大青鸟</title>
    <jsp:include page="../basic.jsp"></jsp:include>
    <script type="text/javascript">
        $(function () {
           $("li>a").click(function () {
               var title=$(this).text();
               var url=$(this).attr("url");
               var content="<iframe scrolling='auto' frameborder='0' style='width: 100%;height: 100%' src='"+url+"'>";
              if($("#tt").tabs("exists",title)) {
                  $('#tt').tabs("select",title);
              }else{
                  $("#tt").tabs("add",{
                      title:title,
                      content:content,
                      closable:true
                  });
              }

           }) ;
        });


        function addTabs(title,url) {
            url='${pageContext.request.contextPath}/'+url;
            var content="<iframe scrolling='auto' frameborder='0' style='width: 100%;height: 100%' src='"+url+"'>";
            if($("#tt").tabs("exists",title)) {
                $('#tt').tabs("select",title);
            }else{
                $("#tt").tabs("add",{
                    title:title,
                    content:content,
                    closable:true
                });
            }

        }
    </script>
</head>
<body>
    <%--登录成功,欢迎您：--%>
    <%--${nickName}--%>
    <div class="easyui-layout" style="height: 100%; width: 100%">
        <div region="north" style="width: 100%;height: 15%">
            <div align="center">
                <h2>北大青鸟</h2>
            </div>
            <div align="right" style="width: 80%">
                <h3>欢迎您：${nickName}</h3>
            </div>
        </div>
        <div region="west" style="width: 20%" title="菜单栏">
            <ul>
                <li style="list-style-type:none;">
                    <a href="#" url="${pageContext.request.contextPath}/employeeInfo/toEmployeeInfo.controller">
                        员工信息管理
                    </a>
                </li>
            </ul>

        </div>
        <div region="center">
            <div id="tt" class="easyui-tabs" style="height: 100%;width: 100%">
                <div title="欢迎">
                    <h2 align="center">欢迎使用</h2>
                </div>


            </div>
        </div>
        <div region="south" style="height: 10%">
             <div align="center">
                 <h3>版权@ xxxx</h3>
             </div>
        </div>
    </div>
</body>
</html>
