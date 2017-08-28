package com.ddd.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ddd.dao.DeptDao;
import com.ddd.entity.Dept;
import com.ddd.factory.SessionFactory;

public class Test3 {
	public static void main(String[] args) {
		SessionFactory factory = new SessionFactory();
		SqlSession session = factory.getSession();

		// IDeptDao deptDao = factory.getMapper(IDeptDao.class);
		DeptDao deptDao = session.getMapper(DeptDao.class);
		// Dept dept = new Dept();
		// dept.setDeptname("开发部2");
		// int num = deptDao.insertSelective(dept);

		// int num = deptDao.delete(1);

		// Dept dept = deptDao.selectByPrimaryKey(4);
		// System.out.println(dept + " ......");
		// // System.out.println(num);

		List<Dept> deptList = deptDao.selectAll();
		for (Dept dept : deptList) {
			System.out.println(dept);
		}

		session.commit();
		session.close();
	}
}
