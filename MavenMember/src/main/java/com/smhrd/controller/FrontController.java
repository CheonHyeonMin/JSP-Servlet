package com.smhrd.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//~.do 요청을 모두 받아줄 컨트롤러(프론트 컨트롤러)
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//Map<String, command>
	Map<String, Command> list = null;
	
	public void init(ServletConfig config) throws ServletException {
		
		list = new HashMap<>();
		list.put("/join.do",new JoinController());
		list.put("/login.do",new LoginController());
		list.put("/logout.do", new LogoutController());
		list.put("/update.do", new UpdateController());
		list.put("/delete.do", new DeleteController());
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String reqUri = request.getRequestURI(); //요청경로 가지고 오기
		String contextPath =request.getContextPath(); //contextpath : 서버에서 프로젝트를 구별하기 위해 쓰는 경로
		String key = reqUri.substring(contextPath.length()); // /join.do, /login.do
	
		Command controller = list.get(key);
		String desUrl= controller.process(request, response);
		
		if(desUrl.equals("joinSuccess.jsp")) {
			//forwarding 방식 사용
			RequestDispatcher rd =request.getRequestDispatcher("joinSuccess.jsp");
			rd.forward(request, response);
		}
		else {
			//redirecting
			response.sendRedirect(desUrl);
		}
		
	}

}
