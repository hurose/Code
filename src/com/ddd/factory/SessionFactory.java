package com.ddd.factory;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionFactory {
	private static SqlSessionFactory factory;

	static {
		try {
			Reader reader = Resources.getResourceAsReader("sqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader, "tt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static SqlSession getSession() {
		// 设置session自动提交
		// return factory.openSession(true);
		return factory.openSession();
	}

	public static <T> T getMapper(Class mapper) {
		SqlSession session = getSession();
		return (T) session.getMapper(mapper);
	}
}