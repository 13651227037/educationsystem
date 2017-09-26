import cn.beijing.ssfh.entity.Tbuser;
import cn.beijing.ssfh.services.LoginServices;
import org.junit.Test;

import javax.inject.Inject;

/**
 * Created by Mr.W on 2017/9/24.
 */

public class LoginTest extends BaseTest {
    @Inject
    private LoginServices loginServices;
    @Test
    public void lgoinTest() {
        Tbuser tbuser = new Tbuser();
        tbuser.setUsername("admin");
        tbuser.setPassword("1234");
    }
}
