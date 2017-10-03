<%--
  Created by IntelliJ IDEA.
  User: thinkpad
  Date: 2017/9/3
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="../basic/basic.jsp"></jsp:include>
    <script type="text/javascript">
        $(function () {
            $("#hobbyDataGride").datagrid({
                url:"${pageContext.request.contextPath}/employeeInfo/queryAllList.controller",
                method:"GET",
                rownumbers:true,
                striped:true,
                pagination:true,
                title:'个人信息',
                pageSize:5,
                pageList:[2,5,10],
                columns:[[
                    {field:'ck',checkbox:true},
                    {field:'stateName',title:'状况',width:50,formatter:stateNameFormatter},
                    {field:'roleName',title:'职务',width:80,formatter:roleNameFormatter},
                    {field:'teacherName',title:'姓名',width:60,formatter:teacherNameFormatter},
                    {field:'gender',title:'性别',width:30,formatter:genderFormatter},
                    {field:'telephone',title:'联系方式',width:100,formatter:telephoneFormatter},
                    {field:'email',title:'邮箱',width:100,formatter:emailFormatter},
                    {field:'teacherTeachAge',title:'工龄',width:40,formatter:teacherAgeFormatter},
                    {field:'teacherMajor',title:'专业',width:50,formatter:teacherMajorFormatter},
                    {field:'userId',title:'操作',width:200,formatter:userIdFormatter}

                ]],
                toolbar:[
                    {
                        text:'添加',
                        iconCls:'icon-add',
                        handler:function () {
                            $("#addHobbyWindow").window("open");
                        }
                    }

                ],
                onLoadSuccess:function () {
                    $(".button_view").linkbutton();
                }
            })
            function stateNameFormatter(value,row) {
                return row.state.stateName;
            } function roleNameFormatter(value,row) {
                return row.role.roleName;
            } function teacherNameFormatter(value,row) {
                return row.teacher.teacherName;
            }function employeeNumFormatter(value,row) {
                return row.userInfo.employeeNum;
            }function genderFormatter(value,row) {
                var sex=row.userInfo.gender;
                var gender = '';
                if(sex==1){
                    gender = "男";
                }else{
                    gender = "女";
                }
                return gender;
            }
            function telephoneFormatter(value,row) {
                return row.teacher.telephone;
            } function emailFormatter(value,row) {
                return row.teacher.email;
            }function teacherAgeFormatter(value,row) {
                return row.teacher.teacherTeachAge;
            }function teacherMajorFormatter(value,row) {
                return row.teacher.teacherMajor;
            }function userIdFormatter(value,row) {
                var userid=row.tbuser.tbuserId;
                var detailEmployeeInfoButton="<button onclick='detailEmployeeInfo("+userid+")'>详情</button>";
                var updateEmployeeInfoButton="<button onclick='updateEmployeeInfo("+userid+")'>修改</button>";
                return detailEmployeeInfoButton+"     "+updateEmployeeInfoButton;
            }
            
        })
        function detailEmployeeInfo(value) {
            $.get("${pageContext.request.contextPath}/employeeInfo/queryByUserId.controller",
                {"userId":value},function (result) {
                    $("#detailUserInfoName").textbox('setValue', result.userInfo.name);
                    $("#detailEmployeeNum").textbox('setValue', result.userInfo.employeeNum);
                    $("#detailNativePlace").textbox('setValue',result.userInfo.nativePlace);
                    $("#detailHomeAddress").textbox('setValue',result.userInfo.homeAddress);
                    $("#detailTelephone").textbox('setValue',result.userInfo.telephone);
                    $("#detailEmail").textbox('setValue',result.userInfo.email);
                    $("#detailDocumentType").textbox('setValue',result.userInfo.documentType);
                    $("#detailDocumentNum").textbox('setValue',result.userInfo.documentNumber);
                    $("#detailNation").textbox('setValue',result.userInfo.nation);
                    $("#detailBirthDate").textbox('setValue',result.userInfo.birthDate);
                    $("#detailAge").textbox('setValue',result.userInfo.age);
                    $("#detailEducation").textbox('setValue',result.userInfo.education);
                    $("#detailProfessiona").textbox('setValue',result.userInfo.professiona);
                    $("#detailEmergencyContact").textbox('setValue',result.userInfo.emergencyContact);
                    $("#detailEmergencyContactPhone").textbox('setValue',result.userInfo.emergencyContactPhone);
                    $("#detailHomeAddressCode").textbox('setValue',result.userInfo.homeAddressCode);
                    $("#detailHouseholdRegistrationCode").textbox('setValue',result.userInfo.householdRegistrationCode);
                })
            $("#queryEmployeeInfoWindow").window("open");

            
        }
        function updateEmployeeInfo() {
            alert("修改");

        }



    </script>
</head>
<body>
<table id="hobbyDataGride"></table>
<%--添加爱好window--%>
<div class="easyui-window" id="addHobbyWindow" title="添加爱好"
     style="left: 30% ;top: 30% ;width: 400px; height: 250px; padding:45px 60px"
     closed="true"
