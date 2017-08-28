package com.ddd.entity;

import java.io.Serializable;

public class Dept implements Serializable {
	/**
	 * dept.deptid
	 * 
	 * @ibatorgenerated 2017-07-13 14:11:22
	 */
	private Integer deptid;

	/**
	 * dept.deptname
	 * 
	 * @ibatorgenerated 2017-07-13 14:11:22
	 */
	private String deptname;

	public Integer getDeptid() {
		return deptid;
	}

	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	@Override
	public String toString() {
		return "Dept [deptid=" + deptid + ", deptname=" + deptname + "]";
	}

}