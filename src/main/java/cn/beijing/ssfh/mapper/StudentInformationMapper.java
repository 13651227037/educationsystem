package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.StudentInformation;
import cn.beijing.ssfh.pojo.vo.OneStudentEmploymentVO;
import cn.beijing.ssfh.pojo.vo.StudentEmploymentVO;
import cn.beijing.ssfh.pojo.vo.StudentProfileVO;

import java.util.List;

public interface StudentInformationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_information
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer studentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_information
     *
     * @mbggenerated
     */
    int insert(StudentInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_information
     *
     * @mbggenerated
     */
    int insertSelective(StudentInformation record);

    /**
     * 查询一条学生信息
     */
    StudentInformation selectByPrimaryKey(Integer studentId);

    /**
     *
     *修改一条学生信息（有选择的修改）
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(StudentInformation record);

    /**
     * 修改一条学生信息
     */
    int updateByPrimaryKey(StudentInformation studentInformation);


    //查询所有学生档案
    List<StudentProfileVO> selectAllStudentProfile();

    //查询一条学生档案
    StudentProfileVO selectOneStudentProfile(Integer studentId);

    //查询所有学生就业情况
    List<StudentEmploymentVO> selectAllStudentEmployment();

    //查询一条学生就业信息
    OneStudentEmploymentVO selectOneStudentEmployment(Integer studentId);






}