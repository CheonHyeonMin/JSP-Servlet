<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>랜덤 당첨 게임</h1>
	<fieldset>
		<legend>랜덤뽑기</legend>
		<form action="Ex02randomOutput.jsp">
		
		<table>
			<tr>
				<td>주제</td>
				<td><input type="text" name="juje"></td>
			</tr>
			
				<%
					int ran = Integer.parseInt(request.getParameter("ran"));
					
					String index="";
					for(int i=0; i<ran;i++){%>
						<tr>
							<td>아이템</td>
							<td><input type="text" name="index"></td>
						</tr>
						
					<% 	
					}
				%>
				<tr cols="2" align="center">
					<td><input type="submit" value="랜덤뽑기"> </td>
				</tr>
			
			
		</table>
		</form>
	</fieldset>
</body>
</html>