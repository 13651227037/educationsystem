package cn.beijing.ssfh.services.public_department.public_managerment.impl;



import cn.beijing.ssfh.entity.DepartmentalRole;
import cn.beijing.ssfh.entity.Tbuser;
import cn.beijing.ssfh.entity.UserInfo;
import cn.beijing.ssfh.entity.UserRole;
import cn.beijing.ssfh.mapper.DepartmentalRoleMapper;
import cn.beijing.ssfh.mapper.TbuserMapper;
import cn.beijing.ssfh.mapper.UserInfoMapper;
import cn.beijing.ssfh.mapper.UserRoleMapper;
import cn.beijing.ssfh.pojo.vo.UserLoginVo;
import cn.beijing.ssfh.services.public_department.public_managerment.Userservice;
import cn.beijing.ssfh.util.Md5Utils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * Created by Mr.W on 2017/9/24.
 */
@Service
public class UserserviceImpl implements Userservice {

    @Resource
    private UserInfoMapper userInfoMapper;
    @Resource
    private TbuserMapper tbuserMapper;
    @Resource
    private UserRoleMapper userRoleMapper;
    @Resource
    private DepartmentalRoleMapper departmentalRoleMapper;


    @Override
    public Set<String> getRolesByUsername(String username) {
        System.out.println(tbuserMapper.selectRolesByUsername(username));
        return tbuserMapper.selectRolesByUsername(username);
    }

    @Override
    public Set<String> getPremissionsByUsername(String username) {
        System.out.println(tbuserMapper.selectPremissionsByUsername(username));
        return tbuserMapper.selectPremissionsByUsername(username);
    }

    @Override
    public Tbuser loginByUsername(String username) {
        return tbuserMapper.getTbuserByUsername(username);
    }

    @Override
    public Set<UserLoginVo> selectByUsername(String username) {
        return tbuserMapper.selectByUsername(username);
    }

    @Override
    public int addTbuser(Tbuser tbuser, UserInfo userInfo, UserRole userRole, DepartmentalRole departmentalRole) {
        Integer number_1 = userInfoMapper.insert(userInfo);
        System.out.println(userInfo.getUserInfoId());
        tbuser.setPassword(Md5Utils.encryptPassword(tbuser.getPassword()));
        tbuser.setUserInfoId(userInfo.getUserInfoId());
        Integer number_2 = tbuserMapper.insert(tbuser);
        userRole.setTbuserId(tbuser.getTbuserId());
        Integer number_3 = userRoleMapper.insert(userRole);
        Integer number_4 = departmentalRoleMapper.insert(departmentalRole);
        return number_1+number_2+number_3+number_4;
    }
}
