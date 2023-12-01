package com.cg.dao;

import java.util.List;

import com.cg.entity.ContactUsers;

public interface ContactDao {
	List<ContactUsers> getContactUsers(int userId);

}
