package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.Tbuser;
import cn.beijing.ssfh.pojo.vo.UserLoginVo;

import java.util.List;
import java.util.Set;

public interface TbuserMapper {
    int deleteByPrimaryKey(Integer tbuserId);

    int insert(Tbuser record);

    int insertSelective(Tbuser record);

    UserLoginVo selectByPrimaryKey(Integer tbuserId);

    int updateByPrimaryKeySelective(Tbuser record);

    int updateByPrimaryKey(Tbuser record);

    Set<String> selectRolesByUsername(String username);

    Set<String> selectPremissionsByUsername(String username);

    Tbuser getTbuserByUsername(String username);

    Set<UserLoginVo> selectByUsername(String username);

    Tbuser addTbuser(Tbuser tbuser);

    List<Tbuser> listTbuser();

    Tbuser selectByUserInfoId(Integer userInfoId);

    Tbuser selectByUserId(Integer userId);
}