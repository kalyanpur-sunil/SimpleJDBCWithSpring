package com.sunil.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sunil.dao.impl.JdbcDaoImpl;
import com.sunil.model.Circle;

public class JdbcSpringTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoImpl dao = context.getBean("jdbcDaoImpl",JdbcDaoImpl.class);
		Circle circle = dao.getCircle(2);
		System.out.println(circle);
		

	}

}
