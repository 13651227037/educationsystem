package cn.beijing.ssfh.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class GraduationStudentVisitRecord {
    private Integer graduationStudentVisitRecordId;

    private Integer studentId;

    private String reviewContent;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date visitTime;

    public Integer getGraduationStudentVisitRecordId() {
        return graduationStudentVisitRecordId;
    }

    public void setGraduationStudentVisitRecordId(Integer graduationStudentVisitRecordId) {
        this.graduationStudentVisitRecordId = graduationStudentVisitRecordId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent == null ? null : reviewContent.trim();
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }
}