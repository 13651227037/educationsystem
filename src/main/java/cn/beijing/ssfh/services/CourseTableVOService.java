package cn.beijing.ssfh.services;

import cn.beijing.ssfh.entity.CourseTables;
import cn.beijing.ssfh.pojo.vo.CourseTableVO;
import cn.beijing.ssfh.util.RecordResult;

import java.util.List;

/**
 * Created by Administrator on 2017/9/26.
 * Author bianliqiang
 */
public interface CourseTableVOService {
    int deleteByPrimaryKey(Integer courseTablesId);

    int insert(CourseTables record);

    int insertSelective(CourseTables record);

    List<CourseTableVO> selectByPrimaryKey(Integer courseTablesId);

    List<RecordResult> selectCourse();

    int updateByPrimaryKeySelective(CourseTables record);

    int updateByPrimaryKey(CourseTables record);
}
