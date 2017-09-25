package cn.beijing.ssfh.services;

import cn.beijing.ssfh.entity.Tbuser;
import cn.beijing.ssfh.pojo.vo.UserLoginVo;

import java.util.Set;

/**
 * Created by Mr.W on 2017/9/24.
 */
public interface Userservice {

    Set<String> getRolesByUsername(String username);

    Set<String> getPremissionsByUsername(String username);

    Tbuser loginByUsername(String username);
    Set<UserLoginVo> selectByUsername(String username);

}
