/**
 * 
 */
package com.devs4j.example.config.db;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author raidentrance
 *
 */
@Configuration
public class DataSourceConfig {
	@Bean
	@ConditionalOnProperty(name = "market", havingValue = "mx")
	public DataSource mxDatasource() {
		return DataSourceBuilder.create().driverClassName("com.mysql.jdbc.Driver")
				.url("jdbc:mysql://localhost:3306/mx_users").username("root").password("root").build();

	}

	@Bean
	@ConditionalOnProperty(name = "market", havingValue = "us")
	public DataSource usDatasource() {
		return DataSourceBuilder.create().driverClassName("com.mysql.jdbc.Driver")
				.url("jdbc:mysql://localhost:3306/us_users").username("root").password("root").build();
	}

}
