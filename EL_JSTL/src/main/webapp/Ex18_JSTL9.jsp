<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>format태그</h1>
	<hr />
	<%-- 날짜를 원하는 형식으로 출력해보자 --%>
	<jsp:useBean id="today" class="java.util.Date"/>
	
	${today } <br />
	<fmt:formatDate value="${today }"/> <br />
	<fmt:formatDate value="${today }" type="date"/><br />
	<fmt:formatDate value="${today }" type="time"/><br />
	<fmt:formatDate value="${today }" type="both"/><br />
	<hr />
	<fmt:formatDate value="${today }" type="date" dateStyle="full"/><br />
	<fmt:formatDate value="${today }" type="date" dateStyle="long"/><br />
	<fmt:formatDate value="${today }" type="date" dateStyle="medium"/><br />
	<fmt:formatDate value="${today }" type="date" dateStyle="short"/><br />
	<hr />
	<fmt:formatDate value="${today }" type="time" dateStyle="full"/><br />
	<fmt:formatDate value="${today }" type="time" dateStyle="long"/><br />
	<fmt:formatDate value="${today }" type="time" dateStyle="medium"/><br />
	<fmt:formatDate value="${today }" type="time" dateStyle="short"/><br />
	<hr />
	<fmt:formateDate value="${today }" type="both" dateStyle="short" timeStyle="short"/><br />
	<%-- 내가 모양 지정해서 출력 --%>
	<fmt:formatDate value="${today }" pattern="MM-dd(E) hh:mm"/> <br />
	<fmt:formatDate value="${today }" pattern="MM-dd(E) hh:mm" var="date"/>
	${date }
	<br />
	
	
</body>
</html>