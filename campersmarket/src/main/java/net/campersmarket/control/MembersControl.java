package net.campersmarket.control;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("membersControl")
@RequestMapping("/members")
public class MembersControl {
	static Logger log = Logger.getLogger(MembersControl.class);

	//MembersService	membersService;
	ServletContext servletContext;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	  public void add(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("컨트롤러 드러옴");
		
//	  	HashMap<String, Object> resultMap = new HashMap<>();
//	  	resultMap.put("status","success");
//	  	
//	  	JsonObject obj = new JsonObject();
//	  	obj.add("status", resultMap);
	  	
	  	response.setContentType("text/html;charset=UTF8");
	  	response.getWriter().write("string");
	  	
	  }
	
}
