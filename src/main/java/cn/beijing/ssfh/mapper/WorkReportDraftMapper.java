package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.WorkReportDraft;

public interface WorkReportDraftMapper {
    int deleteByPrimaryKey(Integer workReportDraftId);

    int insert(WorkReportDraft record);

    int insertSelective(WorkReportDraft record);

    WorkReportDraft selectByPrimaryKey(Integer workReportDraftId);

    int updateByPrimaryKeySelective(WorkReportDraft record);

    int updateByPrimaryKey(WorkReportDraft record);
}