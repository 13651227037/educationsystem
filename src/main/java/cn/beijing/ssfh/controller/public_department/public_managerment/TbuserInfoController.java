package cn.beijing.ssfh.controller.public_department.public_managerment;

import cn.beijing.ssfh.entity.Tbuser;
import cn.beijing.ssfh.services.public_department.public_managerment.UserService;
import cn.beijing.ssfh.util.Message;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

/**
 * Created by Mr.W on 2017/9/27.
 */
@Controller
@RequestMapping(value = "tbuserInfo")
public class TbuserInfoController {
    @Inject
    private UserService userService;

    /**
     * @Description: 修改密码
     * @Author Mr.W
     * @Date 2017/9/27 11:58
     * @version V1.0
     */
    @GetMapping(value = "toUpdateTbuserInfo")
    public String toUpdateTbuser() {
        return "userInfo/updateuser";
    }
    @PostMapping(value = "doUpdateTbuserInfo",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String doUpdateTbuser(Tbuser tbuser) {
        if(userService.updateTbuser(tbuser)>0){
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }
}
