<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request 내장 객체 연습</title>
</head>
<body>
	클라이언트 주소 : <%=request.getRemoteAddr() %> <br />
	서버의 절대 주소 : <%=application.getRealPath(".") %> <br />
	<%=request.getContextPath() %> <br />
	<%=request.getRequestURI() %> <br />
	<%=request.getRequestURL() %> <br />
	<hr />
	<%= request.getServerName() %> <br />
	<%= request.getServerPort() %> <br />
	<%= request.getServletPath() %> <br />
	<%= request.getServletContext().getRealPath(".") %> <br /> <%-- application과 같다. --%>
	<hr />
	클라이 언트 정보<br />
	<%=request.getLocalAddr() %> <br />
	<%=request.getLocalName() %> <br />
	<%=request.getLocalPort() %> <br />
	<%=request.getLocale() %> <br />
</body>
</html>