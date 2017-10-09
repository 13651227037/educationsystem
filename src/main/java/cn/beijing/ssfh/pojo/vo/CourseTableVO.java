package cn.beijing.ssfh.pojo.vo;

import java.util.Date;

/**
* @Description: TODO
* @Author bainliqiang
* @Date 2017/9/26 8:31
* @version V1.0
*/

public class CourseTableVO {
    private int courseTablesId;//排课Id
    private int timeRange;//时间范围
    private int dateTimeId;//日期id
    private Date dateTime;//日期
    private String gradeName;//班级名称
    private int gradeNum;//班级人数
    private String gradeCourse;//班级专业
    private Date startTime;//开班时间
    private String gradeState;//班级状态
    private String SteacherName; //老师名字
    private String teacherMajor ;//所教专业
    private String clsssroomName;//教室名称
    private String classroomUse;//教室用途int
    private int dayTimeid;//时间段id
    private String weekName;//周时间
    private String chapterName;//课程名称



    public CourseTableVO() {
    }

    @Override
    public String toString() {
        return "CourseTableVO{" +
                "courseTablesId=" + courseTablesId +
                ", timeRange=" + timeRange +
                ", dateTimeId=" + dateTimeId +
                ", dateTime=" + dateTime +
                ", gradeName='" + gradeName + '\'' +
                ", gradeNum=" + gradeNum +
                ", gradeCourse='" + gradeCourse + '\'' +
                ", startTime=" + startTime +
                ", gradeState='" + gradeState + '\'' +
                ", SteacherName='" + SteacherName + '\'' +
                ", teacherMajor='" + teacherMajor + '\'' +
                ", clsssroomName='" + clsssroomName + '\'' +
                ", classroomUse='" + classroomUse + '\'' +
                ", dayTimeid=" + dayTimeid +
                ", weekName='" + weekName + '\'' +
                ", chapterName='" + chapterName + '\'' +
                ", classroomName='" +
                '}'+"\n";
    }



    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public int getDayTimeid() {
        return dayTimeid;
    }

    public void setDayTimeid(int dayTimeid) {
        this.dayTimeid = dayTimeid;
    }
    public int getCourseTablesId() {
        return courseTablesId;
    }

    public void setCourseTablesId(int courseTablesId) {
        this.courseTablesId = courseTablesId;
    }

    public int getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(int timeRange) {
        this.timeRange = timeRange;
    }

    public int getDateTimeId() {
        return dateTimeId;
    }

    public void setDateTimeId(int dateTimeId) {
        this.dateTimeId = dateTimeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public int getGradeNum() {
        return gradeNum;
    }

    public void setGradeNum(int gradeNum) {
        this.gradeNum = gradeNum;
    }

    public String getGradeCourse() {
        return gradeCourse;
    }

    public void setGradeCourse(String gradeCourse) {
        this.gradeCourse = gradeCourse;
    }

    public Date getStarTime() {
        return startTime;
    }

    public void setStarTime(Date starTime) {
        this.startTime = starTime;
    }

    public String getGradeState() {
        return gradeState;
    }

    public void setGradeState(String gradeState) {
        this.gradeState = gradeState;
    }

    public String getSteacherName() {
        return SteacherName;
    }

    public void setSteacherName(String steacherName) {
        SteacherName = steacherName;
    }

    public String getTeacherMajor() {
        return teacherMajor;
    }

    public void setTeacherMajor(String teacherMajor) {
        this.teacherMajor = teacherMajor;
    }

    public String getClsssroomName() {
        return clsssroomName;
    }

    public void setClsssroomName(String clsssroomName) {
        this.clsssroomName = clsssroomName;
    }

    public String getClassroomUse() {
        return classroomUse;
    }

    public void setClassroomUse(String classroomUse) {
        this.classroomUse = classroomUse;
    }

    public String getWeekName() {
        return weekName;
    }

    public void setWeekName(String weekName) {
        this.weekName = weekName;
    }
}
