package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex05Table")
public class Ex05Table extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//요청
		
		
		//응답
		response.setCharacterEncoding("UTF-8");
		//웹브라우저가 한글 인코딩을 할 수 있도록 알려주는 코드를 추가해야됨!
		//-> 브라우저에게 응답데이터의 형식과 인코딩 방식 알려주는 코드
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		out.print("<table border=1px solid black>\r\n"
				+ "		<tr>\r\n"
				+ "			<td>" + 1+"</td>\r\n"
				+ "			<td>" + 2 +"</td>\r\n"
				+ "			<td>" + 3 +"</td>\r\n"
				+ "			<td>" + 4 +"</td>\r\n"
				+ "			<td>" + 5 +"</td>\r\n"
				+ "		</tr>\r\n"
				+ "	\r\n"
				+ "	</table>");
		
		
	}

}
