import cn.beijing.ssfh.mapper.StudentInformationMapper;
import org.junit.Test;

import javax.inject.Inject;

/**
 * @author WangJian
 * @create 2017-09-26 下午 10:16
 **/
public class TestStudent extends BaseTest{
    @Inject
    StudentInformationMapper studentInformationMapper;
    @Test
    public void testSelectByid(){
        System.out.println(studentInformationMapper.selectByPrimaryKey(3));
    }
}
