package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex03")
public class Ex03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		//String -> int(정수형)
		//Integer : int(정수형)의 클래스(Class) 타입 -> 기능(메서드)
		//parseInt(String) : 문자열(String) -> 정수형(int) 변환
		int pnum1 = Integer.parseInt(num1);
		int pnum2 =Integer.parseInt(request.getParameter("num2"));
		
		
		int sum = pnum1+pnum2;
		
		response.setCharacterEncoding("UTF-8");
		//웹브라우저가 한글 인코딩을 할 수 있도록 알려주는 코드를 추가해야됨!
		//-> 브라우저에게 응답데이터의 형식과 인코딩 방식 알려주는 코드
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print(num1 + "+" + num2 + "=" + sum );
	}

}
