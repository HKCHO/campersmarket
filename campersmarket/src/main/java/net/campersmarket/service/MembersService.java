package net.campersmarket.service;

import net.campersmarket.dao.MembersDao;
import net.campersmarket.domain.Members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembersService {
	@Autowired MembersDao membersDao;
	
	public void add(Members members) {
	  	membersDao.insert(members);
	  }
	
	
}
