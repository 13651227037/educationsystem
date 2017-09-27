import cn.beijing.ssfh.entity.DepartmentalRole;
import cn.beijing.ssfh.entity.Tbuser;
import cn.beijing.ssfh.entity.UserInfo;
import cn.beijing.ssfh.entity.UserRole;
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
        tbuser.setUsername("superadminsa");
        tbuser.setPassword("1234");
        UserInfo userInfo = new UserInfo();
        userInfo.setAddressId(5);
        userInfo.setAge(999);
        UserRole userRole = new UserRole();
        DepartmentalRole departmentalRole = new DepartmentalRole();
        System.out.println(userservice.insterTbuser(tbuser, userInfo,userRole,departmentalRole));
    }

    @Test
    public void testDeleteUser() {
        Tbuser tbuser = new Tbuser();
        tbuser.setTbuserId(2);
        System.out.println(userservice.deleteTbuser(tbuser));
    }

}
