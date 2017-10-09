package cn.beijing.ssfh.controller;

import cn.beijing.ssfh.services.CourseTableVOService;
import cn.beijing.ssfh.util.RecordResult;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Administrator on 2017/9/26.
 * Author bianliqiang
 */
@Controller
@RequestMapping(value = "CourseTables")
public class CourseTablesController {
    @Inject
    private CourseTableVOService courseTableVOService;
    @RequestMapping(value = "selectCoruseTableAll",method = RequestMethod.POST,
            produces = "application/json;charset=utf-8")
    @ResponseBody
    public String selectCourseTableAll() {
        List<RecordResult> list = courseTableVOService.selectCourse();
        return JSON.toJSONStringWithDateFormat(list,"yyyy-MM-dd");
    }
}
