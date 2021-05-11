package com.ak.ApnaKhata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.ApnaKhata.beans.Users;
import com.ak.ApnaKhata.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;
	
	@Override
	public Users registerUser(Users user) {
		
		userRepo.save(user);
		
		return user;
	}

	
}
