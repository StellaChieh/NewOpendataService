package com.iisi.newOpendataService.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class MyJdbcTemplateConfig {

	@Bean(name = "mysqlDataSource")
	@ConfigurationProperties(prefix = "mysql.datasource")
	public DataSource dataSourceMysql() {
		return DataSourceBuilder.create().build();
	}

	@Primary // default jdbcTemplate
	@Bean(name = "mysqlJdbcTemplate")
	public JdbcTemplate jdbcTemplateMysql(@Qualifier("mysqlDataSource") DataSource ds) {
		return new JdbcTemplate(ds);
	}

	@Bean(name = "sqlServerDataSource")
	@ConfigurationProperties(prefix = "sqlserver.datasource")
	public DataSource dataSourceSqlServer() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "sqlServerJdbcTemplate")
	public JdbcTemplate jdbcTemplateSqlServer(@Qualifier("sqlServerDataSource") DataSource ds) {
		return new JdbcTemplate(ds);
	}

}
