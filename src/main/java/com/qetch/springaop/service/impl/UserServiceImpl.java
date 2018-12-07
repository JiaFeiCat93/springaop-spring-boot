package com.qetch.springaop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qetch.springaop.dao.UserDao;
import com.qetch.springaop.entity.User;
import com.qetch.springaop.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User get(Integer id) {
		return userDao.getUserById(id);
	}

	@Override
	public List<User> list() {
		return userDao.getAllUsers();
	}

	@Override
	public Integer save(User user) {
		return userDao.saveUser(user);
	}

	@Override
	public void update(User user) {
		userDao.updateUser(user);
	}

	@Override
	public void delete(Integer id) {
		userDao.deleteUser(id);
	}

}
