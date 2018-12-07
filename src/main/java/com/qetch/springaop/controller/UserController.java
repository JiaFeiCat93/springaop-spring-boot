package com.qetch.springaop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qetch.springaop.entity.User;
import com.qetch.springaop.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user/get/{id}", method=RequestMethod.GET)
	public User get(@PathVariable("id") Integer id) {
		return userService.get(id);
	}
	
	@RequestMapping(value="/user/list", method=RequestMethod.GET)
	public List<User> list() {
		return userService.list();
	}
	
	@RequestMapping(value="/user/update", method=RequestMethod.POST)
	public void update(User user) {
		userService.update(user);
	}
	
	@RequestMapping(value="/user/delete/{id}", method=RequestMethod.GET)
	public void delete(@PathVariable("id") Integer id) {
		userService.delete(id);
	}
}
