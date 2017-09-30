package classtable;

import cn.beijing.ssfh.entity.DateTime;
import cn.beijing.ssfh.services.academic_department.ClassTableServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Administrator on 2017/9/26 0026.
 * Author 武云峰
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")
public class TestClassTable {
    @Inject
    private ClassTableServices classTableServices;

    @Test
    public void testAddDate() {
        List<DateTime> list=new ArrayList<>();
        Calendar calendar=classTableServices.getStartDate();
        for(int i=0;i<7;i++) {
            DateTime dateTime=new DateTime();
            dateTime.setDateTime(calendar.getTime());
            dateTime.setDateState(1);
            list.add(dateTime);
            calendar.add(Calendar.DATE,1);
        }
        for (DateTime dateTime : list) {
            System.out.println(dateTime);
        }
        System.out.println(classTableServices.saveNextWeekDateTime(list));
    }

    @Test
    public void testSaveClassTable() {
        System.out.println(classTableServices.saveClassTable());
    }

}
