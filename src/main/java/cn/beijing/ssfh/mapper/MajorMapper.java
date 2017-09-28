package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.Major;

import java.util.List;

public interface MajorMapper {
    int deleteByPrimaryKey(Integer majorId);

    int insert(Major record);

    int insertSelective(Major record);

    Major selectByPrimaryKey(Integer majorId);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);
    /**
     * @author 冯雪松
     * @date 2017/9/28 17:08
     * @version V1.0
     * 遍历专业方向
     */
    List<Major>listMajorAll();
}