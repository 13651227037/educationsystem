<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 79414
  Date: 2017/9/26
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="../basic.jsp"/>
    <script type="text/javascript">
        $(function () {
            $.get("${pageContext.request.contextPath}/employeeInfo/queryPersonal.controller",
            function (result) {
                $("#detailUserName").textbox('setValue', result.userInfo.name);
                var gender = "";
                if(result.userInfo.gender==1) {
                    gender='男'
                }else{
                    gender = '女';
                }
                $("#detailGender").textbox('setValue', gender);
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
                $("#detailStateName").textbox('setValue', result.state.stateName);
                $("#detailRoleName").textbox('setValue', result.role.roleName);
                $("#detailTeacherMajor").textbox('setValue', result.teacher.teacherMajor);
                $("#detailTeacherTeachAge").textbox('setValue', result.teacher.teacherTeachAge);
                $("#detailTbuserName").textbox('setValue', result.tbuser.username);
                $("#updateUserName").textbox('setValue', result.tbuser.username);
                $("#updateUserId").val(result.tbuser.tbuserId);

            })
            $("#updatePassword").click(function () {
                $("#updatePosswordForm").form("clear");
                $("#passwordAjax").html('');
                $.get("${pageContext.request.contextPath}/employeeInfo/queryPersonal.controller",
                    function (result) {
                        $("#updateUserId").val(result.tbuser.tbuserId);
                    })
                $("#updatePasswordWindow").window("open");
            })
            $("#saveUpdatePasswordButton").click(function () {
                var password1 = $("#password1").val();
                var password2 = $("#password2").val();
                if(password1!=password2) {
                    $("#passwordAjax").html('密码不一致!').css({"color":"red"});
                    return;
                }else{
                    $("#passwordAjax").html('');
                }
                $("#updatePosswordForm").form('submit',{
                    url:'${pageContext.request.contextPath}/employeeInfo/updatePasswordByUserId.controller',
                    success:function (result) {
                        alert(JSON.parse(result).msg);
                        $("#updatePasswordWindow").window("close");
                    }
                })
            })

        })
    </script>
</head>
<body>
<%--修改密码window--%>
<div id="updatePasswordWindow" class="easyui-window" modal="true"
     style="left: 20% ;top: 3% ;width: 430px; height: 240px; padding:45px 40px"
     closed="true" title="修改密码"
>
    <form method="post" id="updatePosswordForm">
        <table>

            <tr>
                <td align="right">密码</td>
                <td>
                    <input type="password" class="easyui-textbox" id="password1" data-options="required:true,validType:['length[1,5]']" />
                    <input type="hidden" name="tbuserId" id="updateUserId"/>

                </td>
            </tr>
            <tr>
                <td align="right">确认密码</td>
                <td>
                    <input type="password" class="easyui-textbox" id="password2" name="password" data-options="required:true,validType:['length[1,5]']"/>
                </td>
                <td align="left" id="passwordAjax"></td>
            </tr>
            <tr>
                <td colspan="3" align="center">
                    <a href="#" class="easyui-linkbutton" id="saveUpdatePasswordButton">保存</a>
                </td>

            </tr>
        </table>
    </form>
</div>

<table  width="100%" >
    <tr >
        <td align="left">个人工作信息</td>
        <td></td>
        <td></td>
        <td align="left">
            <a class="easyui-linkbutton" id="updatePassword">修改密码</a>
        </td>
    </tr>
    <tr>
        <td align="right">用户名</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailTbuserName"  readonly>
        </td>
    </tr>
    <tr>
        <td align="right">姓名</td>
        <td width="3%">  </td>
        <td>
            <input class="easyui-textbox"  id="detailUserName">
        </td>
    </tr>
    <tr>
        <td align="right">性别</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailGender"  readonly>
        </td>
    </tr>
    <tr>
        <td align="right">员工工号</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailEmployeeNum" name="userInfo.employeeNum" readonly>
        </td>
    </tr>
    <tr>
        <td align="right">状况</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailStateName"  readonly>
        </td>
    </tr>
    <tr>
        <td align="right">职务</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailRoleName"  readonly>
        </td>
    </tr>
    <tr>
        <td align="right">专业</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailTeacherMajor"  readonly>
        </td>
    </tr>
    <tr>
        <td align="right">工龄</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailTeacherTeachAge"  readonly>
        </td>
    </tr>
    <tr >
        <td align="left">个人基本信息</td>
    </tr>




    <tr>
        <td align="right">籍贯</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailNativePlace" name="userInfo.nativePlace" readonly>
        </td>
    </tr>
    <tr>
        <td align="right">家庭住址</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailHomeAddress" name="userInfo.homeAddress" readonly>
        </td>
    </tr>
    <tr>
        <td align="right">电话号码</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailTelephone" name="userInfo.telephone" readonly>
        </td>
    </tr>
    <tr>
        <td align="right">email</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailEmail" name="userInfo.email" readonly>
        </td>
    </tr>
    <tr>
        <td align="right">证件类型</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailDocumentType" name="userInfo.documentType" readonly>
        </td>
    </tr>
    <tr>
        <td align="right">证件号码</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailDocumentNum" name="userInfo.documentNum" readonly>
        </td>
    </tr>
    <tr>
        <td align="right">国籍</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailNation" name="userInfo.Nation" readonly>
        </td>
    </tr>
    <tr>
        <td align="right">出生日期</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailBirthDate" name="userInfo.birthDate" readonly>
        </td>
    </tr>
    <tr>
        <td align="right">年龄</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailAge" name="userInfo.age" readonly>
        </td>
    </tr>
    <tr>
        <td align="right">学历</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailEducation" name="userInfo.education" readonly>
        </td>
    </tr>
    <tr>
        <td align="right">专业</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailProfessiona" name="userInfo.professiona" readonly>
        </td>
    </tr>
    <tr>
        <td align="right">联系人</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailEmergencyContact" name="userInfo.emergencyContact" readonly>
        </td>
    </tr>
    <tr>
        <td align="right">联系人电话</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailEmergencyContactPhone" name="userInfo.emergencyContactPhone" readonly>
        </td>
    </tr>
    <tr>
        <td align="right">邮政编码</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailHomeAddressCode" name="userInfo.homeAddressCode" readonly>
        </td>
    </tr>
    <tr>
        <td align="right">户口类型</td>
        <td >  </td>
        <td>
            <input class="easyui-textbox" id="detailHouseholdRegistrationCode" name="userInfo.householdRegistrationCode" readonly>
        </td>
    </tr>


</table>
</body>
</html>
