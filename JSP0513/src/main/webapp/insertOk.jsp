<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="kr.human.jdbc.JDBCUtil"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// POST방식에서 한글깨지므로 인코딩 지정
	request.setCharacterEncoding("UTF-8");
	// POST전송이 아니면 입력 폼으로 보낸다. 
	if(!request.getMethod().equals("POST")){
		response.sendRedirect("insertForm.jsp");
		return;
	}
	
	// 전송된값을 받아보자!!!
	String name = request.getParameter("name");
	int age = 0;
	try{
		age = Integer.parseInt(request.getParameter("age"));
	}catch(Exception e){
		;
	}

	Connection conn = null;
	// Statement  stmt = null;
	PreparedStatement pstmt = null; // 미완성 명령어를 만든다.
	try{
		conn = JDBCUtil.getConnection();
		// 자동 커밋을 취소한다.
		conn.setAutoCommit(false);
		// 명령들을 실행한다.
		//stmt = conn.createStatement();
		// String sql = "insert into addr (name, age) values ('" + name + "'," + age + ")"; 
		//stmt.executeUpdate(sql);
		String sql = "insert into addr (name, age) values(? , ?)"; // 바뀔 부분을 ?로 만든다.
		pstmt = conn.prepareStatement(sql);
		// ?를 값으로 치환한다.
		pstmt.setString(1,name); // pstmt.setString(순서,name);
		pstmt.setInt(2, age);
		
		pstmt.executeUpdate(); // 빈괄호여야한다. 이미 전에 값을 대입했기 때문에
		
		// 에러 없이 명령이 모두 성공하면 커밋한다.
		conn.commit();
	}catch(SQLException e){
		// 에러가 발생하면 모든 명령을 취소한다.
		JDBCUtil.rollback(conn);
		e.printStackTrace();
	}finally{
		JDBCUtil.close(pstmt);
		JDBCUtil.close(conn);
	}
	response.sendRedirect("addrList.jsp"); // 목록으로 가기!!
%>