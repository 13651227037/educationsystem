package cn.beijing.ssfh.services.public_department.public_managerment.impl;

import cn.beijing.ssfh.entity.ClassRoom;
import cn.beijing.ssfh.mapper.ClassRoomMapper;
import cn.beijing.ssfh.services.public_department.public_managerment.ClassRoomService;
import cn.beijing.ssfh.util.PageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Administrator on 2017/9/27/027.
 * Author wangshuo
 */
@Service
public class ClassRoomServiceImpl implements ClassRoomService {
    @Inject
    private ClassRoomMapper classRoomMapper;
    /**
     * @Description: 查询所有教室(分页)
     * @Author wangshuo
     * @Date 2017/9/25/025 16:58
     * @version V1.0
     */
    @Override
    public PageUtil<ClassRoom> queryAllClassRoom(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<ClassRoom> classRoomList = classRoomMapper.queryAllClassRoom();
        PageInfo<ClassRoom> pageInfo = new PageInfo<>(classRoomList);
        PageUtil<ClassRoom> pageUtil = new PageUtil<>(pageInfo);
        return pageUtil;
    }

    /**
     * @Description: 查询教室详情
     * @Author wangshuo
     * @Date 2017/9/26/026 18:48
     * @version V1.0
     */
    @Override
    public ClassRoom detailClassRoom(Integer classroomId) {
        ClassRoom detailClassRoom = classRoomMapper.detailClassRoom(classroomId);
        System.out.println(detailClassRoom);
        return detailClassRoom;
    }

    /**
     * @Description: 通过教室名称查询教室
     * @Author wangshuo
     * @Date 2017/9/25/025 18:41
     * @version V1.0
     */
    @Override
    public PageUtil<ClassRoom>  queryByClassRoomName(Integer pageNum, Integer pageSize, String roomName) {
        PageHelper.startPage(pageNum, pageSize);
        List<ClassRoom> roomList = classRoomMapper.queryByClassRoomName(roomName);
        PageInfo<ClassRoom> pageInfo = new PageInfo<>(roomList);
        PageUtil<ClassRoom> pageUtil = new PageUtil<>(pageInfo);
        return pageUtil;
    }
    @Override
    public int deleteByPrimaryKey(Integer classroomId) {
        return 0;
    }

    @Override
    public int insert(ClassRoom record) {
        return 0;
    }

    @Override
    public int insertSelective(ClassRoom record) {
        return 0;
    }

    @Override
    public ClassRoom selectByPrimaryKey(Integer classroomId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(ClassRoom record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ClassRoom record) {
        return 0;
    }
}
