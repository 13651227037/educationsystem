package cn.beijing.ssfh.entity;

import java.util.Date;

public class Employment {
    private Integer employmentId;

    private Integer studentId;

    private Date dateEmployment;

    private String employmentEnterprise;

    private String jobs;

    private String salary;

    private String workAddress;

    private Integer userId;

    public Integer getEmploymentId() {
        return employmentId;
    }

    public void setEmploymentId(Integer employmentId) {
        this.employmentId = employmentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Date getDateEmployment() {
        return dateEmployment;
    }

    public void setDateEmployment(Date dateEmployment) {
        this.dateEmployment = dateEmployment;
    }

    public String getEmploymentEnterprise() {
        return employmentEnterprise;
    }

    public void setEmploymentEnterprise(String employmentEnterprise) {
        this.employmentEnterprise = employmentEnterprise;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Employment{" +
                "employmentId=" + employmentId +
                ", studentId=" + studentId +
                ", dateEmployment=" + dateEmployment +
                ", employmentEnterprise='" + employmentEnterprise + '\'' +
                ", jobs='" + jobs + '\'' +
                ", salary='" + salary + '\'' +
                ", workAddress='" + workAddress + '\'' +
                ", userId=" + userId +
                '}';
    }

    public Employment(Integer employmentId, Integer studentId, Date dateEmployment, String employmentEnterprise, String jobs, String salary, String workAddress, Integer userId) {
        this.employmentId = employmentId;
        this.studentId = studentId;
        this.dateEmployment = dateEmployment;
        this.employmentEnterprise = employmentEnterprise;
        this.jobs = jobs;
        this.salary = salary;
        this.workAddress = workAddress;
        this.userId = userId;
    }

    public Employment() {

    }
}