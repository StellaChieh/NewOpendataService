package com.iisi.newOpendataService.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class DbDao<T> {

	private Class<T> clazz;
	
	private JdbcTemplate jdbcTemplate;
	
	// database column automatically map to bean field (if name are the same)
	public List<T> query(String sql){	
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<T>(clazz));
	}
	
	public List<Map<String, Object>> queryReturnMap (String sql) {
		return jdbcTemplate.queryForList(sql);
	}
	
	public List<T> queryReturnList(String sql) {
		return jdbcTemplate.queryForList(sql, clazz);
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void setClazz(Class<T> dbEntityClass) {
		this.clazz = dbEntityClass;
	}
			
}