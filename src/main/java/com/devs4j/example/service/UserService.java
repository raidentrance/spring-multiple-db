/**
 * 
 */
package com.devs4j.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devs4j.example.dao.UserDao;
import com.devs4j.example.model.User;

/**
 * @author raidentrance
 *
 */
@Service
public class UserService {
	@Autowired
	private UserDao dao;

	public List<User> getUsers() {
		return dao.getUsers();
	}
}
