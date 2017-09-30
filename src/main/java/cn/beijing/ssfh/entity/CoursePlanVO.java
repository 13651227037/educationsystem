package cn.beijing.ssfh.entity;

/**
 * Created by Administrator on 2017/9/27 0027.
 * Author 武云峰
 */
public class CoursePlanVO {
    private Integer gradeId;
    private Integer schedules;
    private Integer chapterDuration;
    private Integer childId;
    private Integer chapterId;



    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    @Override
    public String toString() {
        return "CoursePlanVO{" +
                "gradeId=" + gradeId +
                ", schedules=" + schedules +
                ", chapterDuration=" + chapterDuration +
                ", childId=" + childId +
                ", chapterId=" + chapterId +
                '}';
    }

    public Integer getSchedules() {
        return schedules;
    }

    public void setSchedules(Integer schedules) {
        this.schedules = schedules;
    }

    public Integer getChapterDuration() {
        return chapterDuration;
    }

    public void setChapterDuration(Integer chapterDuration) {
        this.chapterDuration = chapterDuration;
    }

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public CoursePlanVO() {

    }
}
