package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.CoursePlanVO;

/**
 * Created by Administrator on 2017/9/27 0027.
 * Author 武云峰
 */
public interface CoursePlanVOMapper {
    CoursePlanVO selectCoursePlanVO(Integer gradeId);
    Integer updateCoursePlan(CoursePlanVO coursePlanVO);
}
