<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="kr.human.jdbc.JDBCUtil"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java로 테이블을 만들어 보자</title>
</head>
<body>
	<%
		Connection conn = null;
		Statement  stmt = null;
		ResultSet  rs = null;
		try{
			conn = JDBCUtil.getConnection();
			// 자동 커밋을 취소한다.
			conn.setAutoCommit(false);
			// 명령들을 실행한다.
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from addr order by idx desc");
			if(rs.next()){
				out.println("<h2>목록보기</h2><hr>");
				do{
					out.println(rs.getInt("idx") + ". ");
					out.println(rs.getString("name") + "(");
					out.println(rs.getInt("age") + ") : ");
					out.println(rs.getDate("birth") + "<br>");
				}while(rs.next());
			}else{
				out.println("데이터가 없습니다.<br>");
			}
			
			// 에러 없이 명령이 모두 성공하면 커밋한다.
			conn.commit();
		}catch(SQLException e){
			// 에러가 발생하면 모든 명령을 취소한다.
			JDBCUtil.rollback(conn);
			e.printStackTrace();
		}finally{
			JDBCUtil.close(rs);
			JDBCUtil.close(stmt);
			JDBCUtil.close(conn);
		}
	%>
	<hr />
	<button onclick="location.href='insertForm.jsp'">등록하기</button>
</body>
</html>