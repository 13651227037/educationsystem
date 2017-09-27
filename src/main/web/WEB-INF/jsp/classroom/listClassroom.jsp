<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/25/025
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>教室管理</title>
    <jsp:include page="/WEB-INF/jsp/basic.jsp"/>
    <script type="text/javascript">
        $(function () {
            //显示教室信息
            $("#classRoomDataGrid").datagrid({
                url: "${pageContext.request.contextPath}/classroom/doListClassRoomController.controller",
                method: 'GET',
                rownumbers: 'true',
                striped: 'true',
                pagination: 'true',
                title: '教室管理',
                pageSize: '5',
                pageList: [3, 5, 10],
                columns: [[
                    {field: 'ck', checkbox: true},
                    {field: 'classroomName', title: '教室名称', width: 200},
                    {field: 'stateId', title: '使用情况', width: 200, formatter: stateName},
                    {field: 'maxNum', title: '容纳人数', width: 125},
                    {field: 'classroomUse', title: '教室用途', width: 200},
                    {field: 'id', title: '操作', width: 300, formatter: optionmatter}
                ]],
                toolbar: [
                    {
                        text: '添加',
                        iconCls: 'icon-add',
                        handler: function () {
                            alert("添加");
                        }
                    },
                    {
                        text: '删除',
                        iconCls: 'icon-remove',
                        handler: function () {
                            alert("删除");
                        }

                    }
                ]
            });


            //通过教室名称查询
            $("#saveByClassRoomNameButton").click(function () {
                var roomName = $("#byClassRoomNameTextBox").val();
                $("#classRoomDataGrid").datagrid({queryParams: {"roomName": roomName}});
            });
        });

        //状态名称
        function stateName(rowDate) {
            if (rowDate == 4) {
                return "可用";
            }
            if (rowDate == 5) {
                return "不可用";
            }

        }

        //操作列
        function optionmatter(rowDate) {
            var queryClassRoomButton = "<button class='button_view' onclick='queryClassRoom(" + rowDate + ")'>详情</button>"
            var updateClassRoomButton = "<button class='button_view' onclick='updateClassRoom(" + rowDate + ")'>修改</button>"
            return queryClassRoomButton + updateClassRoomButton;
        }

        //查询教室详情
        function queryClassRoom(id) {
                alert(id);
            $.get("${pageContext.request.contextPath}/classroom/doDetailClassRoomController.controller", {"id": id}, function (result) {
                $("#detailClassRoomForm").form('load', result);
                $("#detailClassRoomWindow").window('open');
            });
        }

        //修改教室详情
        function updateClassRoom(rowDate) {
            $("#updateClassRoomWindow").window('open')
        }

    </script>
</head>
<body>
<div id="byclassRoomNameDataGrid">
    <form action="" id="queryByClassRoomNameForm">
        <table>
            <tr>
                <td>
                    <input class="easyui-textbox" id="byClassRoomNameTextBox" name="byClassRoomName">
                    <a href="#" id="saveByClassRoomNameButton" class="easyui-linkbutton"
                       iconCls="icon-save">提交搜索</a>
                </td>

            </tr>
        </table>
    </form>

</div>
<div>
    <table id="classRoomDataGrid"></table>
</div>
<%--教室详情--%>
<div id="detailClassRoomWindow" class="easyui-window"
     style="width: 400px;height: 250px;top: 15%;left: 20%; padding: 45px 65px" title="教室详情" closed="true">
    <div>
        <form id="detailClassRoomForm">
            <table>
                <tr>
                    <td>教室名称:</td>
                    <td>
                        <input type="easyui-textbox" name="classroomName" readonly>
                    </td>
                </tr>
                <tr>
                    <td>教室占用班级:</td>
                    <td>
                        <input type="easyui-textbox" name="detailOccupyGrade" readonly>
                    </td>
                </tr>
                <tr>
                    <td>使用老师:</td>
                    <td>
                        <input type="easyui-textbox" name="detailUseTeacher" readonly>
                    </td>
                </tr>
            </table>
        </form>

    </div>
</div>
<%--修改教室--%>
<div id="updateClassRoomWindow" class="easyui-window"
     style="width: 400px;height: 250px;top: 15%;left: 20%; padding: 45px 65px" title="修改教室" closed="true">
    <div>
        <form id="updateClassRoomForm">
            <table>
                <tr>
                    <td>教室名称:</td>
                    <td>
                        <input type="easyui-textbox" id="updateClassRoomName" name="ClassRoom" readonly>
                        <input type="hidden" id="updateClassRoomId" name="classroomId">
                    </td>
                </tr>
                <tr>
                    <td>教室占用班级:</td>
                    <td>
                        <input type="easyui-textbox" id="updateOccupyGrade" name="updateOccupyGrade" readonly>
                    </td>
                </tr>
                <tr>
                    <td>使用老师:</td>
                    <td>
                        <input type="easyui-textbox" id="updateUseTeacher" name="updateUseTeacher" readonly>
                    </td>
                </tr>
                <tr>
                    <td>
                        <a href="#" id="saveUpdateClassRoomButton" class="easyui-linkbutton" iconCls="icon-save">保存</a>
                    </td>
                </tr>
            </table>
        </form>

    </div>
</div>
</body>
</html>
