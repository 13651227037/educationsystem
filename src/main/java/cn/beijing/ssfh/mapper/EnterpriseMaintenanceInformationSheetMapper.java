package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.EnterpriseMaintenanceInformationSheet;

public interface EnterpriseMaintenanceInformationSheetMapper {
    int deleteByPrimaryKey(Integer enterpriseMaintenanceInformationSheetId);

    int insert(EnterpriseMaintenanceInformationSheet record);

    int insertSelective(EnterpriseMaintenanceInformationSheet record);

    EnterpriseMaintenanceInformationSheet selectByPrimaryKey(Integer enterpriseMaintenanceInformationSheetId);

    int updateByPrimaryKeySelective(EnterpriseMaintenanceInformationSheet record);

    int updateByPrimaryKey(EnterpriseMaintenanceInformationSheet record);

    EnterpriseMaintenanceInformationSheet selectByEnterPriseIdNearByNow(Integer Enterpriseid);
}