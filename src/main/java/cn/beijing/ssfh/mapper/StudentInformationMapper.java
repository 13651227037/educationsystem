package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.StudentInformation;
import cn.beijing.ssfh.pojo.vo.StudentEmploymentVO;
import cn.beijing.ssfh.pojo.vo.StudentProfileVO;
import cn.beijing.ssfh.pojo.vo.StudentVisitVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentInformationMapper {
    int deleteByPrimaryKey(Integer studentId);

    int insert(StudentInformation record);
    //新增学生档案,也是新增学生信息
    int insertSelective(StudentInformation record);

    StudentInformation selectByPrimaryKey(Integer studentId);
    //修改学生档案，也是修改学生信息
    int updateByPrimaryKeySelective(StudentInformation record);

    int updateByPrimaryKey(StudentInformation record);
    //查询所有学生档案
    List<StudentProfileVO> listAllStudentProfile();
    //查询一条学生档案信息
    StudentProfileVO getOneStudentProfile(Integer studentId);
    //查询所有就业学生信息
    List<StudentEmploymentVO> listAllStudentEmployment();
    //查询单条学生就业信息
    StudentEmploymentVO getOneStudentEmployment(Integer studentId);
    //查询所有学生信息
    List<StudentInformation> listAllStudentInformation();
    //查询所有回访学生记录
    List<StudentVisitVO> listAllStudentVisit(@Param("studentName") String studentName);
    //通过学生ID查询老师
    List<StudentVisitVO> listAllTeachersByStudentId(Integer studentId);


}