import cn.beijing.ssfh.entity.GraduationStudentVisitRecord;
import cn.beijing.ssfh.entity.Tbuser;
import cn.beijing.ssfh.entity.WorkReport;
import cn.beijing.ssfh.mapper.*;
import cn.beijing.ssfh.services.ministory_employment.SystemMessageService;
import org.junit.Test;

import javax.inject.Inject;

/**
 * @author WangJian
 * @create 2017-09-26 下午 6:45
 **/
public class TestSystemMessage extends  BaseTest {
    @Inject
    SystemMessageService systemMessageService;
    @Inject
    EmploymentMapper employmentMapper;
    @Inject
    GraduationStudentVisitRecordMapper graduationStudentVisitRecordMapper;
    @Inject
    EnterpriseMaintenanceInformationSheetMapper enterpriseMaintenanceInformationSheetMapper;
    @Inject
    TbuserMapper tbuserMapper;
    @Inject
    WorkReportMapper workReportMapper;
    /**
     * @author 冯雪松
     * @date 2017/9/28 18:17
     * @version 为分班学生测试
     */

    @Test
    public void text5(){
        systemMessageService.addStudnetWeiFenBanXueShengTiXing();
    }
    @Test
    /**
    * @author WangJian
    * @date 2017/9/26 0026 下午 10:22
    * @version V1.0
     * 测试学生回访提醒信息提醒
    */
    public void testAddStudentMessage(){
        systemMessageService.addStudentHuiFangTiXing();
    }
    @Test
    public void test(){
        GraduationStudentVisitRecord graduationStudentVisitRecord=graduationStudentVisitRecordMapper.selectByStudentIdAndDateDesc(3);
        System.out.println(graduationStudentVisitRecord);
    }
    /**
    * @author WangJian
    * @date 2017/9/26 0026 下午 10:54
    * @version V1.0
     * 测试企业回访提醒信息
    */
    @Test
    public void testAddEnterPriseTiXing(){
        systemMessageService.addEnterpriseTiXing();
    }
    @Test
    public void testEnterpriseMineteanceInformation(){
        System.out.println(enterpriseMaintenanceInformationSheetMapper.selectByEnterPriseIdNearByNow(1));
    }
    /**
    * @author WangJian
    * @date 2017/9/27 0027 上午 12:02
    * @version V1.0
     * 日报提醒功能测试
    */
    @Test
    public  void testAddWorkReportTiXing(){
            systemMessageService.addReportTiXing();
    }
    @Test
    public void testListTbuser(){
        for (Tbuser tbuser : tbuserMapper.listTbuser()) {
            System.out.println(tbuser);
        }
    }
    @Test
    public void testSelectWorkReport(){
        WorkReport workReport=workReportMapper.selectByUserInfoIdAndNearByNow(27);
        System.out.println(workReport);
    }
    @Test
    public void testSelectUserByUserInfoId(){
        Tbuser tbuser=tbuserMapper.selectByUserInfoId(27);
        System.out.println(tbuser);
    }
    @Test
    public void testSelectUserByUserId(){
        Tbuser tbuser=tbuserMapper.selectByUserId(5);
        System.out.println(tbuser);
    }
}
