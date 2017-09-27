package cn.beijing.ssfh.services.teaching_department.teacher_management.impl;

import cn.beijing.ssfh.entity.Tbuser;
import cn.beijing.ssfh.mapper.*;
import cn.beijing.ssfh.pojo.vo.TbuserUserInfoVO;
import cn.beijing.ssfh.services.teaching_department.teacher_management.TbuserUserInfoVOService;
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
    private TeacherMapper teacherMapper;
    @Inject
    private StateMapper stateMapper;
    @Inject
    private UserRoleMapper userRoleMapper;
    @Inject
    private RoleMapper roleMapper;
    @Inject
    private UserInfoMapper userInfoMapper;
    /**
     * @Description: 根据用户ID查询用户老师的一条信息
     * @Author GuanChengHao
     * @Date 2017/9/26 16:36
     * @version V1.0
     */

    @Override
    public TbuserUserInfoVO findTbuserVOByTbuserId(Integer userId) {
        return tbuserUserInfoVOMapper.findTbuserVOByTbuserId(userId);
    }
    /**
     * @Description: 查询用户老师的所有信息
     * @Author GuanChengHao
     * @Date 2017/9/26 16:37
     * @version V1.0
     */

    @Override
    public PageUtil<TbuserUserInfoVO> findTbuserVOList(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        List<TbuserUserInfoVO> list=tbuserUserInfoVOMapper.findTbuserVOList();
        PageInfo<TbuserUserInfoVO> pageInfo = new PageInfo<>(list);
        return new PageUtil<>(pageInfo);
    }
    //修改密码
    @Override
    public Integer updateByPrimaryKeySelective(Tbuser record) {
        return tbuserMapper.updateByPrimaryKeySelective(record);
    }


}
