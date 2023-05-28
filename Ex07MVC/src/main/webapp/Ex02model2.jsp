<%@page import="java.util.List"%>
<%@page import="com.smhrd.model.FullStack"%>
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
	<!-- 세션안에 저장되어 있는 학생정보(3명) 테이블 출력 -->
	<%
	List<FullStack> fslist = (ArrayList<FullStack>) session.getAttribute("fslist");
	%>
	
	<%-- <fieldset>
		<legend>
			학생정보
		</legend>
		<table>
			<%
			
			if (fslist != null && !fslist.isEmpty()) {
                for (FullStack fs : fslist) {
            %>
            <tr>
                <td><%= fs.getName() %></td>
                <td><%= fs.getMajor() %></td>
                <td><%= fs.getPhone() %></td>
            </tr>
            <% 
                }
            }
			%>
		</table>
	</fieldset> --%>
	
	 <table border=1>
	 	<tr>
	 		<th>이름</th>
	 		<th>전공</th>
	 		<th>번호</th>
	 </tr>
	 <%for(FullStack fs: fslist){ %>
	 <tr>
	 	<td><%=fs.getName() %></td>
	 	<td><%=fs.getMajor() %></td>
	 	<td><%=fs.getPhone() %></td>
	 </tr>
	 <%} %>
	 </table>
</body>
</html>