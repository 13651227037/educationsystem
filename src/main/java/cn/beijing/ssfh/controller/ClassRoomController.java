package cn.beijing.ssfh.controller;

import cn.beijing.ssfh.services.ClassRoomService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Administrator on 2017/9/28.
 * Author bianliqiang
 */
@Controller
public class ClassRoomController {
    @Inject
    private ClassRoomService classRoomService;
    @RequestMapping(value = "selectClassRoomIds",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String selectClassRoomIds() {
        List<Integer> list = classRoomService.selectClassRoomIdAll();
        return JSON.toJSONString(list);
    }
}

