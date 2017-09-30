package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.DateTime;

import java.util.Date;

public interface DateTimeMapper {
    int deleteByPrimaryKey(Integer dateTimeId);

    int insert(DateTime record);

    int insertSelective(DateTime record);

    DateTime selectByPrimaryKey(Integer dateTimeId);

    int updateByPrimaryKeySelective(DateTime record);

    int updateByPrimaryKey(DateTime record);

    DateTime selectByDate(Date date);
    Integer updateStateByDate(DateTime date);
}