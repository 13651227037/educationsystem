package cn.beijing.ssfh.entity;

import java.util.Date;

public class EnterpriseMaintenanceInformationSheet {
    private Integer enterpriseMaintenanceInformationSheetId;

    private Integer enterpriseId;

    private Date timeOfReturnVisit;

    private String returnToThePerson;

    private String returnToTheContent;

    @Override
    public String toString() {
        return "EnterpriseMaintenanceInformationSheet{" +
                "enterpriseMaintenanceInformationSheetId=" + enterpriseMaintenanceInformationSheetId +
                ", enterpriseId=" + enterpriseId +
                ", timeOfReturnVisit=" + timeOfReturnVisit +
                ", returnToThePerson='" + returnToThePerson + '\'' +
                ", returnToTheContent='" + returnToTheContent + '\'' +
                '}';
    }

    public Integer getEnterpriseMaintenanceInformationSheetId() {
        return enterpriseMaintenanceInformationSheetId;
    }

    public void setEnterpriseMaintenanceInformationSheetId(Integer enterpriseMaintenanceInformationSheetId) {
        this.enterpriseMaintenanceInformationSheetId = enterpriseMaintenanceInformationSheetId;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Date getTimeOfReturnVisit() {
        return timeOfReturnVisit;
    }

    public void setTimeOfReturnVisit(Date timeOfReturnVisit) {
        this.timeOfReturnVisit = timeOfReturnVisit;
    }

    public String getReturnToThePerson() {
        return returnToThePerson;
    }

    public void setReturnToThePerson(String returnToThePerson) {
        this.returnToThePerson = returnToThePerson == null ? null : returnToThePerson.trim();
    }

    public String getReturnToTheContent() {
        return returnToTheContent;
    }

    public void setReturnToTheContent(String returnToTheContent) {
        this.returnToTheContent = returnToTheContent == null ? null : returnToTheContent.trim();
    }
}