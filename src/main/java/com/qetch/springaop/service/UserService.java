package com.qetch.springaop.service;

import java.util.List;

import com.qetch.springaop.entity.User;

public interface UserService {

	public User get(Integer id);
	
	public List<User> list();
	
	public Integer save(User user);
	
	public void update(User user);
	
	public void delete(Integer id);
}
