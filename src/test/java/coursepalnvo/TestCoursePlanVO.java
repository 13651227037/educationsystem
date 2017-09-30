package coursepalnvo;

import cn.beijing.ssfh.entity.CoursePlanVO;
import cn.beijing.ssfh.mapper.CoursePlanVOMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/9/27 0027.
 * Author 武云峰
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")
public class TestCoursePlanVO {
    @Inject
    private CoursePlanVOMapper coursePlanVOMapper;

    @Test
    public void testCoursePlanVO() {
        System.out.println(coursePlanVOMapper.selectCoursePlanVO(6));
    }

    @Test
    public void testUpdate() {
        CoursePlanVO vo=new CoursePlanVO();
        vo.setSchedules(2);
        vo.setChapterId(1);
        vo.setGradeId(1);
        System.out.println(coursePlanVOMapper.updateCoursePlan(vo));
    }
}
