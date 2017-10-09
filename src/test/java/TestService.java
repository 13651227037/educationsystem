import cn.beijing.ssfh.services.CourseTableVOService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/9/28.
 * Author bianliqiang
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class TestService {
    @Inject
    private CourseTableVOService courseTableVOService;

    @Test
    public void testServiceselect() {
        System.out.println(courseTableVOService.selectCourse());
    }
}
