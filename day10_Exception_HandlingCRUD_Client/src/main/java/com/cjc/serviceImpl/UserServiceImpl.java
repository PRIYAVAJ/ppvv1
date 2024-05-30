package com.cjc.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.UserModel.User;
import com.cjc.repository.UserRepository;
import com.cjc.serviceI.UserServiceI;

@Service
public class UserServiceImpl implements UserServiceI {

	
	@Autowired
	UserRepository ur;
	@Override
	public void save(User us) {
	
		ur.save(us);
	}
	@Override
	public User getSingleUser(int rollno) {
		ur.findById(rollno);
		return null;
	}

}
