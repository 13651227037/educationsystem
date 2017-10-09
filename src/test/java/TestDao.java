import cn.beijing.ssfh.entity.CourseTables;
import cn.beijing.ssfh.mapper.CourseTablesMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/9/25.
 * Author bianliqiang
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class TestDao {


        @Inject
        private CourseTablesMapper courseTablesMapper;
        @Test
        public void testselect() {
            System.out.println(courseTablesMapper.selectByPrimaryKey(89));
        }


    @Test
    public void testSelectCourseAll() {
        System.out.println(courseTablesMapper.selectCourse());
    }
        @Test
        public void testdelete() {
            System.out.println(courseTablesMapper.deleteByPrimaryKey(2));
        }
        @Test
        public  void  testUpdateA(){
            CourseTables courseTables = new CourseTables();
            courseTables.setClassroomId(2);
            courseTables.setCourseTablesId(1);
            courseTables.setDateTimeId(3);
            courseTables.setGradeId(2);
            System.out.println(courseTablesMapper.updateByPrimaryKey(courseTables));
        }

    }
