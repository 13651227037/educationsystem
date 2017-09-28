package cn.beijing.ssfh.entity;

/**
 * @author WangJian
 * @create 2017-09-26 下午 11:28
 **/
public class TbuserTeacher {
    private  Integer id;
    private  Integer tbuserId;
    private  Integer teacherId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTbuserId() {
        return tbuserId;
    }

    public void setTbuserId(Integer tbuserId) {
        this.tbuserId = tbuserId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "TbuserTeacher{" +
                "id=" + id +
                ", tbuserId=" + tbuserId +
                ", teacherId=" + teacherId +
                '}';
    }

    public TbuserTeacher(Integer id, Integer tbuserId, Integer teacherId) {
        this.id = id;
        this.tbuserId = tbuserId;
        this.teacherId = teacherId;
    }

    public TbuserTeacher() {

    }
}
