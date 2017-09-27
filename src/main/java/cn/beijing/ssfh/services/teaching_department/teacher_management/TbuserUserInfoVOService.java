package cn.beijing.ssfh.services.teaching_department.teacher_management;

import cn.beijing.ssfh.entity.Tbuser;
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
    TbuserUserInfoVO findTbuserVOByTbuserId(Integer userId);
    /**
    * @Description: 查询用户老师的所有信息
    * @Author GuanChengHao
    * @Date 2017/9/26 16:37
    * @version V1.0
    */

    PageUtil<TbuserUserInfoVO> findTbuserVOList(Integer page, Integer rows);
    /**
    * @Description: 修改密码
    * @Author GuanChengHao
    * @Date 2017/9/26 16:38
    * @version V1.0
    */

    Integer updateByPrimaryKeySelective(Tbuser record);

}
