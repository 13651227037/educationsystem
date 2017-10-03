package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.Grade;

import java.util.List;

public interface GradeMapper {
    int deleteByPrimaryKey(Integer gradeId);

    int insert(Grade record);

    int insertSelective(Grade record);

    Grade selectByPrimaryKey(Integer gradeId);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
    //查询所有班级信息
    List<Grade> listAllGrade();
}