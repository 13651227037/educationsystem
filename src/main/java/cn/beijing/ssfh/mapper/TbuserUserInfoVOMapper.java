package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.Department;
import cn.beijing.ssfh.entity.Role;
import cn.beijing.ssfh.entity.State;
import cn.beijing.ssfh.pojo.vo.TbuserUserInfoVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 79414 on 2017/9/25.
 * Author  GuanChengHao
 */
public interface TbuserUserInfoVOMapper {
    /**
     * @Description: 根据userID得到一条信息
     * @Author GuanChengHao
     * @Date 2017/9/28 10:16
     * @version V1.0
     */
    TbuserUserInfoVO getTbuserVOByTbuserId( Integer userId);
    /**
     * @Description: 员工用户的list页面
     * @Author GuanChengHao
     * @Date 2017/9/28 10:16
     * @version V1.0
     */
    List<TbuserUserInfoVO> listTbuserVOList(@Param("tbname")String  tbname);

    /**
     * @Description: 新增需要的 部门,职务,状态的list信息
     * @Author GuanChengHao
     * @Date 2017/9/28 10:16
     * @version V1.0
     */
    List<Department> listDepartment();
    List<Role> listRole();
    List<State> listState();
}
