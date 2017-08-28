package com.ddd.dao;

import java.util.List;

import com.ddd.entity.Dept;
//jiekou
public interface DeptDao {
	int deleteByPrimaryKey(Integer deptid);

	int insertSelective(Dept record);

	Dept selectByPrimaryKey(Integer deptid);

	int updateByPrimaryKeySelective(Dept record);

	List<Dept> selectAll();

}