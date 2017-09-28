package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.Teacher;
import cn.beijing.ssfh.entity.UserRole;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer teacherId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer teacherId);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    UserRole getRoleUserByTeacherId(Integer teacherId);
}