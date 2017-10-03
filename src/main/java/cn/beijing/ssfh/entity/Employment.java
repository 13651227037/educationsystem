package cn.beijing.ssfh.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Employment {
    private Integer employmentId;

    private Integer studentId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEmployment;

    private String employmentEnterprise;

    private String jobs;

    private String salary;

    private String workAddress;

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
        this.employmentEnterprise = employmentEnterprise == null ? null : employmentEnterprise.trim();
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs == null ? null : jobs.trim();
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress == null ? null : workAddress.trim();
    }
}