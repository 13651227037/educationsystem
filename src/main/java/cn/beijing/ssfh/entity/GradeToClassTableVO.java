package cn.beijing.ssfh.entity;

/**
 * Created by Administrator on 2017/9/25 0025.
 * Author 武云峰
 */
public class GradeToClassTableVO {
    private Integer gradeId;
    private Integer weekName;
    private Integer timePart;
    private Integer classroomId;
    private Integer teacherId;
    private String chapterName;

    @Override
    public String toString() {
        return "GradeToClassTableVO{" +
                "gradeId=" + gradeId +
                ", weekName=" + weekName +
                ", timePart=" + timePart +
                ", classroomId=" + classroomId +
                ", teacherID=" + teacherId +
                ", chapterName='" + chapterName + '\'' +
                '}';
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getWeekName() {
        return weekName;
    }

    public void setWeekName(Integer weekName) {
        this.weekName = weekName;
    }

    public Integer getTimePart() {
        return timePart;
    }

    public void setTimePart(Integer timePart) {
        this.timePart = timePart;
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

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public GradeToClassTableVO() {

    }
}
