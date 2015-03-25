package net.campersmarket.filter;

import java.io.IOException;

import javax.servlet.Filter; //Filter
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO 권한이 없는 사용자를 로그인 창으로 유도합니다.
		// 설명 : 사용자가 로그인을 하면, 로그인 하였다는 session이 발생하게 됩니다.
		//      세션에 로그인 되어있다는 Attribute가 넘어 오지 않으면, 로그인이 되지 않았음을 알리고
		//      로그인 창으로 페이지를 이동시킵니다. 
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		if (req.getSession().getAttribute("loggedIN") == null) {
			req.getSession().setAttribute("<<캠퍼스 마켓>>" , "로그인 후 이용해주세요^^");
			res.sendRedirect("/campersmarket/index.html"); //최초화면으로 돌려보냅니다.
			
			return;
			
		} else {
			
			chain.doFilter(req,res);
			
		}
		
	}

	@Override
	public void destroy() {}
	
}
