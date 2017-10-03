package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.Employment;

public interface EmploymentMapper {
    int deleteByPrimaryKey(Integer employmentId);

    int insert(Employment record);

    int insertSelective(Employment record);

    Employment selectByPrimaryKey(Integer employmentId);
    //修改就业信息，也是修改学生就业信息
    int updateByPrimaryKeySelective(Employment record);

    int updateByPrimaryKey(Employment record);
}