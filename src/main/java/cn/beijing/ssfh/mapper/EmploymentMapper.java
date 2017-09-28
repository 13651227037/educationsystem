package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.Employment;

import java.util.List;

public interface EmploymentMapper {
    int deleteByPrimaryKey(Integer employmentId);

    int insert(Employment record);

    int insertSelective(Employment record);

    Employment selectByPrimaryKey(Integer employmentId);

    int updateByPrimaryKeySelective(Employment record);

    int updateByPrimaryKey(Employment record);

    List<Employment> listEmploymemtAll();
}