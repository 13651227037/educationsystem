package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.Enterprise;

import java.util.List;

public interface EnterpriseMapper {
    int deleteByPrimaryKey(Integer enterpriseId);

    int insert(Enterprise record);

    int insertSelective(Enterprise record);

    Enterprise selectByPrimaryKey(Integer enterpriseId);

    int updateByPrimaryKeySelective(Enterprise record);

    int updateByPrimaryKey(Enterprise record);

    List<Enterprise> listEnterprise();
}