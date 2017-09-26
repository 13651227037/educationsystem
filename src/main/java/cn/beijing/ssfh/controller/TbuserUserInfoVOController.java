package cn.beijing.ssfh.controller;

import cn.beijing.ssfh.services.teaching_department.teacher_management.TbuserUserInfoVOService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

/**
 * Created by 79414 on 2017/9/25.
 * Author  GuanChengHao
 */
@Controller
@RequestMapping(value = "toMain")
public class TbuserUserInfoVOController {
    @Inject
    private TbuserUserInfoVOService tbuserUserInfoVOService;
    @RequestMapping(value = "toMain",method = RequestMethod.GET,produces =
    "application/json;charset=utf-8")
    public String toMain(){
        return "main/main";
    }
}
