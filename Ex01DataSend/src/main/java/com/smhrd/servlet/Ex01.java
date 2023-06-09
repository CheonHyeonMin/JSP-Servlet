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
		// TODO Auto-generated method stub
	
		//요청 데이터(name=data) 값 가져오기
		//getParameter(String->form의 네임값) -> 요청 데이터 가져오기 -> 반환타입 : String
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		//응답데이터 인코딩 설정 추가
		response.setCharacterEncoding("UTF-8");
		//웹브라우저가 한글 인코딩을 할 수 있도록 알려주는 코드를 추가해야됨!
		//-> 브라우저에게 응답데이터의 형식과 인코딩 방식 알려주는 코드
		response.setContentType("text/html; charset=UTF-8");
		
		
		//사용자가 입력한 값 그대로 html 문서로 만들어서 응답하기
		PrintWriter out = response.getWriter(); //텍스트 출력 스트림 만들기
		out.print( (c+d) );
		out.print( (c+d) );
		
	}


}
