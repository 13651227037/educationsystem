package cn.beijing.ssfh.controller.beans_office.student_manager;

import cn.beijing.ssfh.pojo.vo.OneStudentEmploymentVO;
import cn.beijing.ssfh.pojo.vo.StudentEmploymentVO;
import cn.beijing.ssfh.services.beans_office.student_manager.StudentEmploymentService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Mr.W on 2017/9/23.
 */
@Controller
@RequestMapping(value = "studentEmployment",produces = "application/json;charset=utf-8")
public class StudentEmploymentController {

    @Inject
    private StudentEmploymentService studentEmploymentService;//调用学生就业service层

    @GetMapping(value = "toStudentEmployment")
    public String toStudentEmployment() {
        //此为跳转页面 直接跳到学生就业页面
        return "student/studentemployment";
    }

    @GetMapping(value = "queryAllStudentEmployment")
    @ResponseBody
    public String queryAllStudentEmployment() {
        //此为查询所有学生就业
        List<StudentEmploymentVO> studentEmploymentVOS = studentEmploymentService.listAllStudentEmployment();
        return JSON.toJSONString(studentEmploymentVOS);
    }

    @GetMapping(value = "queryOneStudentEmployment")
    @ResponseBody
    public String queryOneStudentEmployment(Integer studentId) {
        //此为查询单条学生就业信息
        OneStudentEmploymentVO oneStudentEmployment = studentEmploymentService.getOneStudentEmployment(studentId);

        return JSON.toJSONStringWithDateFormat(oneStudentEmployment, "yyyy-MM-dd");
    }


}
