package com.asiainfo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.asiainfo.dao.interfaces.IUserDao;
import com.asiainfo.entity.User;

@Repository
public class UserDaoImpl {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void save(User user) {
		jdbcTemplate.update("insert into t_user (user_id,user_name,password,credits,last_visit,last_ip) values (2,'test','1234',0,'2019-04-02 00:00:00','127.0.0.1')");
	}

	public List<User> getUserByName(String name) {
		return null;
	}

}
