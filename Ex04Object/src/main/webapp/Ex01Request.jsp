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
		String name =request.getParameter("name");
		int java = Integer.parseInt(request.getParameter("java"));
		int web = Integer.parseInt(request.getParameter("web"));
		int iot = Integer.parseInt(request.getParameter("iot"));
		int and = Integer.parseInt(request.getParameter("and"));
		String hak="";
		double avg = (java+web+iot+and)/4.0;
		if(avg>=95){
			hak="A+";
		}
		else if(avg>=90){
			hak="A";
		}
		else if(avg>=85){
			hak="B+";
		}
		else if(avg>=80){
			hak="B";
		}
		else{
			hak="F";
		}
	%>
	
	 <fieldset>
	 	<legend>
	 		학점확인프로그램
	 	</legend>
	 	<table>
            <tr>
               <td>이름</td>
               <td><%=name %></td>
            </tr>
            <tr>
               <td>Java점수</td>
               <td><%=java %></td>
            </tr>
            <tr>
               <td>Web 점수</td>
               <td><%=web %></td>
            </tr>
            <tr>
               <td>IoT 점수</td>
               <td><%=iot %></td>
            </tr>
            <tr>
               <td>Android 점수</td>
               <td><%=and %></td>
            </tr>
            <tr>
               <td>평균</td>
               <td><%=avg %></td>
            </tr>
            <tr>
               <td>학점</td>
               <td><%= hak%></td>
            </tr>
         </table>
	 
	 </fieldset>
	
	
</body>
</html>