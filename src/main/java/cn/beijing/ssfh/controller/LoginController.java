package cn.beijing.ssfh.controller;

import cn.beijing.ssfh.entity.Tbuser;
import cn.beijing.ssfh.services.Userservice;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Mr.W on 2017/9/24.
 */
@Controller
@RequestMapping("login")
public class LoginController {

    @Resource
    private Userservice userservice;

    @PostMapping(value = "login")
    public String login(Tbuser user) {
        String username = user.getUsername();
        String password = user.getPassword();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);

            subject.getSession().setAttribute("userInfo",userservice.loginByUsername(token.getUsername()));

            subject.getSession().setAttribute("userInfo",user);

            return "main/main";
        } catch (Exception e) {
            return "login";
        }
    }


    @RequiresPermissions("add")
    @PostMapping(value = "testPremission")
    public String doTestPremission() {
        return "omg";
    }


}
