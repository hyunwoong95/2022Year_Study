<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키를 저장해 보자</title>
</head>
<body>
	<%
		Cookie cookie1 = new Cookie("name", URLEncoder.encode("한사람","UTF-8"));
		Cookie cookie2 = new Cookie("age", "23");
		cookie1.setMaxAge(60*60*24*7); //일주일 동안 보관해라!!
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
	%>
	
	<a href="readCookie.jsp">저장된 쿠키 보기</a>
</body>
</html>