>
    <form  id="addHobbyForm" method="post" >
        <table>
            <tr>
                <td>爱好名称：</td>
                <td>
                    <input class="easyui-validatebox" name="hobbyName"
                           data-options="required:true,validType:['length[1,5]']"/>

                </td>
            </tr>
            <tr>
                <td>
                    <button id="addHobbyButton" class="easyui-linkbutton">保存</button>
                </td>
                <td></td>
            </tr>
        </table>
    </form>
</div>
<%--个人信息详情window--%>
<div id="queryEmployeeInfoWindow" modal="true" class="easyui-window" style="left: 15% ;top: 0% ;width: 450px; height: 350px; padding:20px 30px" closed="true">
    <form id="queryEmployeeInfoForm">
        <table>
            <tr>
                <td>员工姓名：</td>
                <td>
                    <input class="easyui-textbox" id="detailUserInfoName" name="userInfo.name" readonly>
                </td>
            </tr>
            <tr>
                <td>员工工号：</td>
                <td>
                    <input class="easyui-textbox" id="detailEmployeeNum" name="userInfo.employeeNum" readonly>
                </td>
            </tr>
            <tr>
                <td>籍贯：</td>
                <td>
                    <input class="easyui-textbox" id="detailNativePlace" name="userInfo.nativePlace" readonly>
                </td>
            </tr>
            <tr>
                <td>家庭住址：</td>
                <td>
                    <input class="easyui-textbox" id="detailHomeAddress" name="userInfo.homeAddress" readonly>
                </td>
            </tr>
            <tr>
                <td>电话号码：</td>
                <td>
                    <input class="easyui-textbox" id="detailTelephone" name="userInfo.telephone" readonly>
                </td>
            </tr>
            <tr>
                <td>email：</td>
                <td>
                    <input class="easyui-textbox" id="detailEmail" name="userInfo.email" readonly>
                </td>
            </tr>
            <tr>
                <td>证件类型：</td>
                <td>
                    <input class="easyui-textbox" id="detailDocumentType" name="userInfo.documentType" readonly>
                </td>
            </tr>
            <tr>
                <td>证件号码：</td>
                <td>
                    <input class="easyui-textbox" id="detailDocumentNum" name="userInfo.documentNum" readonly>
                </td>
            </tr>
            <tr>
                <td>国籍：</td>
                <td>
                    <input class="easyui-textbox" id="detailNation" name="userInfo.Nation" readonly>
                </td>
            </tr>
            <tr>
                <td>出生日期：</td>
                <td>
                    <input class="easyui-textbox" id="detailBirthDate" name="userInfo.birthDate" readonly>
                </td>
            </tr>
            <tr>
                <td>年龄：</td>
                <td>
                    <input class="easyui-textbox" id="detailAge" name="userInfo.age" readonly>
                </td>
            </tr>
            <tr>
                <td>学历：</td>
                <td>
                    <input class="easyui-textbox" id="detailEducation" name="userInfo.education" readonly>
                </td>
            </tr>
            <tr>
                <td>专业：</td>
                <td>
                    <input class="easyui-textbox" id="detailProfessiona" name="userInfo.professiona" readonly>
                </td>
            </tr>
            <tr>
                <td>联系人：</td>
                <td>
                    <input class="easyui-textbox" id="detailEmergencyContact" name="userInfo.emergencyContact" readonly>
                </td>
            </tr>
            <tr>
                <td>联系人电话：</td>
                <td>
                    <input class="easyui-textbox" id="detailEmergencyContactPhone" name="userInfo.emergencyContactPhone" readonly>
                </td>
            </tr>
            <tr>
                <td>邮政编码：</td>
                <td>
                    <input class="easyui-textbox" id="detailHomeAddressCode" name="userInfo.homeAddressCode" readonly>
                </td>
            </tr>
            <tr>
                <td>户口类型：</td>
                <td>
                    <input class="easyui-textbox" id="detailHouseholdRegistrationCode" name="userInfo.householdRegistrationCode" readonly>
                </td>
            </tr>

        </table>
    </form>
</div>
<%--修改爱好window--%>
<div id="updateHobbyWindow" class="easyui-window"
     style="left: 30% ;top: 30% ;width: 400px; height: 250px; padding:45px 60px"
     closed="true" title="修改爱好"
>
    <form method="post" id="updateHobbyForm">
        <table>
            <tr>
                <td>爱好名称：</td>
                <td>
                    <input class="easyui-validatebox" name="hobbyName"
                           data-options="required:true,validType:['length[1,5]']"/>
                    <input type="hidden" name="id"/>
                </td>
            </tr>
            <tr>
                <td>创建时间：</td>
                <td>
                    <input class="easyui-textbox" name="createTime" readonly/>
                </td>
            </tr>
            <tr>
                <td>
                    <a href="#" class="easyui-linkbutton" id="saveUpdateHobbyButton">保存</a>
                </td>
                <td></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
