package cn.beijing.ssfh.services.public_department.public_managerment;

import cn.beijing.ssfh.entity.ClassRoom;
import cn.beijing.ssfh.util.PageUtil;

/**
 * Created by Administrator on 2017/9/25/025.
 * Author wangshuo
 */
public interface ClassRoomService {
    //查看所有教室信息
    PageUtil<ClassRoom> queryAllClassRoom(Integer pageNum, Integer pageSize);

    //查看教室使用详情
    ClassRoom detailClassRoom(Integer classRoomId);

    //班级名称查询班级
    PageUtil<ClassRoom> queryByClassRoomName(Integer pageNum, Integer pageSize, String roomName);

    int deleteByPrimaryKey(Integer classroomId);

    int insert(ClassRoom record);

    int insertSelective(ClassRoom record);

    ClassRoom selectByPrimaryKey(Integer classroomId);

    int updateByPrimaryKeySelective(ClassRoom record);

    int updateByPrimaryKey(ClassRoom record);
}
