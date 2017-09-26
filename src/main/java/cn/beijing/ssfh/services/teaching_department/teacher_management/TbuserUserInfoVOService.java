package cn.beijing.ssfh.services.teaching_department.teacher_management;

import cn.beijing.ssfh.pojo.vo.TbuserUserInfoVO;
import cn.beijing.ssfh.util.PageUtil;

/**
 * Created by 79414 on 2017/9/25.
 * Author  GuanChengHao
 */
public interface TbuserUserInfoVOService {
    TbuserUserInfoVO findTbuserVOByTbuserId(Integer userId);
    PageUtil<TbuserUserInfoVO> findTbuserVOList(Integer page, Integer rows);


}
