package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.TbuserTeacher;

/**
 * @author WangJian
 * @create 2017-09-26 下午 11:29
 **/
public interface TbuserTeacherMapper {
    TbuserTeacher selectByTeaherId(Integer teacherId);
}
