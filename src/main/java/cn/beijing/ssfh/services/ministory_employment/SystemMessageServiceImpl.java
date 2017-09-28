package cn.beijing.ssfh.services.ministory_employment;

import cn.beijing.ssfh.entity.*;
import cn.beijing.ssfh.mapper.*;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author WangJian
 * @create 2017-09-26 下午 6:41
 **/
@Service
public class SystemMessageServiceImpl implements SystemMessageService {
    @Inject
    EmploymentMapper employmentMapper;
    @Inject
    GraduationStudentVisitRecordMapper graduationStudentVisitRecordMapper;
    @Inject
    SystemMessageMapper systemMessageMapper;
    @Inject
    StudentInformationMapper studentInformationMapper;
    @Inject
    EnterpriseMapper enterpriseMapper;
    @Inject
    EnterpriseMaintenanceInformationSheetMapper enterpriseMaintenanceInformationSheetMapper;
    @Inject
    EnterpriseTeacherMapper enterpriseTeacherMapper;
    @Inject
    TbuserTeacherMapper tbuserTeacherMapper;
    @Inject
    WorkReportMapper workReportMapper;
    @Inject
    TbuserMapper tbuserMapper;
    @Inject
    MajorMapper majorMapper;
    @Inject
    TeacherMapper teacherMapper;

    
    /**
    * @author WangJian
    * @date 2017/9/26 0026 下午 10:48
    * @version V1.0
     * 学生回访提醒信息功能；
    */
    @Override
    public void addStudentHuiFangTiXing() {
        List<Employment> list =employmentMapper.listEmploymemtAll();
        Date today=new Date();
        Calendar calendar=Calendar.getInstance();
        for (Employment employment : list) {
            int studentId=employment.getStudentId();
            String studentName=studentInformationMapper.selectByPrimaryKey(studentId).getStudentName();
            GraduationStudentVisitRecord graduationStudentVisitRecord=graduationStudentVisitRecordMapper.selectByStudentIdAndDateDesc(studentId);
            if(graduationStudentVisitRecord==null){
                SystemMessage systemMessage=new SystemMessage(0,employment.getUserId(),new Date(),"学生"+studentName+"还未回返过",1);
                systemMessageMapper.insertSystemMessage(systemMessage);
                continue;
            }
            Date date=graduationStudentVisitRecord.getVisitTime();
            calendar.setTime(today);
            long todayMillis=calendar.getTimeInMillis();
            calendar.setTime(date);
            long dateMillis=calendar.getTimeInMillis();
            int days= (int) ((todayMillis-dateMillis)/1000/3600/24);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+days);
            if(days>10){
                String message="学生"+studentName+"已经"+days+"天没有回访了，请尽快回访";
            systemMessageMapper.insertSystemMessage(new SystemMessage(0,employment.getUserId(),new Date(),message,1));
            }
        }
    }
    /**
    * @author WangJian
    * @date 2017/9/26 0026 下午 10:49
    * @version V1.0
     * 企业回访信息功能
    */
    @Override
    public void addEnterpriseTiXing(){
        List<Enterprise> enterprises = enterpriseMapper.listEnterprise();
        for (Enterprise enterprise : enterprises) {
            int enterpriseId=enterprise.getEnterpriseId();
            EnterpriseTeacher enterpriseTeacher=enterpriseTeacherMapper.selectByEnterPriseId(enterpriseId);
            int teacherId=enterpriseTeacher.getTeacherId();/*
                TbuserTeacher tbuserTeacher=tbuserTeacherMapper.selectByTeaherId(teacherId);
                int tbuserid=tbuserTeacher.getTbuserId();*/
            UserRole userRole=teacherMapper.getRoleUserByTeacherId(teacherId);
            int tbuserid=1;
            if(userRole!=null){
                tbuserid=userRole.getTbuserId();
            }
            EnterpriseMaintenanceInformationSheet enterpriseMaintenanceInformationSheet = enterpriseMaintenanceInformationSheetMapper.selectByEnterPriseIdNearByNow(enterpriseId);
            if (enterpriseMaintenanceInformationSheet == null) {
                SystemMessage systemMessage=new SystemMessage(0,tbuserid,new Date(),enterprise.getEnterpriseName()+"公司还没有回访过，请尽快回访",1);
                systemMessageMapper.insertSystemMessage(systemMessage);
                continue;
            }
            Date date=enterpriseMaintenanceInformationSheet.getTimeOfReturnVisit();
            Date today = new Date();
            Calendar calendar=Calendar.getInstance();
            calendar.setTime(date);
            long dateMills=calendar.getTimeInMillis();
            long todayMIlls=calendar.getTimeInMillis();
            int days= (int) ((todayMIlls-dateMills)/1000/3600/24);
            if(days>10){
                SystemMessage systemMessage=new SystemMessage(0,tbuserid,new Date(),enterprise.getEnterpriseName()+"公司已经"+days+"天没有联系了，请尽快回访",1);
                systemMessageMapper.insertSystemMessage(systemMessage);
            }
        }

    }

    /**
     * @author WangJian
     * @date 2017/9/26 0026 下午 11:55
     * @version V1.0
     * 日报提醒信息功能
     */
    @Override
    public void addReportTiXing(){
        List<Tbuser> list=tbuserMapper.listTbuser();
        for (Tbuser tbuser : list) {
            int userInfoId=tbuser.getUserInfoId();
            WorkReport workReport=workReportMapper.selectByUserInfoIdAndNearByNow(userInfoId);
            if(workReport==null){
                SystemMessage systemMessage = new SystemMessage(0, tbuser.getTbuserId(), new Date(), "您还没有写过日报呢，赶紧去试试吧", 1);
                systemMessageMapper.insertSystemMessage(systemMessage);
                continue;
            }
            Date date=workReport.getWorkReportDate();
            Date today = new Date();
            Calendar calendar=Calendar.getInstance();
            calendar.setTime(date);
            long dateMillis=calendar.getTimeInMillis();
            calendar.setTime(today);
            long todayMillis=calendar.getTimeInMillis();
            int days= (int) ((todayMillis-dateMillis)/1000/3600/24);
            if(days>1){
                SystemMessage systemMessage = new SystemMessage(0, tbuser.getTbuserId(), new Date(), "您昨天的日报还没有写，赶紧去补写吧", 1);
                systemMessageMapper.insertSystemMessage(systemMessage);
            }

        }
    }


    /**
    * @author WangJian
    * @date 2017/9/27 0027 上午 8:53
    * @version 未分班学生提醒
     *
    */
    @Override
    public void addStudnetWeiFenBanXueShengTiXing() {
        List<Object> list = new ArrayList<>();
        for (Major major : majorMapper.listMajorAll()) {
            String majorName = major.getMajorName();
            int majorNamecount = 0;
            for (StudentInformation information : studentInformationMapper.listQueryStudentState()) {

                String profession = information.getProfession();
                if (profession.equals(majorName) && information.getStudentState() == 2) {
                    majorNamecount++;
                }
            }
            if(majorNamecount==20){
                Tbuser tbuser=new Tbuser();
                SystemMessage systemMessage = new SystemMessage(0, tbuser.getTbuserId(), new Date(), "已经够了20人了，该创建班级了！", 1);
                systemMessageMapper.insertSystemMessage(systemMessage);

            }
        }


    }



    /**
     * @author 冯雪松
     * @date 2017/9/28 17:51
     * @version V1.0
     * 日报
     */

    @Override
    public void addribao() {
        for (WorkReport report : workReportMapper.listWorkReport()) {
           String a= report.getReviewWorkReport();
           if(a==null){

           }
        }
    }



}
