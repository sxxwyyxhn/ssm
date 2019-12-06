package com.xh.dao;
import com.xh.bean.Emp;

import java.util.List;

/**
@author xh
@create 2019-05 18:56
*/
public interface EmpMapper {
    int deleteByPrimaryKey(Integer eno);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer eno);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    List<Emp> selectByAll(Emp emp);


}