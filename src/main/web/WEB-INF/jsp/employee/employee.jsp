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
    <jsp:include page="../basic/basic.jsp"/>
    <script type="text/javascript">
        $(function () {
            $("#employeeInfoVoDataGride").datagrid({
                url: "${pageContext.request.contextPath}/employeeInfo/queryAllList.controller",
                method: "GET",
                rownumbers: true,
                striped: true,
                pagination: true,
                title: '个人信息',
                pageSize: 5,
                pageList: [2, 5, 10],
                columns: [[
                    {field: 'ck', checkbox: true},
                    {field: 'stateName', title: '状况', width: 100, formatter: stateNameFormatter},
                    {field: 'roleName', title: '职务', width: 100, formatter: roleNameFormatter},
                    {field: 'teacherName', title: '姓名', width: 100, formatter: teacherNameFormatter},
                    {field: 'gender', title: '性别', width: 60, formatter: genderFormatter},
                    {field: 'teacherTeachAge', title: '工龄', width: 50, formatter: teacherAgeFormatter},
                    {field: 'teacherMajor', title: '专业', width: 100, formatter: teacherMajorFormatter},
                    {field: 'userId', title: '操作', width: 220, formatter: userIdFormatter}

                ]],
                toolbar: [
                    {
                        text: '添加',
                        iconCls: 'icon-add',
                        handler: function () {
                            $.get("${pageContext.request.contextPath}/employeeInfo/listDepartmentRoleStateVO.controller",
                                function (result) {
                                    result.role.unshift({
                                        roleId: '-1',
                                        roleName: '--请选择--'
                                    });

                                    $("#addUserRoleName").combobox({
                                        data: result.role,
                                        valueField: 'roleId',
                                        textField: 'roleName',
                                        onLoadSuccess: function () {
                                            $(this).combobox('select', -1);
                                        }
                                    });
                                    result.state.unshift({
                                        stateId: '-1',
                                        stateName: '--请选择--'
                                    });
                                    $("#addStateName").combobox({
                                        data: result.state,
                                        valueField: 'stateId',
                                        textField: 'stateName',
                                        onLoadSuccess: function () {
                                            $(this).combobox('select', -1);
                                        }
                                    });

                                })
                            $("#insertEmployeeWindow").window("open");
                        }
                    }

                ],
                onLoadSuccess: function () {
                    $(".button_view").linkbutton();
                }
            })
            function stateNameFormatter(value, row) {
                return row.state.stateName;
            }



            function roleNameFormatter(value, row) {
                return row.role.roleName;
            }

            function teacherNameFormatter(value, row) {
                return row.teacher.teacherName;
            }

            function employeeNumFormatter(value, row) {
                return row.userInfo.employeeNum;
            }

            function genderFormatter(value, row) {
                var sex = row.userInfo.gender;
                var gender = '';
                if (sex == 1) {
                    gender = "男";
                } else {
                    gender = "女";
                }
                return gender;
            }

            function teacherAgeFormatter(value, row) {
                return row.teacher.teacherTeachAge;
            }

            function teacherMajorFormatter(value, row) {
                return row.teacher.teacherMajor;
            }

            function userIdFormatter(value, row) {
                var userid = row.tbuser.tbuserId;
                var detailEmployeeInfoButton = "<button onclick='detailEmployeeInfo(" + userid + ")'>详情</button>";
                var updateEmployeeInfoButton = "<button onclick='updateEmployeeInfo(" + userid + ")'>修改</button>";
                return detailEmployeeInfoButton + "     " + updateEmployeeInfoButton;
            }
            //新增用户老师的保存按钮
            $("#addSaveTbuserInfoButton").click(function () {

                var roleId = $("#addUserRoleName").combobox('getValue');
                var stateId = $("#addStateName").combobox('getValue');
                if(roleId==-1||stateId==-1) {
                    alert("请选择职务和状态!");
                    return;
                }

                $("#addEmployeeVOForm").form('submit', {
                    url: '${pageContext.request.contextPath}/employeeInfo/insertTbuserInfoVo.controller',
                    success: function (result) {

                        alert(JSON.parse(result).msg);
                        $("#insertEmployeeWindow").window("close");
                        $("#insertTbuserWindow").window("close");
                        $("#addEmployeeVOForm").form('clear');
                        $("#employeeInfoVoDataGride").datagrid('reload');

                    }
                })
            })
            //修改用户老师的保存按钮
            $("#updateSaveTbuserInfoButton").click(function () {

                $("#updateUserInfoName2").textbox('setValue',$("#updateUserInfoName1").textbox('getValue'));
                $("#updateEmployeeVOForm").form('submit', {
                    url: '${pageContext.request.contextPath}/employeeInfo/updateTbuserInfoVo.controller',
                    success: function (result) {
                        console.log(result);
                        alert(JSON.parse(result).msg);
                        $("#updateEmployeeWindow").window("close");
                        $("#employeeInfoVoDataGride").datagrid('reload');

                    }
                })
            })
            //模糊查询

            $("#queryTbuserInfoVoButton").click(function () {
                var tbname = $("#queryTbuserInfoButton").textbox('getValue');
                $("#employeeInfoVoDataGride").datagrid('load',{
                    'tbname':tbname
                })
            })
        })
        //详情页面赋值
        function detailEmployeeInfo(value) {
            $.get("${pageContext.request.contextPath}/employeeInfo/queryByUserId.controller",
                {"userId": value}, function (result) {
                    $("#detailUserInfoName").textbox('setValue', result.userInfo.name);
                    $("#detailEmployeeNum").textbox('setValue', result.userInfo.employeeNum);
                    $("#detailNativePlace").textbox('setValue', result.userInfo.nativePlace);
                    $("#detailHomeAddress").textbox('setValue', result.userInfo.homeAddress);
                    $("#detailTelephone").textbox('setValue', result.userInfo.telephone);
                    $("#detailEmail").textbox('setValue', result.userInfo.email);
                    $("#detailDocumentType").textbox('setValue', result.userInfo.documentType);
                    $("#detailDocumentNum").textbox('setValue', result.userInfo.documentNumber);
                    $("#detailNation").textbox('setValue', result.userInfo.nation);
                    $("#detailBirthDate").textbox('setValue', result.userInfo.birthDate);
                    $("#detailAge").textbox('setValue', result.userInfo.age);
                    $("#detailEducation").textbox('setValue', result.userInfo.education);
                    $("#detailProfessiona").textbox('setValue', result.userInfo.professiona);
                    $("#detailEmergencyContact").textbox('setValue', result.userInfo.emergencyContact);
                    $("#detailEmergencyContactPhone").textbox('setValue', result.userInfo.emergencyContactPhone);
                    $("#detailHomeAddressCode").textbox('setValue', result.userInfo.homeAddressCode);
                    $("#detailHouseholdRegistrationCode").textbox('setValue', result.userInfo.householdRegistrationCode);
                })
            $("#queryEmployeeInfoWindow").window("open");


        }
        //点击修改按钮
        function updateEmployeeInfo(result) {
            $.get("${pageContext.request.contextPath}/employeeInfo/queryByUserId.controller",
                {"userId": result}, function (result) {
                    $.get("${pageContext.request.contextPath}/employeeInfo/listDepartmentRoleStateVO.controller",
                        function (value) {
                            $("#updateEmployeeVOForm").form("load", value);
                            value.role.unshift({
                                roleId: '-1',
                                roleName: '--请选择--'
                            });

                            $("#updateUserRoleName").combobox({
                                data: value.role,
                                valueField: 'roleId',
                                textField: 'roleName',
                                onLoadSuccess: function () {
                                    $(this).combobox('select', result.role.roleId);
                                }
                            });
                            value.state.unshift({
                                stateId: '-1',
                                stateName: '--请选择--'
                            });
                            $("#updateStateName").combobox({
                                data: value.state,
                                valueField: 'stateId',
                                textField: 'stateName',
                                onLoadSuccess: function () {
                                    $(this).combobox('select', result.state.stateId);
                                }
                            });

                        })
                    $("#updateUserName").textbox('setValue', result.tbuser.username);
                    $("#updatePassword").textbox('setValue', result.tbuser.password);
                    $("#updatetbuserId").textbox('setValue', result.tbuser.tbuserId);
                    $("#updateUserInfoName1").textbox('setValue', result.userInfo.name);
                    $("#updateUserInfoId").textbox('setValue', result.userInfo.userInfoId);
                    $("#updateEmployeeNum").textbox('setValue', result.userInfo.employeeNum);
                    if(result.userInfo.gender=="1"){
                        $("#gender1").attr("checked","checked");
                    }else{
                        $("#gender2").attr("checked","checked");
                    }
                    $("#updateNativePlace").textbox('setValue', result.userInfo.nativePlace);
                    $("#updateHomeAddress").textbox('setValue', result.userInfo.homeAddress);
                    $("#updateTelephone").textbox('setValue', result.userInfo.telephone);
                    $("#updateEmail").textbox('setValue', result.userInfo.email);
                    $("#updateDocumentNum").textbox('setValue', result.userInfo.documentNumber);
                    $("#updateNation").textbox('setValue', result.userInfo.nation);
                    $("#updateUserRoleId").textbox('setValue', result.userRole.userRoleId);
                    $("#updateBirthDate").textbox('setValue', result.userInfo.birthDate);
                    $("#updateAge").textbox('setValue', result.userInfo.age);
                    $("#updateEducation").textbox('setValue', result.userInfo.education);
                    $("#updateProfessiona").textbox('setValue', result.userInfo.professiona);
                    $("#updateEmergencyContact").textbox('setValue', result.userInfo.emergencyContact);
                    $("#updateEmergencyContactPhone").textbox('setValue', result.userInfo.emergencyContactPhone);
                    $("#updateHomeAddressCode").textbox('setValue', result.userInfo.homeAddressCode);
                    $("#updateHouseholdRegistrationCode").textbox('setValue', result.userInfo.householdRegistrationCode);
                    $("#updateTeacherTeachAge").textbox('setValue', result.teacher.teacherTeachAge);
                    $("#updateTeacherMajor").textbox('setValue', result.teacher.teacherMajor);
                    $("#updateTeacherId").textbox('setValue', result.teacher.teacherId);
                })
            $("#updateEmployeeWindow").window("open");
        }
    </script>
