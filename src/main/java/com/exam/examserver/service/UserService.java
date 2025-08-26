package com.exam.examserver.service;

import java.util.Set;

import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;

public interface UserService {
	
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	
	//public User getUser(String username);


	public User getUser(String username);

}
