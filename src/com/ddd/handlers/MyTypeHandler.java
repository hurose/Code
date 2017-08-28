package com.ddd.handlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class MyTypeHandler implements TypeHandler {

	public Object getResult(ResultSet arg0, String arg1) throws SQLException {
		System.out.println("arg1--->" + arg1);
		return arg0.getString(arg1);
	}

	public Object getResult(CallableStatement arg0, int arg1)
			throws SQLException {
		System.out.println("arg1....>" + arg1);
		return arg0.getString(arg1);
	}

	public void setParameter(PreparedStatement arg0, int arg1, Object arg2,
			JdbcType arg3) throws SQLException {
		System.out.println("arg0***>");
		arg0.setString(arg1, (String) arg2);
	}

}
