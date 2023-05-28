package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex04")
public class Ex04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String CheckPw = request.getParameter("CheckPw");
		String gender = request.getParameter("gender");
		String blood = request.getParameter("blood");
		String birthday = request.getParameter("birthday");
		String[] hobby = request.getParameterValues("hobby");
		String color = request.getParameter("color");
		String talk = request.getParameter("talk");
		
		
		PrintWriter out = response.getWriter();
		out.print("아이디 :" + id + "<br>");
		out.print("비밀번호 :" + pw + "<br>");
		if(pw.equals(CheckPw)) {
			out.print("비밀번호가 일치하지 않습니다."+ "<br>");
		}
		out.print("성별 :" + gender+ "<br>");
		out.print("혈액형 :" + blood+ "<br>");
		out.print("생일 :" + birthday+ "<br>");
		for(int i=0; i<hobby.length; i++) {
			out.print(hobby[i] + " ");
		}
		out.print("<br>");
		out.print("좋아하는 색: " + color+ "<br>");
		out.print("남기고 싶은 말 :" + talk);
		out.print("안녕");
		out.print("안녕");
		
		
	}

}
