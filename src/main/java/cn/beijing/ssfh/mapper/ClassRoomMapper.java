package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.ClassRoom;

import java.util.List;

public interface ClassRoomMapper {
    //查看所有教室信息
    List<ClassRoom> queryAllClassRoom();

    //查看教室使用详情
    ClassRoom detailClassRoom(Integer classroomId);

    //班级名称查询班级
    List<ClassRoom> queryByClassRoomName(String roomName);
    
    int deleteByPrimaryKey(Integer classroomId);

    int insert(ClassRoom record);

    int insertSelective(ClassRoom record);

    ClassRoom selectByPrimaryKey(Integer classroomId);

    int updateByPrimaryKeySelective(ClassRoom record);

    int updateByPrimaryKey(ClassRoom record);
}