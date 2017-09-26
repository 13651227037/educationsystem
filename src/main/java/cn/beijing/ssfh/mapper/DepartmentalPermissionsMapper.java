package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.DepartmentalPermissions;

public interface DepartmentalPermissionsMapper {
    int deleteByPrimaryKey(Integer departmentalPermissionsId);

    int insert(DepartmentalPermissions record);

    int insertSelective(DepartmentalPermissions record);

    DepartmentalPermissions selectByPrimaryKey(Integer departmentalPermissionsId);

    int updateByPrimaryKeySelective(DepartmentalPermissions record);

    int updateByPrimaryKey(DepartmentalPermissions record);
}