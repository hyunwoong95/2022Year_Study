<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file = "include.jsp" %> <%-- 이자리에 코드가 복사되어 붙여지고 서블릿으로 변환된다. --%>
	이름 : <%=name %> <br />
	나이 : <%=age %>세 <br />
	
</body>
</html>