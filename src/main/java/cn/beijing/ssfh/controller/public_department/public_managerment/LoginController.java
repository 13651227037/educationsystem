package cn.beijing.ssfh.controller.public_department.public_managerment;

import cn.beijing.ssfh.entity.Tbuser;
import cn.beijing.ssfh.services.public_department.public_managerment.UserService;
import cn.beijing.ssfh.util.Message;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    private UserService userService;
        /**
        * @Description: 登陆验证
        * @Author Mr.W
        * @Date 2017/9/25 22:38
        * @version V1.0
        */
    @PostMapping(value = "login")
    public String login(Tbuser user, Model model) {
        String username = user.getUsername();
        String password = user.getPassword();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            subject.getSession().setAttribute("userInfo", userService.loginByUsername(token.getUsername()));
        } catch (UnknownAccountException ex) {
            model.addAttribute(Message.unknown());
            return "login";
            //用户名没有找到。
        } catch (IncorrectCredentialsException ex) {
            model.addAttribute(Message.wrongpwd());
            return "login";
            //用户名密码不匹配。
        } catch (AuthenticationException e) {
            model.addAttribute(Message.otherWrong());
            return "login";
            //其他的登录错误
        }
        //验证是否成功登录的方法
        if (subject.isAuthenticated()) {
            return "main/main";
        }else{
            return "login";
        }

    }
    //权限验证，是否具有add方法
    @RequiresPermissions("add")
    @PostMapping(value = "testPremission")
    public String doTestPremission() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        Session session = (Session) subject.getSession().getAttribute("userInfo");
        return "omg";
    }
    //退出登录
    @PostMapping(value = "loginout")
    public String loginout(Model model) {
        model.addAttribute(Message.loginout());
        return "login";
    }
}
