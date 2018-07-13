/**
 * 
 */
package com.devs4j.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.devs4j.example.model.User;
import com.devs4j.example.service.UserService;

/**
 * @author raidentrance
 *
 */
@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService service;

	@RequestMapping("/users")
	@ResponseBody
	public ResponseEntity<List<User>> getUsers() {
		return new ResponseEntity<>(service.getUsers(), HttpStatus.OK);
	}
}
