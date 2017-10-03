package cn.beijing.ssfh.services.teaching_department.teacher_management.impl;

import cn.beijing.ssfh.entity.Tbuser;
import cn.beijing.ssfh.entity.Teacher;
import cn.beijing.ssfh.entity.UserInfo;
import cn.beijing.ssfh.entity.UserRole;
import cn.beijing.ssfh.mapper.*;
import cn.beijing.ssfh.pojo.vo.DepartmentRoleStateListVO;
import cn.beijing.ssfh.pojo.vo.TbuserUserInfoVO;
import cn.beijing.ssfh.services.teaching_department.teacher_management.TbuserUserInfoVOService;
import cn.beijing.ssfh.util.Md5Utils;
import cn.beijing.ssfh.util.PageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by 79414 on 2017/9/25.
 * Author  GuanChengHao
 */
@Service
public class TbuserUserInfoVOServiceImpl implements TbuserUserInfoVOService {
    @Inject
    private TbuserUserInfoVOMapper tbuserUserInfoVOMapper;
    @Inject
    private TbuserMapper tbuserMapper;
    @Inject
    private RoleMapper roleMapper;
    @Inject
    private StateMapper stateMapper;
    @Inject
    private UserInfoMapper userInfoMapper;
    @Inject
    private UserRoleMapper userRoleMapper;
    @Inject
    private TeacherMapper teacherMapper;

    /**
     * @Description: 根据用户ID查询用户老师的一条信息
     * @Author GuanChengHao
     * @Date 2017/9/26 16:36
     * @version V1.0
     */

    @Override
    public TbuserUserInfoVO getTbuserVOByTbuserId(Integer userId) {
        return tbuserUserInfoVOMapper.getTbuserVOByTbuserId(userId);
    }
    /**
     * @Description: 查询用户老师的所有信息
     * @Author GuanChengHao
     * @Date 2017/9/26 16:37
     * @version V1.0
     */

    @Override
    public PageUtil<TbuserUserInfoVO> listTbuserVOList(Integer page, Integer rows,String  tbname) {
        PageHelper.startPage(page, rows);
        List<TbuserUserInfoVO> list=tbuserUserInfoVOMapper.listTbuserVOList(tbname);
        PageInfo<TbuserUserInfoVO> pageInfo = new PageInfo<>(list);
        return new PageUtil<>(pageInfo);
    }
    //修改密码
    @Override
    public Integer updateByPrimaryKeySelective(Tbuser record) {
        record.setPassword(Md5Utils.encryptPassword(record.getPassword()));

        return tbuserMapper.updateByPrimaryKeySelective(record);
    }
    /**
     * @Description: 新增需要的 部门,职务,状态的list信息
     * @Author GuanChengHao
     * @Date 2017/9/28 10:16
     * @version V1.0
     */
    @Override
    public DepartmentRoleStateListVO listDepartmentRoleStateVO() {
        DepartmentRoleStateListVO deVO = new DepartmentRoleStateListVO();
        deVO.setDepartment(tbuserUserInfoVOMapper.listDepartment());
        deVO.setRole(tbuserUserInfoVOMapper.listRole());
        deVO.setState(tbuserUserInfoVOMapper.listState());
        return deVO;
    }
/**
* @Description:修改老师用户信息
* @Author GuanChengHao
* @Date 2017/9/28 18:05
* @version V1.0
*/
    @Override
    public Integer updateTbuserInfoVO(UserInfo userInfo, Tbuser tbuser, UserRole userRole, Teacher teacher) {
        Integer number_1 = userInfoMapper.updateByPrimaryKey(userInfo);
        Integer number_2 = tbuserMapper.updateByPrimaryKey(tbuser);
        Integer number_3 = userRoleMapper.updateByPrimaryKey(userRole);
        Integer number_4 = teacherMapper.updateByPrimaryKey(teacher);
        return number_1+number_2+number_3+number_4;
    }


}
