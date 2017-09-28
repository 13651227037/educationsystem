package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.TestInformation;

public interface TestInformationMapper {
    int deleteByPrimaryKey(Integer testInformationId);

    int insert(TestInformation record);

    int insertSelective(TestInformation record);

    TestInformation selectByPrimaryKey(Integer testInformationId);

    int updateByPrimaryKeySelective(TestInformation record);

    int updateByPrimaryKey(TestInformation record);
}