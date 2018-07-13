/**
 * 
 */
package com.devs4j.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.devs4j.example.model.User;

/**
 * @author raidentrance
 *
 */
@Component
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String GET_ALL = "select * from user";

	public List<User> getUsers() {
		return jdbcTemplate.query(GET_ALL, new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new User(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		});
	}
}
