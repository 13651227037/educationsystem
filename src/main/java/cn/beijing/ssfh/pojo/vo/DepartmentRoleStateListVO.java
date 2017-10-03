package cn.beijing.ssfh.pojo.vo;

import cn.beijing.ssfh.entity.Department;
import cn.beijing.ssfh.entity.Role;
import cn.beijing.ssfh.entity.State;

import java.util.List;

/**
 * Created by 79414 on 2017/9/28.
 * Author  GuanChengHao
 */
public class DepartmentRoleStateListVO {
    private List<Department> department;
    private List<Role> role;
    private List<State> state;

    @Override
    public String toString() {
        return "DepartmentRoleStateListVO{" +
                "department=" + department +
                ", role=" + role +
                ", state=" + state +
                '}';
    }

    public List<Department> getDepartment() {
        return department;
    }

    public void setDepartment(List<Department> department) {
        this.department = department;
    }

    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

    public List<State> getState() {
        return state;
    }

    public void setState(List<State> state) {
        this.state = state;
    }

    public DepartmentRoleStateListVO(List<Department> department, List<Role> role, List<State> state) {

        this.department = department;
        this.role = role;
        this.state = state;
    }

    public DepartmentRoleStateListVO() {

    }
}
