package cn.beijing.ssfh.entity;

import java.util.Date;

public class WorkReport {
    private Integer workReportId;

    private Integer userInfoId;

    private String tomorrowWorkPlan;

    private String workReportContent;

    private Date workReportDate;

    private String workingExperience;

    private String reviewWorkReport;

    private Date submitReportTime;

    private Integer reviewStatus;

    private Integer reviewId;

    public Integer getWorkReportId() {
        return workReportId;
    }

    public void setWorkReportId(Integer workReportId) {
        this.workReportId = workReportId;
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

    public String getReviewWorkReport() {
        return reviewWorkReport;
    }

    public void setReviewWorkReport(String reviewWorkReport) {
        this.reviewWorkReport = reviewWorkReport == null ? null : reviewWorkReport.trim();
    }

    public Date getSubmitReportTime() {
        return submitReportTime;
    }

    public void setSubmitReportTime(Date submitReportTime) {
        this.submitReportTime = submitReportTime;
    }

    public Integer getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }
}