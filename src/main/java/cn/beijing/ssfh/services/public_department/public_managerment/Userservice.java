package cn.beijing.ssfh.services.public_department.public_managerment;

import cn.beijing.ssfh.entity.*;
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

    int insertTbuser(UserInfo userInfo,Tbuser tbuser, UserRole userRole,Teacher teacher);

    int deleteTbuser(Tbuser tbuser);

    int updateTbuser(Tbuser tbuser);
}
