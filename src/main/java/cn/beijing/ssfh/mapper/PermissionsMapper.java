package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.Premissions;

public interface PermissionsMapper {
    int deleteByPrimaryKey(Integer permissionsId);

    int insert(Premissions record);

    int insertSelective(Premissions record);

    Premissions selectByPrimaryKey(Integer permissionsId);

    int updateByPrimaryKeySelective(Premissions record);

    int updateByPrimaryKey(Premissions record);
}