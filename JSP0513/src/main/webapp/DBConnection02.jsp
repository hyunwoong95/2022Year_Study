<%@page import="kr.human.jdbc.JDBCUtil"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
		Connection conn = null; // 연결
		Statement  stmt = null; // 명령
		ResultSet  rs = null;   // 결과
		try{
			// 1. DB에 연결한다.
			conn = JDBCUtil.getConnection();
			out.println("연결 성공 : " + conn + "<br>");
			// 2. 사용
			String sql = "select now() date, 123*4 as num, '한사람' name"; // 실행할 명령
			stmt = conn.createStatement(); // 명령 객체 얻기
			// select  명령은 executeQuery()로 실행하고 ResultSet으로 받는다.
			// 그외의  명령은 executeUpdate()로 실행하고 int 로 받는다.
			rs = stmt.executeQuery(sql); // 명을을 실행해서 결과 받기
			if(rs.next()){ // 결과 있다면
				do{
					out.println(rs.getString("date") + "<br>");
					out.println(rs.getInt("num") + "<br>");
					out.println(rs.getString("name") + "<br>");
				}while(rs.next()); // 반복
			}else{
				out.println("없다<br>");
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			// 4. 닫기(역순으로 닫는다.)
			JDBCUtil.close(rs);
			JDBCUtil.close(stmt);
			JDBCUtil.close(conn);
		}
	%>
</body>
</html>