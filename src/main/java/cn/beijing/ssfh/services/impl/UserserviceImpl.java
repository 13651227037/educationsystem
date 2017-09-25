package cn.beijing.ssfh.services.impl;

import cn.beijing.ssfh.entity.Premissions;
import cn.beijing.ssfh.entity.Role;
import cn.beijing.ssfh.entity.Tbuser;
import cn.beijing.ssfh.mapper.TbuserMapper;
import cn.beijing.ssfh.pojo.vo.UserLoginVo;
import cn.beijing.ssfh.services.Userservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * Created by Mr.W on 2017/9/24.
 */
@Service
public class UserserviceImpl implements Userservice {


    @Resource
    private TbuserMapper tbuserMapper;


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
        return tbuserMapper.loginByUsername(username);
    }

    @Override
    public Set<UserLoginVo> selectByUsername(String username) {
        return tbuserMapper.selectByUsername(username);
    }
}
