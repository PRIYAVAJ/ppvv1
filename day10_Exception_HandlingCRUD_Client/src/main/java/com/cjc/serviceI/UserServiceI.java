package com.cjc.serviceI;

import com.cjc.UserModel.User;

public interface UserServiceI {

	

	void save(User us);

	User getSingleUser(int id);

}
