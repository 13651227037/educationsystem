package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.Tbuser;

public interface TbuserMapper {
    int deleteByPrimaryKey(Integer tbuserId);

    int insert(Tbuser record);

    int insertSelective(Tbuser record);

    Tbuser selectByPrimaryKey(Integer tbuserId);

    int updateByPrimaryKeySelective(Tbuser record);

    int updateByPrimaryKey(Tbuser record);

    
}