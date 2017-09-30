package cn.beijing.ssfh.entity;

public class CourseTables {
    private Integer courseTablesId;

    private Integer dayTimeId;

    private Integer classroomId;

    private Integer gradeId;

    private Integer dateTimeId;

    private Integer teacherId;

    private String chapterName;

    public Integer getCourseTablesId() {
        return courseTablesId;
    }

    public void setCourseTablesId(Integer courseTablesId) {
        this.courseTablesId = courseTablesId;
    }

    public Integer getDayTimeId() {
        return dayTimeId;
    }

    public void setDayTimeId(Integer dayTimeId) {
        this.dayTimeId = dayTimeId;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getDateTimeId() {
        return dateTimeId;
    }

    public void setDateTimeId(Integer dateTimeId) {
        this.dateTimeId = dateTimeId;
    }

    @Override
    public String toString() {
        return "CourseTables{" +
                "courseTablesId=" + courseTablesId +
                ", dayTimeId=" + dayTimeId +
                ", classroomId=" + classroomId +
                ", gradeId=" + gradeId +
                ", dateTimeId=" + dateTimeId +
                ", teacherId='" + teacherId + '\'' +
                ", chapterName='" + chapterName + '\'' +
                '}';
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName == null ? null : chapterName.trim();
    }
}