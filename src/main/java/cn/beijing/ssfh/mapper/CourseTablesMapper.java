package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.CourseTables;

public interface CourseTablesMapper {
    int deleteByPrimaryKey(Integer courseTablesId);

    int insert(CourseTables record);

    int insertCourseTable(CourseTables courseTables);

    int insertSelective(CourseTables record);

    CourseTables selectByPrimaryKey(Integer courseTablesId);

    int updateByPrimaryKeySelective(CourseTables record);

    int updateByPrimaryKey(CourseTables record);
}