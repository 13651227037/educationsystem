package cn.beijing.ssfh.controller.teaching_department.employeeInfo_managerment;

import cn.beijing.ssfh.entity.*;
import cn.beijing.ssfh.pojo.vo.TbuserUserInfoVO;
import cn.beijing.ssfh.services.public_department.public_managerment.Userservice;
import cn.beijing.ssfh.services.teaching_department.teacher_management.TbuserUserInfoVOService;
import cn.beijing.ssfh.util.Message;
import cn.beijing.ssfh.util.PageUtil;
import com.alibaba.fastjson.JSON;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
/**
 * Created by 79414 on 2017/9/25.
 * Author  GuanChengHao
 */
@RequestMapping(value = "employeeInfo")
@Controller
public class EmployeeInfoController {
    @Inject
    private TbuserUserInfoVOService voService;
    @Inject
    private Userservice userservice;
    //跳转main
    @RequestMapping(value = "toMain",method = RequestMethod.GET,produces =
            "application/json;charset=utf-8")
    public String toMain(){
        return "main/main";
    }
    //去员工信息管理页面
    @RequestMapping(value = "toEmployeeInfo", method = RequestMethod.GET)
    public String toEmployeeInfo() {
        return "employee/employee";
    }
    //员工老师list页面
    @RequestMapping(value = "queryAllList", method = RequestMethod.GET, produces =
            "application/json;charset=utf-8")
    @ResponseBody
    public String queryAllList(Integer page, Integer rows,String  tbname) {

        PageUtil<TbuserUserInfoVO> list = voService.listTbuserVOList(page, rows,tbname);
        return JSON.toJSONString(list);
    }
    //list页面的详情
    @RequestMapping(value = "queryByUserId", method = RequestMethod.GET, produces =
            "application/json;charset=utf-8")
    @ResponseBody
    public String detailByUserId(Integer userId) {
        TbuserUserInfoVO vo = voService.getTbuserVOByTbuserId(userId);
        return JSON.toJSONStringWithDateFormat(vo,"yyyy-MM-dd");
    }
    //去个人基本信息页面
    @RequestMapping(value = "toPersonal", method = RequestMethod.GET)
    public String toPersonal() {
        return "employee/personalInformation";
    }
    //根据登录的用户的ID,获取该用户的个人基本信息
    @RequestMapping(value = "queryPersonal", method = RequestMethod.GET, produces =
            "application/json;charset=utf-8")
    @ResponseBody
    public String queryPersonal() {
        Subject subject = SecurityUtils.getSubject();
        Tbuser tbuser = (Tbuser) subject.getSession().getAttribute("userInfo");
        TbuserUserInfoVO vo = voService.getTbuserVOByTbuserId(tbuser.getTbuserId());
        return JSON.toJSONStringWithDateFormat(vo,"yyyy-MM-dd");

    }
    //个人基本信息中的修改密码
    @RequestMapping(value = "updatePasswordByUserId", method = RequestMethod.POST, produces =
            "application/json;charset=utf-8")
    @ResponseBody
    public String updatePasswordByUserId(Tbuser tbuser) {
        if(voService.updateByPrimaryKeySelective(tbuser)>0){
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }

    //员工信息管理页面新增员工所需要的 部门 职务 状态
    @RequestMapping(value = "listDepartmentRoleStateVO", method = RequestMethod.GET, produces =
            "application/json;charset=utf-8")
    @ResponseBody
    public String listDepartmentRoleStateVO() {
        return JSON.toJSONString(voService.listDepartmentRoleStateVO());
    }

    /**
     * @Description: 新增员工信息
     * @Author GuanChengHao
     * @Date 2017/9/28 13:26
     * @version V1.0
     */
    @RequestMapping(value = "insertTbuserInfoVo", method = RequestMethod.POST, produces =
            "application/json;charset=utf-8")
    @ResponseBody
    public String addTbuserInfoVO(UserInfo userInfo, Tbuser tbuser, UserRole userRole,  Teacher teacher) {
        Integer rows = userservice.insertTbuser(userInfo, tbuser, userRole, teacher);
        if (rows > 0) {
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }
    /**
    * @Description:修改员工信息
    * @Author GuanChengHao
    * @Date 2017/9/28 18:12
    * @version V1.0
    */

    @RequestMapping(value = "updateTbuserInfoVo", method = RequestMethod.POST, produces =
            "application/json;charset=utf-8")
    @ResponseBody
    public String updateTbuserInfoVO(UserInfo userInfo, Tbuser tbuser, UserRole userRole,  Teacher teacher) {
        Integer rows = voService.updateTbuserInfoVO(userInfo, tbuser, userRole, teacher);
        if (rows > 0) {
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }


}
