package cn.beijing.ssfh.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Grade {
    private Integer gradeId;

    private Integer stateId;

    private String gradeNum;

    private String gradeName;

    private Integer gradeSize;

    private String gradeCourse;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startTime;

    private Integer classroomId;

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getGradeNum() {
        return gradeNum;
    }

    public void setGradeNum(String gradeNum) {
        this.gradeNum = gradeNum == null ? null : gradeNum.trim();
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    public Integer getGradeSize() {
        return gradeSize;
    }

    public void setGradeSize(Integer gradeSize) {
        this.gradeSize = gradeSize;
    }

    public String getGradeCourse() {
        return gradeCourse;
    }

    public void setGradeCourse(String gradeCourse) {
        this.gradeCourse = gradeCourse == null ? null : gradeCourse.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {

        this.classroomId = classroomId;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeId=" + gradeId +
                ", stateId=" + stateId +
                ", gradeNum='" + gradeNum + '\'' +
                ", gradeName='" + gradeName + '\'' +
                ", gradeSize=" + gradeSize +
                ", gradeCourse='" + gradeCourse + '\'' +
                ", startTime=" + startTime +
                ", classroomId=" + classroomId +
                '}';
    }
}