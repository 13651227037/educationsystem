package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.EnterpriseTeacher;

public interface EnterpriseTeacherMapper {
    int deleteByPrimaryKey(Integer enterpriseTeacherId);

    int insert(EnterpriseTeacher record);

    int insertSelective(EnterpriseTeacher record);

    EnterpriseTeacher selectByPrimaryKey(Integer enterpriseTeacherId);

    int updateByPrimaryKeySelective(EnterpriseTeacher record);

    int updateByPrimaryKey(EnterpriseTeacher record);

    EnterpriseTeacher selectByEnterPriseId(Integer enterPriseid);
}