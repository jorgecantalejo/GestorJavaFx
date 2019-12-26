package com.cantalejo.service;

import com.cantalejo.bean.User;
import com.cantalejo.generic.GenericService;

public interface UserService extends GenericService<User> {

	boolean authenticate(String email, String password);
	
	User findByEmail(String email);
	
}
