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
		
		session.setAttribute("nickname", "풀스택");
		//다운캐스팅 해줘야됨
		Object nick = session.getAttribute("nickname");
		
	%>
	<%=nick %>
	${nickname}
	<a href="Ex03session2.jsp">2로 이동</a>
</body>
</html>