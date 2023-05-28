package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex01")
public class Ex01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id= request.getParameter("id");
		String pw= request.getParameter("pw");
		response.setCharacterEncoding("UTF-8");
		//웹브라우저가 한글 인코딩을 할 수 있도록 알려주는 코드를 추가해야됨!
		//-> 브라우저에게 응답데이터의 형식과 인코딩 방식 알려주는 코드
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print(id + "님 환영합니다." + pw);
		
		
	}

}
