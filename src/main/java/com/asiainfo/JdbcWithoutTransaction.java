package com.asiainfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * 不使用事务的jdbc访问数库
 *
 * @author zhangzhiwang
 * @date Mar 27, 2019 10:36:30 PM
 */
@Component
public class JdbcWithoutTransaction {
	@Autowired
	private JdbcTemplate jdbcTemplate; 
	
	public void addCredits(String name, int credits) {
		jdbcTemplate.update("update t_user set credits=credits+? where user_name=?", credits, name);
	}
}
