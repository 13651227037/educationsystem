package cn.beijing.ssfh.pojo.vo;

import cn.beijing.ssfh.entity.*;

/**
 * Created by 79414 on 2017/9/25.
 * Author  GuanChengHao
 */
public class TbuserUserInfoVO {
    private Tbuser tbuser;
    private UserInfo userInfo;
    private Teacher teacher;
    private UserRole userRole;
    private Role role;
    private Address address;
    private State state;

    @Override
    public String toString() {
        return "TbuserUserInfoVO{" +
                "tbuser=" + tbuser +
                ", userInfo=" + userInfo +
                ", teacher=" + teacher +
                ", userRole=" + userRole +
                ", role=" + role +
                ", address=" + address +
                ", state=" + state +
                '}';
    }

    public Tbuser getTbuser() {
        return tbuser;
    }

    public void setTbuser(Tbuser tbuser) {
        this.tbuser = tbuser;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public TbuserUserInfoVO(Tbuser tbuser, UserInfo userInfo, Teacher teacher, UserRole userRole, Role role, Address address, State state) {

        this.tbuser = tbuser;
        this.userInfo = userInfo;
        this.teacher = teacher;
        this.userRole = userRole;
        this.role = role;
        this.address = address;
        this.state = state;
    }

    public TbuserUserInfoVO() {

    }
}
