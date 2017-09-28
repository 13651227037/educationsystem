package cn.beijing.ssfh.entity;

import java.util.Date;

public class TestInformation {
    private Integer testInformationId;

    private Integer gradeId;

    private Integer classroomId;

    private Integer teacherId;

    private Integer testType;

    private Date testTime;

    private Integer ectualAttendance;

    private Integer testPaperId;

    public Integer getTestInformationId() {
        return testInformationId;
    }

    public void setTestInformationId(Integer testInformationId) {
        this.testInformationId = testInformationId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getTestType() {
        return testType;
    }

    public void setTestType(Integer testType) {
        this.testType = testType;
    }

    public Date getTestTime() {
        return testTime;
    }

    public void setTestTime(Date testTime) {
        this.testTime = testTime;
    }

    public Integer getEctualAttendance() {
        return ectualAttendance;
    }

    public void setEctualAttendance(Integer ectualAttendance) {
        this.ectualAttendance = ectualAttendance;
    }

    public Integer getTestPaperId() {
        return testPaperId;
    }

    public void setTestPaperId(Integer testPaperId) {
        this.testPaperId = testPaperId;
    }
}