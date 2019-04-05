package com.asiainfo.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.service.interfaces.IService;

@Component
@Transactional
public class ServiceImpl{

	public void met1() {
		System.out.println("ServiceImpl#met1()");
	}
	
	public final void met2() {
		System.out.println("ServiceImpl#met2()");
	}

	public static void met3() {
		System.out.println("ServiceImpl#met3()");
	}
	
	private void met4() {
		System.out.println("ServiceImpl#met4()");
	}
	
	protected void met5() {
		System.out.println("ServiceImpl#met5()");
	}
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");// 这样也启动了Spring容器，相当于启动tomcat
//		UserServiceImpl userServiceImpl = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
//		userServiceImpl.save(null);
		
		ServiceImpl serviceImpl = (ServiceImpl) applicationContext.getBean("serviceImpl");
		System.out.println("serviceImpl=" +  serviceImpl);
		System.out.println("----------before met1-------------");
		serviceImpl.met1();
		System.out.println("----------after met1-------------");
		System.out.println("----------before met2-------------");
		serviceImpl.met2();
		System.out.println("----------after met2-------------");
		System.out.println("----------before met3-------------");
		serviceImpl.met3();
		System.out.println("----------after met3-------------");
		System.out.println("----------before met4-------------");
		serviceImpl.met4();
		System.out.println("----------after met4-------------");
		System.out.println("----------before met5-------------");
		serviceImpl.met5();
		System.out.println("----------after met5-------------");
	}
}

//class ServiceImplExt extends ServiceImpl {
//	@Override
//	public void met1() {
//		System.out.println("ServiceImpl#met1()");
//	}
//	
////	public final void met2() {
////		System.out.println("ServiceImpl#met2()");
////	}
//
////	@Override  // 子类不能复写父类的静态方法
//	public static void met3() {
//		System.out.println("ServiceImpl#met3()");
//	}
//	
////	@Override
//	private void met4() {
//		System.out.println("ServiceImpl#met4()");
//	}
//	
//	@Override
//	public void met5() {
//		System.out.println("ServiceImpl#met5()");
//	}
//}

