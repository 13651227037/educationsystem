package cn.beijing.ssfh.entity;

import java.util.Date;

public class TestScore {
    private Integer testScoreId;

    private Integer testPaperId;

    private Integer studentId;

    private Double score;

    private Date testTime;

    private Integer testInformationId;

    public Integer getTestScoreId() {
        return testScoreId;
    }

    public void setTestScoreId(Integer testScoreId) {
        this.testScoreId = testScoreId;
    }

    public Integer getTestPaperId() {
        return testPaperId;
    }

    public void setTestPaperId(Integer testPaperId) {
        this.testPaperId = testPaperId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Date getTestTime() {
        return testTime;
    }

    public void setTestTime(Date testTime) {
        this.testTime = testTime;
    }

    public Integer getTestInformationId() {
        return testInformationId;
    }

    public void setTestInformationId(Integer testInformationId) {
        this.testInformationId = testInformationId;
    }
}