</head>
<body>
<div>
    <form action="" method="post" id="querytbuserInfoVOByUserInfoNameForm">
        <table>
            <tr>
                <td>老师：</td>
                <td>
                    <input class="easyui-textbox" name="student.grade.id" id="queryTbuserInfoButton"/>
                </td>

                <td>
                    <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="queryTbuserInfoVoButton">查询</a>
                </td>
            </tr>
        </table>
    </form>
</div>
<div>
    <table id="employeeInfoVoDataGride"></table>
</div>
<%--个人信息详情window--%>
<div id="queryEmployeeInfoWindow" modal="true" class="easyui-window"
     style="left: 15% ;top: 0% ;width: 450px; height: 350px; padding:20px 30px" closed="true">
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
                    <input class="easyui-textbox" id="detailEmergencyContactPhone" name="userInfo.emergencyContactPhone"
                           readonly>
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
                    <input class="easyui-textbox" id="detailHouseholdRegistrationCode"
                           name="userInfo.householdRegistrationCode" readonly>
                </td>
            </tr>

        </table>
    </form>
</div>
<%--新增员工window--%>
<div id="insertEmployeeWindow" modal="true" class="easyui-window" maximizable="false" collapsible="false"
     minimizable="false" draggable="false"
     style="width: 50%;height: 345px;top: 0%; padding:45px 30px"
     closed="true" title="新增员工">
    <form id="addEmployeeVOForm" method="post" >
        <table>

            <tr>
                <td align="right">职位</td>
                <td width="3%"></td>
                <td>
                    <input  class="easyui-validatebox"  name="roleId" id="addUserRoleName">
                </td>
            </tr>
            <tr>
                <td align="right">状态</td>
                <td width="3%"></td>
                <td>
                    <input class="easyui-validatebox"  name="stateId" id="addStateName">
                </td>
            </tr>
            <tr>
                <td align="right">用户名</td>
                <td></td>
                <td>
                    <input required="true" missingMessage="请输入用户名" class="easyui-validatebox"  name="username" id="addUserName">
                </td>
            </tr>
            <tr>
                <td align="right">密码</td>
                <td></td>
                <td>
                    <input   type="password" name="password" class="easyui-textbox"  id="addPassword" value="1234" >
                </td>
                <td>默认1234</td>
            </tr>
            <tr>
                <td align="right">姓名</td>
                <td width="3%"></td>
                <td>
                    <input required="true" missingMessage="请输入姓名"  name="name"  class="easyui-validatebox"  id="addUserInfoName1">
                    <input  name="teacherName" type="hidden" class="easyui-textbox" id="addUserInfoName2">
                </td>
            </tr>
            <tr>
                <td align="right">员工工号</td>
                <td></td>
                <td>
                    <input required="true" missingMessage="请输入员工号码"  class="easyui-validatebox"  id="addEmployeeNum" name="employeeNum">
                </td>
            </tr>
            <tr>
                <td align="right">性别</td>
                <td></td>
                <td>
                    <input type="radio"  name="gender"  value="1" checked> 男
                    <input type="radio"  name="gender"  value="2"> 女
                </td>
            </tr>
            <tr>
                <td align="right">籍贯</td>
                <td></td>
                <td>
                    <input required="true" missingMessage="请输入籍贯" class="easyui-validatebox"  id="addNativePlace" name="nativePlace">
                </td>
            </tr>
            <tr>
                <td align="right">家庭住址</td>
                <td></td>
                <td>
                    <input required="true" missingMessage="请输入家庭住址" class="easyui-validatebox"  id="addHomeAddress" name="homeAddress">
                </td>
            </tr>
            <tr>
                <td align="right">电话号码</td>
                <td></td>
                <td>
                    <input required="true" missingMessage="请输入电话号码" class="easyui-numberbox" data-options="validType:'length[11,11]'"   id="addTelephone" name="telephone">
                </td>
            </tr>
            <tr>
                <td align="right">email</td>
                <td></td>
                <td>
                    <input  required="true" missingMessage="请输入email" class="easyui-validatebox" data-options="required:true,validType:'email'" id="addEmail" name="email">
                </td>
            </tr>
            <tr>
                <td align="right">证件类型</td>
                <td></td>
                <td>
                    <input type="radio" id="addDocumentType"  name="documentType"  value="1" checked> 身份证

                </td>
            </tr>
            <tr>
                <td align="right">证件号码</td>
                <td></td>
                <td>
                    <input required="true" missingMessage="请输入身份证号码" class="easyui-validatebox" data-options="validType:'length[18,18]'" id="addDocumentNum" name="documentNumber">
                </td>
            </tr>
            <tr>
                <td align="right">国籍</td>
                <td></td>
                <td>
                    <input required="true" missingMessage="请输入国籍" class="easyui-validatebox"  id="addNation" name="nation">
                </td>
            </tr>
            <tr>
                <td align="right">出生日期</td>
                <td></td>
                <td>
                    <input required="true" missingMessage="请输入出生年月"  class= "easyui-datebox"  id="addBirthDate" name="birthDate">
                </td>
            </tr>
            <tr>
                <td align="right">年龄</td>
                <td></td>
                <td>
                    <input required="true" missingMessage="请输入年龄" class="easyui-numberbox"   id="addAge" name="age">
                </td>
            </tr>
            <tr>
                <td align="right">学历</td>
                <td></td>
                <td>
                    <input required="true" missingMessage="请输入学历" class="easyui-validatebox"  id="addEducation" name="education">
                </td>
            </tr>
            <tr>
                <td align="right">专业</td>
                <td></td>
                <td>
                    <input required="true" missingMessage="请输入专业" class="easyui-validatebox"  id="addProfessiona" name="professiona">
                </td>
            </tr>
            <tr>
                <td align="right">联系人</td>
                <td></td>
                <td>
                    <input required="true" missingMessage="请输入联系人" class="easyui-validatebox"  id="addEmergencyContact" name="emergencyContact">
                </td>
            </tr>
            <tr>
                <td align="right">联系人电话</td>
                <td></td>
                <td>
                    <input required="true" missingMessage="请输入联系人电话" class="easyui-numberbox" data-options="validType:'length[11,11]'" id="addEmergencyContactPhone" name="emergencyContactPhone">
                </td>
            </tr>
            <tr>
                <td align="right">邮政编码</td>
                <td></td>
                <td>
                    <input required="true" missingMessage="请输入邮政编码" class="easyui-validatebox"  id="addHomeAddressCode" name="homeAddressCode">
                </td>
            </tr>
            <tr>
                <td align="right">户口类型</td>
                <td></td>
                <td>
                    <input required="true" missingMessage="请输入户口类型" class="easyui-validatebox" id="addHouseholdRegistrationCode" name="householdRegistrationCode">
                </td>
            </tr>
            <tr>
                <td align="right">工龄</td>
                <td width="3%"></td>
                <td>
                    <input required="true" missingMessage="请输入工龄" class="easyui-numberbox"  name="teacherTeachAge" id="addTeacherTeachAge">
                </td>
            </tr>
            <tr>
                <td align="right">所教专业</td>
                <td width="3%"></td>
                <td>
                    <input required="true" missingMessage="请输入所教专业"  class="easyui-validatebox"  name="teacherMajor" id="addTeacherMajor">
                </td>
            </tr>
            <tr>
                <td align="right">
                </td>
                <td></td>
                <td align="right">
                    <a href="#" class="easyui-linkbutton" id="addSaveTbuserInfoButton">保存</a>
                </td>
            </tr>
        </table>
    </form>
