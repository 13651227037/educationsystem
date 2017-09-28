package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userInfoId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userInfoId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);


}