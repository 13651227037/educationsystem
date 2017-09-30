package dateTime;

import cn.beijing.ssfh.entity.DateTime;
import cn.beijing.ssfh.mapper.DateTimeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.Date;

/**
 * Created by Administrator on 2017/9/26 0026.
 * Author 武云峰
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")
public class TestDateTime {
    @Inject
    private DateTimeMapper dateTimeMapper;

    @Test
    public void testAddDateTime() {
        DateTime dateTime = new DateTime();
        dateTime.setDateTime(new Date());
        dateTime.setDateState(1);
        dateTimeMapper.insert(dateTime);
    }

    @Test
    public void testSelectByDate() {
        System.out.println(dateTimeMapper.selectByDate(new Date()));
    }

    @Test
    public void testById() {
        System.out.println(dateTimeMapper.selectByPrimaryKey(14));
    }
}
