<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// 로그 아웃을 처리하자 --- 세션에 저장된 정보를 삭제하면 된다.
	session.removeAttribute("userid");
	// session.invalidate(); // 강제 세션 종료!! 새로운 세션이 생성
	// 페이지 이동
	String referer = request.getHeader("referer"); // 있었던 페이지 정보
	response.sendRedirect(referer);
%>