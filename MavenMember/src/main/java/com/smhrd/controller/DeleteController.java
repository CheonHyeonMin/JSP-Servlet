package com.smhrd.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.WebMemberDAO;

public class DeleteController implements Command {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			String email = request.getParameter("email");
			
			WebMemberDAO dao = new WebMemberDAO();
			int cnt = dao.delete(email);
			
			if(cnt>0) {//삭제 성공
				System.out.println("삭제 성공");
			}
			else { //삭제 실패
				System.out.println("삭제 실패!");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return "select.jsp";
	}

}
