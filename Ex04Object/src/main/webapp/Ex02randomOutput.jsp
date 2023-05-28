<%@page import="java.util.Random"%>
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
		
		Random rd = new Random();
		
		String[] index= request.getParameterValues("index");
		int q =rd.nextInt(index.length);
	%>
	<h1>랜덤 당첨 결과</h1>
	<fieldset>
		<legend>뽑기</legend>
		<table>
			<% 
				String juje = request.getParameter("juje");
			%>
			<tr>
				<td><%=juje %></td>
			</tr>
			<tr>
				<td><%=index[q]%></td>
			</tr>
			<%
				
			%>
		</table>
	</fieldset>
</body>
</html>