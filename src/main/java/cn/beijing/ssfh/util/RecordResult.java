package cn.beijing.ssfh.util;

import cn.beijing.ssfh.pojo.vo.CourseTableVO;

import java.util.Date;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/28.
 * Author bianliqiang
 */
public class RecordResult {
    private Date dateTime;//日期
    private String clsssroomName;//教室名称
    private String weekName;//周时间
    private Map<String, CourseTableVO> voMap;//存储分组数据

    public RecordResult() {
    }

    public RecordResult(Date dateTime, String clsssroomName, String weekName, Map<String, CourseTableVO> voMap) {

        this.dateTime = dateTime;
        this.clsssroomName = clsssroomName;
        this.weekName = weekName;
        this.voMap = voMap;
    }

    @Override
    public String toString() {
        return "RecordResult{" +
                "dateTime=" + dateTime +
                ", clsssroomName='" + clsssroomName + '\'' +
                ", weekName='" + weekName + '\'' +
                ", voMap=" + voMap +
                '}';
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getClsssroomName() {
        return clsssroomName;
    }

    public void setClsssroomName(String clsssroomName) {
        this.clsssroomName = clsssroomName;
    }

    public String getWeekName() {
        return weekName;
    }

    public void setWeekName(String weekName) {
        this.weekName = weekName;
    }

    public Map<String, CourseTableVO> getVoMap() {
        return voMap;
    }

    public void setVoMap(Map<String, CourseTableVO> voMap) {
        this.voMap = voMap;
    }
}
