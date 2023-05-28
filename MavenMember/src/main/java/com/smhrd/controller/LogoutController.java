package com.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController implements Command {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		
		
		try {
			//세션 삭제(회원정보 지우기)
			HttpSession session = request.getSession();
			//특정 세션 하나만 지우기
			session.removeAttribute("loginMember");
//			세션 다 지우기
//			session.invalidate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return "index.jsp";
	}

}
