<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모든쿠키를 읽어 보자</title>
</head>
<body>
	<h2>모든 쿠키</h2>
	<%
		Cookie[] cookies = request.getCookies(); //모든 쿠키를 읽는다.
		if(cookies != null && cookies.length>0){ // 쿠키가 있다면
			for(Cookie cookie : cookies){
				out.println(cookie.getName() + " : " + URLDecoder.decode(cookie.getValue(),"UTF-8") + "<br>");
			}
		}
	%>
</body>
</html>