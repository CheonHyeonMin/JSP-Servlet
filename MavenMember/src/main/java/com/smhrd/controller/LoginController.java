package com.smhrd.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.WebMember;
import com.smhrd.model.WebMemberDAO;

public class LoginController implements Command {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String url ="";
		
		try {
			request.setCharacterEncoding("UTF-8");
			String email = request.getParameter("email");
			String pw = request.getParameter("pw");
			
			WebMember member = new WebMember(email,pw);
			
			WebMemberDAO dao = new WebMemberDAO();
			
			WebMember loginMember = dao.login(member);
			
			
			
			if(loginMember != null) { //로그인 성공 
				//세션 회원정보 저장, 'index.jsp'로 이동
				HttpSession session = request.getSession();
				
				session.setAttribute("loginMember", loginMember);
				System.out.println("로그인 성공!");
				url ="index.jsp";
			}
			else { //로그인 실패
				//index.jsp로 이동
				System.out.println("로그인 실패!");
				url ="index.jsp";
			}
			
		}catch(UnsupportedEncodingException e) {
			System.out.println("인코딩 방식 잘못지정함");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return url;
	}

}
