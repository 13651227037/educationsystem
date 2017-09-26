import cn.beijing.ssfh.entity.Tbuser;
import cn.beijing.ssfh.entity.UserInfo;
import cn.beijing.ssfh.services.public_department.public_managerment.Userservice;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by Mr.W on 2017/9/26.
 */
public class AddUserTest extends BaseTest {

    @Resource
    private Userservice userservice;

    @Test
    public void testAddUser() {
        Tbuser tbuser = new Tbuser();
        tbuser.setUsername("superadmins");
        tbuser.setPassword("1234");
        UserInfo userInfo = new UserInfo();
        userInfo.setAddressId(5);
        userInfo.setAge(999);
        System.out.println(userservice.addTbuser(tbuser, userInfo));
    }

}
