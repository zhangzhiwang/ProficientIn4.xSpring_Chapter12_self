package com.asiainfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Service1 {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void delete() {
		jdbcTemplate.update("delete from t_user where user_id=2");
		throw new RuntimeException();
	}
}
