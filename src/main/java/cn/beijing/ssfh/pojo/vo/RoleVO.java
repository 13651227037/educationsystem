package cn.beijing.ssfh.pojo.vo;

import cn.beijing.ssfh.entity.Premissions;

import java.util.List;

/**
 * Created by Mr.W on 2017/9/24.
 */
public class RoleVO {

    private Integer id;
    private String roleName;
    private List<Premissions> list;

    public RoleVO() {
    }

    @Override
    public String toString() {
        return "RoleVO{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", list=" + list +
                '}';
    }

    public RoleVO(Integer id, String roleName, List<Premissions> list) {
        this.id = id;
        this.roleName = roleName;
        this.list = list;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Premissions> getList() {
        return list;
    }

    public void setList(List<Premissions> list) {
        this.list = list;
    }
}
