package com.asiainfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.dao.impl.UserDaoImpl;
import com.asiainfo.dao.interfaces.IUserDao;
import com.asiainfo.entity.User;
import com.asiainfo.service.interfaces.IUserService;

@Service
@Transactional
public class UserServiceImpl {
	@Autowired
	private UserDaoImpl userDaoImpl;
	@Autowired
	private Service1 service1;

	public void save(User user) {
		userDaoImpl.save(user);
//		service1.delete();
		new MyThread(service1).start();
	}
	
	class MyThread extends Thread {
		private Service1 service1;

		public MyThread(Service1 service1) {
			super();
			this.service1 = service1;
		}

		public MyThread() {
			super();
		}
		
		public void run() {
			service1.delete();
		}
	}
}
