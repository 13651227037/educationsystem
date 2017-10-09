package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.ClassRoom;

import java.util.List;

public interface ClassRoomMapper {
    int deleteByPrimaryKey(Integer classroomId);

    int insert(ClassRoom record);

    int insertSelective(ClassRoom record);

    ClassRoom selectByPrimaryKey(Integer classroomId);

    int updateByPrimaryKeySelective(ClassRoom record);

    int updateByPrimaryKey(ClassRoom record);

    List<Integer> selectClassRoomIdAll();
}