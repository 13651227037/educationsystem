package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.Weeks;

public interface WeeksMapper {
    int deleteByPrimaryKey(Integer weekId);

    int insert(Weeks record);

    int insertSelective(Weeks record);

    Weeks selectByPrimaryKey(Integer weekId);

    int updateByPrimaryKeySelective(Weeks record);

    int updateByPrimaryKey(Weeks record);
}