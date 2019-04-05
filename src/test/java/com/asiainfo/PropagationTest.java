package com.asiainfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asiainfo.service.impl.ServiceImpl;
import com.asiainfo.service.impl.UserServiceImpl;

/**
 * 事务传播行为测试
 *
 * @author zhangzhiwang
 * @date Apr 2, 2019 1:20:49 PM
 */
public class PropagationTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");// 这样也启动了Spring容器，相当于启动tomcat
//		UserServiceImpl userServiceImpl = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
//		userServiceImpl.save(null);
		
	}
}
