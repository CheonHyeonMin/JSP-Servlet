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
		
		
		//다운캐스팅 해줘야됨
		Object nick = session.getAttribute("nickname");
		
	%>
	<%=nick %>
	${nickname}
	
</body>
</html>