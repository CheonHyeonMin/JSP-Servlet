<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//-- 세션 생성
		
		//1. 세션의 값 설정 : setAttribute(String(name),Object(value));
		session.setAttribute("id","smart");
		session.setAttribute("age",20);
		
		ArrayList<String> al =new ArrayList<String>();
		al.add("apple");
		al.add("banana");
		session.setAttribute("list", al);
	%>
	
	<a href="Ex05GetSession.jsp">세션확인</a>
	<a href="GetSession">세션확인(Servlet)</a>
	
</body>
</html>