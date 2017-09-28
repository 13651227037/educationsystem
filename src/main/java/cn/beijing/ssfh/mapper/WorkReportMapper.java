package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.WorkReport;

import java.util.List;

public interface WorkReportMapper {
    int deleteByPrimaryKey(Integer workReportId);

    int insert(WorkReport record);

    int insertSelective(WorkReport record);

    WorkReport selectByPrimaryKey(Integer workReportId);

    int updateByPrimaryKeySelective(WorkReport record);

    int updateByPrimaryKey(WorkReport record);

    List<WorkReport> listWorkReport();

    WorkReport selectByUserInfoIdAndNearByNow(Integer userInfoId);
}