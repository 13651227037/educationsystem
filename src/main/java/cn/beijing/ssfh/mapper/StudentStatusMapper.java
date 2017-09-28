package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.StudentStatus;

public interface StudentStatusMapper {
    int deleteByPrimaryKey(Integer studentStateId);

    int insert(StudentStatus record);

    int insertSelective(StudentStatus record);

    StudentStatus selectByPrimaryKey(Integer studentStateId);

    int updateByPrimaryKeySelective(StudentStatus record);

    int updateByPrimaryKey(StudentStatus record);
}