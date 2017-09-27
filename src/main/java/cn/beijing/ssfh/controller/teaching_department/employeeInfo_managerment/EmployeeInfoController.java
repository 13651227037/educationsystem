package cn.beijing.ssfh.controller;

import cn.beijing.ssfh.entity.Tbuser;
import cn.beijing.ssfh.pojo.vo.TbuserUserInfoVO;
import cn.beijing.ssfh.services.teaching_department.teacher_management.TbuserUserInfoVOService;
import cn.beijing.ssfh.util.PageUtil;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    @RequestMapping(value = "toMain",method = RequestMethod.GET,produces =
            "application/json;charset=utf-8")
    public String toMain(){
        return "main/main";
    }
    @RequestMapping(value = "toEmployeeInfo", method = RequestMethod.GET)
    public String toEmployeeInfo() {
        return "employee/employee";
    }
    @RequestMapping(value = "queryAllList", method = RequestMethod.GET, produces =
            "application/json;charset=utf-8")
    @ResponseBody
    public String queryAllList(Integer page, Integer rows) {
        PageUtil<TbuserUserInfoVO> list = voService.findTbuserVOList(page, rows);
        return JSON.toJSONString(list);
    }
    @RequestMapping(value = "queryByUserId", method = RequestMethod.GET, produces =
            "application/json;charset=utf-8")
    @ResponseBody
    public String detailByUserId(Integer userId) {
        return JSON.toJSONString(voService.findTbuserVOByTbuserId(userId));
    }
    @RequestMapping(value = "toPersonal", method = RequestMethod.GET)
    public String toPersonal() {
        return "employee/personalInformation";
    }
    @RequestMapping(value = "queryPersonal", method = RequestMethod.GET, produces =
            "application/json;charset=utf-8")
    @ResponseBody
    public String queryPersonal(Model model) {
        return JSON.toJSONString(voService.findTbuserVOByTbuserId(8));
    }
    @RequestMapping(value = "updatePasswordByUserId", method = RequestMethod.POST, produces =
            "application/json;charset=utf-8")
    @ResponseBody
    public String updatePasswordByUserId(Tbuser tbuser) {
        
        return JSON.toJSONString(Mesage.base(voService.updateByPrimaryKeySelective(tbuser)));
    }
}
