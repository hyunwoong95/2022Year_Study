<%@page import="kr.human.jdbc.JDBCUtil"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바로 테이블을 만들어 보자</title>
</head>
<body>
	<%
		Connection conn = null;
		Statement stmt = null;
		try{
			conn = JDBCUtil.getConnection();
			// 자동 커밋을 취소한다.
			conn.setAutoCommit(false);
			// 명령들을 실행한다.
			StringBuffer sb = new StringBuffer();
			// if not exists : 테이블이 없다면 만들고 있으면 만들지 않는다.
			sb.append("create table if not exists addr(");
			sb.append("idx int primary key auto_increment,");
			sb.append("name varchar(30) not null,");
			sb.append("age int default 0,");
			sb.append("birth timestamp defult now()");
			sb.append(")");
			stmt = conn.createStatement();
			out.println("SQL 명령 : " + sb.toString() + "<br>");
			int result = stmt.executeUpdate(sb.toString());
			out.println("결과 : " + result + "<br>");
			// 에러 없이 명령이 모두 성공하면 커밋한다.
			conn.commit();
		}catch(SQLException e){
			// 에러가 발생하면 모든 명령을 취소한다.
			JDBCUtil.rollback(conn);
			e.printStackTrace();
		}finally{
			JDBCUtil.close(stmt);
			JDBCUtil.close(conn);
		}
	%>
</body>
</html>