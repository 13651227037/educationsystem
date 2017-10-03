package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.GraduationStudentVisitRecord;

public interface GraduationStudentVisitRecordMapper {
    int deleteByPrimaryKey(Integer graduationStudentVisitRecordId);

    int insert(GraduationStudentVisitRecord record);
    //新增学生回访,也是添加回访信息
    int insertSelective(GraduationStudentVisitRecord record);

    GraduationStudentVisitRecord selectByPrimaryKey(Integer graduationStudentVisitRecordId);

    int updateByPrimaryKeySelective(GraduationStudentVisitRecord record);

    int updateByPrimaryKey(GraduationStudentVisitRecord record);
}