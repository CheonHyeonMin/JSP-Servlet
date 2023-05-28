package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex04")
public class Ex04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a =request.getParameter("ope");
		int pnum1 =Integer.parseInt(request.getParameter("num1"));
		int pnum2 =Integer.parseInt(request.getParameter("num2"));
		
		response.setCharacterEncoding("UTF-8");
		//웹브라우저가 한글 인코딩을 할 수 있도록 알려주는 코드를 추가해야됨!
		//-> 브라우저에게 응답데이터의 형식과 인코딩 방식 알려주는 코드
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		switch(a) {
		case "plus":
			out.print(pnum1 + a + pnum2 + "=" + (pnum1+pnum2));
			break;
		case "-":
			out.print(pnum1 + a + pnum2 + "=" + (pnum1-pnum2));
			break;
		case "*":
			out.print(pnum1 + a + pnum2 + "=" + (pnum1*pnum2));
			break;
		case "/":
			out.print(pnum1 + a + pnum2 + "=" + (pnum1/pnum2));
			break;
		}
	}

}
