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
		// 세션에서 로그인된 정보를 읽는다.
		String userid = (String)session.getAttribute("userid");
		if(userid==null || userid.trim().length()==0){
			out.println("<a href='login.jsp'>로그인 하기</a>");
		}else{
			out.println(userid + "님 반갑습니다.!!!!<br>");			
			out.println("<a href='logout.jsp'>로그아웃</a>");
		}
		out.println("<br><hr>");
		out.println("referer(어디서 유입되었는지 알아내기) : " + request.getHeader("referer") + "<br>");
	%>
</body>
</html>