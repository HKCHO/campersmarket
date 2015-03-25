package net.campersmarket.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LogFilter implements Filter {
	FilterConfig filterConfig;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO 접속한 사용자의 IP주소 또는 MAC주소를 기록합니다.
		
		HttpServletRequest req = (HttpServletRequest) request;

		System.out.println(req.getRemoteAddr());
		
		chain.doFilter(req, response);
	}

	@Override
	public void destroy() {}

}
