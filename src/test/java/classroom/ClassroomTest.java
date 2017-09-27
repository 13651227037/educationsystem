package classroom;

import base.BaseTest;
import cn.beijing.ssfh.services.public_department.public_managerment.ClassRoomService;
import org.junit.Test;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/9/25/025.
 * Author wangshuo
 */
public class ClassroomTest extends BaseTest {
    @Inject
    private ClassRoomService classRoomService;

    /**
    * @Description: 查询所有教室信息
    * @Author wangshuo
    * @Date 2017/9/26/026 18:49
    * @version V1.0
    */
    @Test
    public void testQueryAll() {
        System.out.println(classRoomService.queryAllClassRoom(1, 5));
    }

    /**
    * @Description: 通过教室名称查询教室信息
    * @Author wangshuo
    * @Date 2017/9/26/026 18:49
    * @version V1.0
    */
    @Test
    public void testByClassRoomName() {
        System.out.println("==========>>"+classRoomService.queryByClassRoomName(1,5,"1"));
    }
    /**
    * @Description: 查询教室详情
    * @Author wangshuo
    * @Date 2017/9/26/026 18:50
    * @version V1.0
    */
    @Test
    public void testDetailClassRoom() {
        System.out.println("==========>>"+classRoomService.detailClassRoom(18));
    }

}
