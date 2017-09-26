package cn.beijing.ssfh.services.teaching_department.teacher_management.impl;

import cn.beijing.ssfh.mapper.TbuserUserInfoVOMapper;
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
    @Override
    public TbuserUserInfoVO findTbuserVOByTbuserId(Integer userId) {
        return tbuserUserInfoVOMapper.findTbuserVOByTbuserId(userId);
    }

    @Override
    public PageUtil<TbuserUserInfoVO> findTbuserVOList(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        List<TbuserUserInfoVO> list=tbuserUserInfoVOMapper.findTbuserVOList();
        PageInfo<TbuserUserInfoVO> pageInfo = new PageInfo<>(list);
        return new PageUtil<>(pageInfo);
    }
}
