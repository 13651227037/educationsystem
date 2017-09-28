package cn.beijing.ssfh.entity;

import java.util.Date;

/**
 * @author WangJian
 * @create 2017-09-26 下午 9:39
 **/
public class SystemMessage {
    Integer id;
    Integer userId;
    Date happenTime;
    String messageDetails;
    Integer isRead;

    @Override
    public String toString() {
        return "SystemMessage{" +
                "id=" + id +
                ", userId=" + userId +
                ", happenTime=" + happenTime +
                ", messageDetails='" + messageDetails + '\'' +
                ", isRead=" + isRead +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getHappenTime() {
        return happenTime;
    }

    public void setHappenTime(Date happenTime) {
        this.happenTime = happenTime;
    }

    public String getMessageDetails() {
        return messageDetails;
    }

    public void setMessageDetails(String messageDetails) {
        this.messageDetails = messageDetails;
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public SystemMessage(Integer id, Integer userId, Date happenTime, String messageDetails, Integer isRead) {

        this.id = id;
        this.userId = userId;
        this.happenTime = happenTime;
        this.messageDetails = messageDetails;
        this.isRead = isRead;
    }

    public SystemMessage() {

    }
}
