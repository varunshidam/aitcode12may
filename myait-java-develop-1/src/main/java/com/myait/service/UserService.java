package com.myait.service;

import java.util.List;  
import java.util.Optional;
import com.myait.model.User;
import com.myait.view.UserView;

public interface UserService {
	
	//save
	public User saveEmployee(User employee);
	
	//update
	public User updateEmployee(User employee);

	//get all
	public List<UserView> showAll();
	
	// get one record
	public Optional<User> getEmployeeById(int userid);
	
	//get by AIT-ID
	public User findByAitid(String aitid);
	
	//get by Ait_id (4)
	//public UserView findByAit_id11(String id);
	

}