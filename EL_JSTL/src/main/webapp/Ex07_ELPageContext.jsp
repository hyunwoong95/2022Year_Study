<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- JSTL을 사용하려면 태그라이브러리 디렉티브를 써야 한다. --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>EL에서 pageContext 내장 객체를 이용하면 jsp기본 객체에 접근이 가능하다.</h2>
	
	접속자 IP : <%=request.getRemoteAddr() %> <br />
	접속자 IP : ${request.remoteAddr } <br />
	접속자 IP : ${pageContext.request.remoteAddr } <br />
	
	컨텍스트 패스 : <%=request.getContextPath() %> <br />
	컨텍스트 패스 : ${pageContext.request.servletContext } <br />
	컨텍스트 패스 : ${pageContext.request.contextPath } <br />
	
</body>
</html>