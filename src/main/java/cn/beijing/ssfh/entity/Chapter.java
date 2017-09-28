package cn.beijing.ssfh.entity;

public class Chapter {
    private Integer chapterId;

    private Integer studyPartsId;

    private String chapterName;

    private Integer chapterDuration;

    private Integer childId;

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getStudyPartsId() {
        return studyPartsId;
    }

    public void setStudyPartsId(Integer studyPartsId) {
        this.studyPartsId = studyPartsId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName == null ? null : chapterName.trim();
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
}