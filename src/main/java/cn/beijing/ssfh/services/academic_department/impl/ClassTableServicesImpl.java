package cn.beijing.ssfh.services.academic_department.impl;

import cn.beijing.ssfh.entity.CoursePlanVO;
import cn.beijing.ssfh.entity.CourseTables;
import cn.beijing.ssfh.entity.DateTime;
import cn.beijing.ssfh.entity.GradeToClassTableVO;
import cn.beijing.ssfh.mapper.CoursePlanVOMapper;
import cn.beijing.ssfh.mapper.CourseTablesMapper;
import cn.beijing.ssfh.mapper.DateTimeMapper;
import cn.beijing.ssfh.mapper.GradeToClassTableMapper;
import cn.beijing.ssfh.services.academic_department.ClassTableServices;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/9/25 0025.
 * Author 武云峰
 */
@Service
public class ClassTableServicesImpl implements ClassTableServices {
    @Inject
    private GradeToClassTableMapper gradeToClassTableMapper;
    @Inject
    private DateTimeMapper dateTimeMapper;
    @Inject
    private CourseTablesMapper courseTablesMapper;
    @Inject
    private CoursePlanVOMapper coursePlanVOMapper;

    @Override
    public Integer saveClassTable() {
        int returnData=0;
        List<GradeToClassTableVO> list = gradeToClassTableMapper.queryAllClass();
        Calendar calendar=this.getStartDate();
        //去除假期排课
        for(int dateIndex=1;dateIndex<8;dateIndex++) {
            DateTime dateTime=dateTimeMapper.selectByDate(calendar.getTime());
            if (dateTime.getDateState() != 1) {
                Iterator<GradeToClassTableVO> it=list.iterator();
                while (it.hasNext()) {
                    GradeToClassTableVO gradeToClassTableVO=it.next();
                    if (gradeToClassTableVO.getWeekName() .equals(dateIndex)) {
                        it.remove();
                    }
                }
            }
            calendar.add(Calendar.DATE,1);
        }

        //写入数据库
        for (GradeToClassTableVO vo : list) {
            CoursePlanVO coursePlanVO=coursePlanVOMapper.selectCoursePlanVO(vo.getGradeId());
            for(int i=0;i<2;i++){
                //  课表上课对应时间=周一日期+班级循环星期-1
            Calendar calendarForCourseTable=this.getStartDate();
            calendarForCourseTable.add(Calendar.DATE,vo.getWeekName()-1);
            DateTime dateTime=new DateTime();
            dateTime.setDateTime(calendarForCourseTable.getTime());
            dateTime.setDateTimeId(dateTimeMapper.selectByDate(calendarForCourseTable.getTime()).getDateTimeId());
            CourseTables courseTables=new CourseTables();
            courseTables.setClassroomId(vo.getClassroomId());
            courseTables.setGradeId(vo.getGradeId());
            courseTables.setTeacherId(vo.getTeacherId());
            courseTables.setChapterName(vo.getChapterName());
            courseTables.setDateTimeId(dateTime.getDateTimeId());
            courseTables.setDayTimeId(vo.getTimePart()+i);
            //课表数据库插入
            courseTablesMapper.insertCourseTable(courseTables);
            //修改课表对应时期状态为：3-已排课
            dateTime.setDateState(3);
            dateTime.setDateTime(calendarForCourseTable.getTime());
            dateTimeMapper.updateByPrimaryKey(dateTime);
            coursePlanVO.setSchedules(coursePlanVO.getSchedules()+1);
                //判断课程是否上完
                if (coursePlanVO.getSchedules() > coursePlanVO.getChapterDuration()) {
                    coursePlanVO.setChapterId(coursePlanVO.getChildId());
                    coursePlanVO.setSchedules(1);
                }
                //修改进度表(推进)
               coursePlanVOMapper.updateCoursePlan(coursePlanVO);
            returnData++;
            }
        }
        return returnData;
    }
    /**
    * @Description: 获取开始时间(下周一)方法
    * @Author 武云峰
    * @Date 2017/9/25 0025 18:42
    * @version V1.0
    */
    public Calendar getStartDate() {
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(new Date());
        for(int i=0;i<7;i++) {
            calendar.add(Calendar.DATE,1);
            if(calendar.get(Calendar.DAY_OF_WEEK)==2) break;
        }
        return calendar;
    }

    /**
     * @Description: 写下星期日期和状态到数据库
     * @Author 武云峰
     * @Date 2017/9/26 0026 10:14
     * @version V1.0
     */
    public Integer saveNextWeekDateTime(List<DateTime> dates) {
        Integer i=0;
        for (DateTime date : dates) {
            if (dateTimeMapper.selectByDate(date.getDateTime()) == null) {
                dateTimeMapper.insert(date);
                i++;
            }
        }
        return i;
    }
}
