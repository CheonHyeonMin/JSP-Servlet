<%@page import="java.sql.SQLException"%>
<%@page import="com.smhrd.model.FullStack"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- WEB MVC MODEL 1 : 비지니스로직(Controller), 화면표현(View) -> JSP로 작성 -->
<!--  -->
<!-- DB연동(JDBC) -->
	
	
	<%
		Connection conn= null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		FullStack fs = null;
	
		try{
			//오라클과 연결할 드라이버 가지고 오기(동적 로딩)
			Class.forName("oracle.jdbc.OracleDriver");
			
			//지정한 데이터베이스와 연결하기 위한 객체(Connection) 생성
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="service";
			String password="12345";
			
			 conn = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from fullstack where name=?";
			//sql 쿼리문을 다루기 위한 객체(PreparedStatement) 생성 :
			 ps = conn.prepareStatement(sql);
			//? 자리 채우기
			ps.setString(1, "선영표");
			
			//INSER, DELETE, UPDATE ->executeUpdate() -> int
			//SELECT (READ) -> executeQuery() -> ResultSet(읽어온 데이터, 커서)
			//sql 실행
			 rs = ps.executeQuery();
			if(rs.next()){ //next() -> true/ false
				String name = rs.getString("name"); //컬럼이름 지정
				String major = rs.getString(2); //테이블 상 2번째 컬럼값 지정
				String phone = rs.getString("phone");
				
				 fs = new FullStack(name, major, phone);
			}
		}catch(ClassNotFoundException e){
			//OracleDriver 가지고 올때 경로가 잘못됐을 경우
			System.out.println("클래스 못찾음!");
			
		}catch(SQLException e){
			System.out.println("sql 예외 발생!");
		}catch(Exception e){
			System.out.println("다른 예외 발생!");
			e.printStackTrace();
		}finally{ //예외상황이 발생 하던지 / 하지 않던지 간에 무조건 실행!
			//사용한 자원 반환(생성한 순서 반대로!)
			
			try{
				rs.close();
				ps.close();
				conn.close();
			}catch(Exception e){
				System.out.println("finally 에서 예외상황 발생!");
				e.printStackTrace();
			}
			
			
		}
		
	%>
	이름 : <%=fs.getName() %><br>
	전공 : <%=fs.getMajor() %><br>
	핸드폰 : <%=fs.getPhone() %>
</body>
</html>