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
      // redirect 기능 - response
      // 현재 실행중인 jsp 페이지의 실행을 중단하고
      // 다른 페이지가 대신 호출되도록 만들어줌!
      // response.sendRedirect("Ex02createInput.html");
   
   String url = request.getParameter("url");
   // 네이버, 구글, 다음
   
   String move = "";
   if(url.equals("네이버")){
      move = "http://www.naver.com";
   } else if(url.equals("구글")){
      move = "http://www.google.com";
   } else if(url.equals("다음")){
       move="http://www.daum.net" ;
    }

   response.sendRedirect(move);
   
   
   %>
</body>
</html>