package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.pojo.vo.TbuserUserInfoVO;

import java.util.List;

/**
 * Created by 79414 on 2017/9/25.
 * Author  GuanChengHao
 */
public interface TbuserUserInfoVOMapper {
    TbuserUserInfoVO findTbuserVOByTbuserId(Integer userId);
    List<TbuserUserInfoVO> findTbuserVOList();
}
