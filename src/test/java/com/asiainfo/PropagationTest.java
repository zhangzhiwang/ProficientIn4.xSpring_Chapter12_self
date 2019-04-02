package com.asiainfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asiainfo.service.impl.UserServiceImpl;

/**
 * 事务传播行为测试
 *
 * @author zhangzhiwang
 * @date Apr 2, 2019 1:20:49 PM
 */
public class PropagationTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		UserServiceImpl userServiceImpl = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
		userServiceImpl.save(null);
	}
}
