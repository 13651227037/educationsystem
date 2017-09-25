package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.Tbuser;
import cn.beijing.ssfh.pojo.vo.UserLoginVo;

import java.util.Set;

public interface TbuserMapper {
    int deleteByPrimaryKey(Integer tbuserId);

    int insert(Tbuser record);

    int insertSelective(Tbuser record);

    Set<UserLoginVo> selectByPrimaryKey(Integer tbuserId);

    int updateByPrimaryKeySelective(Tbuser record);

    int updateByPrimaryKey(Tbuser record);

    Set<UserLoginVo> selectByUsername(String username);

    Tbuser getTbuserByUsername(String username);

    Set<String> selectRolesByUsername(String username);

    Set<String> selectPremissionsByUsername(String username);
}