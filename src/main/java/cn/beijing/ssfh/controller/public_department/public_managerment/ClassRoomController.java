package cn.beijing.ssfh.controller.public_department.public_managerment;

import cn.beijing.ssfh.entity.ClassRoom;
import cn.beijing.ssfh.services.public_department.public_managerment.ClassRoomService;
import cn.beijing.ssfh.util.PageUtil;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/9/25/025.
 * Author wangshuo
 */
@Controller
@RequestMapping("classroom")
public class ClassRoomController {
    @Inject
    private ClassRoomService classRoomService;

    /**
     * @Description: 跳转页面
     * @Author wangshuo
     * @Date 2017/9/26/026 10:53
     * @version V1.0
     */
    @GetMapping(value = "toClassRoomController")
    public String toClassRoom() {
        return "classroom/listClassroom";
    }

    /**
    * @Description: 和页面交互显示教室所有信息 查询教室
    * @Author wangshuo
    * @Date 2017/9/25/025 18:46
    * @version V1.0
    */
    @GetMapping(value = "doListClassRoomController",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String doListClassRoom(Integer page,Integer rows,String roomName) {
        if(null!=roomName){
            PageUtil<ClassRoom> roomPageUtil = classRoomService.queryByClassRoomName(page,rows,roomName);
            return JSON.toJSONString(roomPageUtil);
        }

        PageUtil<ClassRoom> roomPageUtil = classRoomService.queryAllClassRoom(page, rows);
        return JSON.toJSONString(roomPageUtil);
    }

    /**
    * @Description: 查询教室详情
    * @Author wangshuo
    * @Date 2017/9/26/026 18:50
    * @version V1.0
    */
    @GetMapping(value = "doDetailClassRoomController",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String detailClassRoom(Integer classRoomId) {
        ClassRoom detailClassRoom = classRoomService.detailClassRoom(classRoomId);
        System.out.println("==============>>"+detailClassRoom);
        return JSON.toJSONString(detailClassRoom);

    }

}

