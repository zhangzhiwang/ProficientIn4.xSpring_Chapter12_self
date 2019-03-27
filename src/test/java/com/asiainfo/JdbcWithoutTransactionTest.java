package com.asiainfo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcWithoutTransactionTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		JdbcWithoutTransaction jdbcWithoutTransaction = (JdbcWithoutTransaction) applicationContext.getBean("jdbcWithoutTransaction");
		jdbcWithoutTransaction.addCredits("admin", 10);
	}

}
