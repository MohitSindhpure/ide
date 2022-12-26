package com.teampractice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teampractice.model.User;
import com.teampractice.repository.UserRepo;

@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private UserRepo userrepo;
	@Override
	public void Saveuser(User user) {
		userrepo.save(user);
		
	}
	
	

}
