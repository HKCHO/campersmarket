package net.campersmarket.service;

import net.campersmarket.dao.MembersDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembersService {
	@Autowired MembersDao membersDao;
}
