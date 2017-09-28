package cn.beijing.ssfh.entity;

import java.util.Date;

public class WorkReportDraft {
    private Integer workReportDraftId;

    private Integer userInfoId;

    private String tomorrowWorkPlan;

    private String workReportContent;

    private Date workReportDate;

    private String workingExperience;

    public Integer getWorkReportDraftId() {
        return workReportDraftId;
    }

    public void setWorkReportDraftId(Integer workReportDraftId) {
        this.workReportDraftId = workReportDraftId;
    }

    public Integer getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Integer userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getTomorrowWorkPlan() {
        return tomorrowWorkPlan;
    }

    public void setTomorrowWorkPlan(String tomorrowWorkPlan) {
        this.tomorrowWorkPlan = tomorrowWorkPlan == null ? null : tomorrowWorkPlan.trim();
    }

    public String getWorkReportContent() {
        return workReportContent;
    }

    public void setWorkReportContent(String workReportContent) {
        this.workReportContent = workReportContent == null ? null : workReportContent.trim();
    }

    public Date getWorkReportDate() {
        return workReportDate;
    }

    public void setWorkReportDate(Date workReportDate) {
        this.workReportDate = workReportDate;
    }

    public String getWorkingExperience() {
        return workingExperience;
    }

    public void setWorkingExperience(String workingExperience) {
        this.workingExperience = workingExperience == null ? null : workingExperience.trim();
    }
}