</div>
<%--修改员工信息window--%>
<div id="updateEmployeeWindow" modal="true" class="easyui-window" maximizable="false" collapsible="false"
     minimizable="false" draggable="false"
     style="width: 50%;height: 345px;top: 0%; padding:45px 30px"
     closed="true" title="修改员工">
    <form id="updateEmployeeVOForm" method="post" >
        <table>

            <tr>
                <td align="right">职位</td>
                <td width="3%"></td>
                <td>
                    <input class="easyui-combobox" name="roleId" id="updateUserRoleName">
                </td>
            </tr>
            <tr>
                <td align="right">状态</td>
                <td width="3%"></td>
                <td>
                    <input class="easyui-combobox" name="stateId" id="updateStateName">
                </td>
            </tr>
            <tr>
                <td align="right">用户名</td>
                <td></td>
                <td>
                    <input  class="easyui-textbox" name="username" id="updateUserName">
                    <input type="hidden" class="easyui-textbox" name="tbuserId" id="updatetbuserId">
                    <input name="password" type="hidden" class="easyui-textbox" id="updatePassword" readonly>

                </td>
            </tr>

            <tr>
                <td align="right">姓名</td>
                <td width="3%"></td>
                <td>
                    <input  name="name"  class="easyui-textbox" id="updateUserInfoName1">
                    <input type="hidden"  name="userInfoId"  class="easyui-textbox" id="updateUserInfoId">
                    <input  name="teacherName" type="hidden" class="easyui-textbox" id="updateUserInfoName2">
                </td>
            </tr>
            <tr>
                <td align="right">员工工号</td>
                <td></td>
                <td>
                    <input  class="easyui-textbox" id="updateEmployeeNum" name="employeeNum">
                    <input type="hidden" class="easyui-textbox" id="updateUserRoleId" name="userRoleId">
                </td>
            </tr>
            <tr>
                <td align="right">性别</td>
                <td></td>
                <td>
                    <input type="radio"  name="gender" id="gender1" value="1" > 男
                    <input type="radio"  name="gender" id="gender2" value="2"> 女                </td>
            </tr>
            <tr>
                <td align="right">籍贯</td>
                <td></td>
                <td>
                    <input  class="easyui-textbox" id="updateNativePlace" name="nativePlace">
                </td>
            </tr>
            <tr>
                <td align="right">家庭住址</td>
                <td></td>
                <td>
                    <input  class="easyui-textbox" id="updateHomeAddress" name="homeAddress">
                </td>
            </tr>
            <tr>
                <td align="right">电话号码</td>
                <td></td>
                <td>
                    <input  class="easyui-textbox" id="updateTelephone" name="telephone">
                </td>
            </tr>
            <tr>
                <td align="right">email</td>
                <td></td>
                <td>
                    <input  class="easyui-textbox" id="updateEmail" name="email">
                </td>
            </tr>
            <tr>
                <td align="right">证件类型</td>
                <td></td>
                <td>
                    <input checked type="radio"  name="documentType" id="updateDocumentType" value="1" > 身份证

                </td>
            </tr>
            <tr>
                <td align="right">证件号码</td>
                <td></td>
                <td>
                    <input class="easyui-textbox" id="updateDocumentNum" name="documentNumber">
                </td>
            </tr>
            <tr>
                <td align="right">国籍</td>
                <td></td>
                <td>
                    <input  class="easyui-textbox" id="updateNation" name="nation">
                </td>
            </tr>
            <tr>
                <td align="right">出生日期</td>
                <td></td>
                <td>
                    <input  class="easyui-datebox" id="updateBirthDate" name="birthDate">
                </td>
            </tr>
            <tr>
                <td align="right">年龄</td>
                <td></td>
                <td>
                    <input  class="easyui-textbox" id="updateAge" name="age">
                </td>
            </tr>
            <tr>
                <td align="right">学历</td>
                <td></td>
                <td>
                    <input  class="easyui-textbox" id="updateEducation" name="education">
                </td>
            </tr>
            <tr>
                <td align="right">专业</td>
                <td></td>
                <td>
                    <input  class="easyui-textbox" id="updateProfessiona" name="professiona">
                    <input type="hidden"  class="easyui-textbox" id="updateTeacherId" name="teacherId">
                </td>
            </tr>
            <tr>
                <td align="right">联系人</td>
                <td></td>
                <td>
                    <input  class="easyui-textbox" id="updateEmergencyContact" name="emergencyContact">
                </td>
            </tr>
            <tr>
                <td align="right">联系人电话</td>
                <td></td>
                <td>
                    <input class="easyui-textbox" id="updateEmergencyContactPhone" name="emergencyContactPhone">
                </td>
            </tr>
            <tr>
                <td align="right">邮政编码</td>
                <td></td>
                <td>
                    <input  class="easyui-textbox" id="updateHomeAddressCode" name="homeAddressCode">
                </td>
            </tr>
            <tr>
                <td align="right">户口类型</td>
                <td></td>
                <td>
                    <input  class="easyui-textbox" id="updateHouseholdRegistrationCode" name="householdRegistrationCode">
                </td>
            </tr>
            <tr>
                <td align="right">工龄</td>
                <td width="3%"></td>
                <td>
                    <input class="easyui-textbox" name="teacherTeachAge" id="updateTeacherTeachAge">
                </td>
            </tr>
            <tr>
                <td align="right">所教专业</td>
                <td width="3%"></td>
                <td>
                    <input class="easyui-textbox" name="teacherMajor" id="updateTeacherMajor">
                </td>
            </tr>
            <tr>
                <td align="right">
                </td>
                <td></td>
                <td align="right">
                    <a href="#" class="easyui-linkbutton" id="updateSaveTbuserInfoButton">保存</a>
                </td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>
