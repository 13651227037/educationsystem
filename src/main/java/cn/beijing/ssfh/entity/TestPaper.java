package cn.beijing.ssfh.entity;

import java.util.Date;

public class TestPaper {
    private Integer testPaperId;

    private Integer teacherId;

    private String testPaperUrl;

    private String testPaperName;

    private Date createTime;

    private String details;

    public Integer getTestPaperId() {
        return testPaperId;
    }

    public void setTestPaperId(Integer testPaperId) {
        this.testPaperId = testPaperId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTestPaperUrl() {
        return testPaperUrl;
    }

    public void setTestPaperUrl(String testPaperUrl) {
        this.testPaperUrl = testPaperUrl == null ? null : testPaperUrl.trim();
    }

    public String getTestPaperName() {
        return testPaperName;
    }

    public void setTestPaperName(String testPaperName) {
        this.testPaperName = testPaperName == null ? null : testPaperName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }
}