package cn.beijing.ssfh.services.impl;

import cn.beijing.ssfh.entity.CourseTables;
import cn.beijing.ssfh.mapper.CourseTablesMapper;
import cn.beijing.ssfh.pojo.vo.CourseTableVO;
import cn.beijing.ssfh.services.CourseTableVOService;
import cn.beijing.ssfh.util.RecordResult;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/26.
 * Author bianliqiang
 */
@Service
public class CourseTableVOServiceImpl implements CourseTableVOService {
    @Inject
    private CourseTablesMapper courseTablesMapper;
    @Override
    public int deleteByPrimaryKey(Integer courseTablesId) {
        return courseTablesMapper.deleteByPrimaryKey(courseTablesId);
    }

    @Override
    public int insert(CourseTables record) {
        return courseTablesMapper.insert(record);
    }

    @Override
    public int insertSelective(CourseTables record) {
        return courseTablesMapper.insertSelective(record);
    }

    @Override
    public List<CourseTableVO> selectByPrimaryKey(Integer courseTablesId) {
        return courseTablesMapper.selectByPrimaryKey(courseTablesId);
    }

    @Override
    public List<RecordResult> selectCourse() {
        List<CourseTableVO> courseTableVOS = courseTablesMapper.selectCourse();
        List<RecordResult> finalList = new ArrayList();
        int i = 0;
        for (; i < courseTableVOS.size(); ) {
            Map<String, CourseTableVO> voMap = new HashMap<>();

                for (int j = 0;j<4;j++,i++) {
                    voMap.put("a"+j, courseTableVOS.get(i));

                }
            RecordResult recordResult = new RecordResult(courseTableVOS.get(i-1).getDateTime(),
                    courseTableVOS.get(i-1).getClsssroomName(),
                    courseTableVOS.get(i-1).getWeekName(),
                    voMap);

            finalList.add(recordResult);

        }
        return finalList;
    }

    @Override
    public int updateByPrimaryKeySelective(CourseTables record) {
        return courseTablesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CourseTables record) {
        return courseTablesMapper.updateByPrimaryKey(record);
    }
}
