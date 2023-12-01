package com.cg.service;

import java.util.ArrayList; 
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.dao.UserDao;
import com.cg.demo.Users;
@Service
public class UserDaoImpl implements UserDao {
	
	List<Users> userList=new ArrayList<>();
	public UserDaoImpl() {
		userList.add(new Users(1,"abhi"));
		userList.add(new Users(3,"abhishek"));
		userList.add(new Users(4,"nagraj"));
		
		
	}
//public List<Users> getAllUsers(){
//	return userList;
//}
@Override
public List<Users> getAllgUsers() {
	// TODO Auto-generated method stub
	return userList;
}
}
