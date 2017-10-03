package cn.beijing.ssfh.services.teaching_department.teacher_management;

import cn.beijing.ssfh.entity.Tbuser;
import cn.beijing.ssfh.entity.Teacher;
import cn.beijing.ssfh.entity.UserInfo;
import cn.beijing.ssfh.entity.UserRole;
import cn.beijing.ssfh.pojo.vo.DepartmentRoleStateListVO;
import cn.beijing.ssfh.pojo.vo.TbuserUserInfoVO;
import cn.beijing.ssfh.util.PageUtil;

/**
 * Created by 79414 on 2017/9/25.
 * Author  GuanChengHao
 */
public interface TbuserUserInfoVOService {
    /**
    * @Description: 根据用户ID查询用户老师的所有信息
    * @Author GuanChengHao
    * @Date 2017/9/26 16:36
    * @version V1.0
    */
    TbuserUserInfoVO getTbuserVOByTbuserId(Integer userId);
    /**
    * @Description: 查询用户老师的所有信息
    * @Author GuanChengHao
    * @Date 2017/9/26 16:37
    * @version V1.0
    */

    PageUtil<TbuserUserInfoVO> listTbuserVOList(Integer page, Integer rows,String  tbname);
    /**
    * @Description: 修改密码
    * @Author GuanChengHao
    * @Date 2017/9/26 16:38
    * @version V1.0
    */

    Integer updateByPrimaryKeySelective(Tbuser record);

    /**
     * @Description: 新增需要的 部门,职务,状态的list信息
     * @Author GuanChengHao
     * @Date 2017/9/28 10:16
     * @version V1.0
     */
    DepartmentRoleStateListVO listDepartmentRoleStateVO();

    /**
     * @Description: 修改老师用户信息
     * @Author GuanChengHao
     * @Date 2017/9/28 18:03
     * @version V1.0
     */
    Integer updateTbuserInfoVO(UserInfo userInfo, Tbuser tbuser, UserRole userRole, Teacher teacher);

}
