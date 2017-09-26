package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.TestScore;

public interface TestScoreMapper {
    int deleteByPrimaryKey(Integer testScoreId);

    int insert(TestScore record);

    int insertSelective(TestScore record);

    TestScore selectByPrimaryKey(Integer testScoreId);

    int updateByPrimaryKeySelective(TestScore record);

    int updateByPrimaryKey(TestScore record);
}