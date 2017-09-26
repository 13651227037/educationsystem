package cn.beijing.ssfh.entity;

import java.util.Date;

public class DateTime {
    private Integer dateTimeId;

    private Date dateTime;

    private Integer dateState;

    public Integer getDateTimeId() {
        return dateTimeId;
    }

    public void setDateTimeId(Integer dateTimeId) {
        this.dateTimeId = dateTimeId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getDateState() {
        return dateState;
    }

    public void setDateState(Integer dateState) {
        this.dateState = dateState;
    }
}