package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.State;

import java.util.List;

public interface StateMapper {
    int deleteByPrimaryKey(Integer stateId);

    int insert(State record);

    int insertSelective(State record);

    State selectByPrimaryKey(Integer stateId);

    int updateByPrimaryKeySelective(State record);

    int updateByPrimaryKey(State record);
    //查询学生所有状态
    List<State> listAllStudentState();
}