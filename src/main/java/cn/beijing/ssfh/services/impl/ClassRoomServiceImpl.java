package cn.beijing.ssfh.services.impl;

import cn.beijing.ssfh.mapper.ClassRoomMapper;
import cn.beijing.ssfh.services.ClassRoomService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Administrator on 2017/9/28.
 * Author bianliqiang
 */
@Service
public class ClassRoomServiceImpl implements ClassRoomService {
    @Inject
    private ClassRoomMapper classRoomMapper;
    @Override
    public List<Integer> selectClassRoomIdAll() {
        return classRoomMapper.selectClassRoomIdAll();
    }
}
