package net.campersmarket.control;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("membersControl")
@RequestMapping("/members")
public class MembersControl {
	static Logger log = Logger.getLogger(MembersControl.class);

	//MembersService	membersService;
	ServletContext servletContext;
	
}
