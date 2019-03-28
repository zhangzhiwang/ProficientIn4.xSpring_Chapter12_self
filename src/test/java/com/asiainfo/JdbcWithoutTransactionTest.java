package com.asiainfo;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcWithoutTransactionTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		JdbcWithoutTransaction jdbcWithoutTransaction = (JdbcWithoutTransaction) applicationContext.getBean("jdbcWithoutTransaction");
		
		// 改
//		jdbcWithoutTransaction.addCredits("admin", 10);
		JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
		BasicDataSource dataSource = (BasicDataSource) jdbcTemplate.getDataSource();
		System.out.println(dataSource.getDefaultAutoCommit());
		
		// 增
//		jdbcTemplate.execute("insert into t_user values (2,'zzw','1234',10,'2019-03-27 00:00:00','127.0.0.1')");
		
		// 查
		Integer queryForObject = jdbcTemplate.queryForObject("select credits from t_user where user_name='admin'", Integer.class);
		System.out.println(queryForObject);
		
		// 删
		jdbcTemplate.execute("delete from t_user where user_name='zzw'");
	}

}
