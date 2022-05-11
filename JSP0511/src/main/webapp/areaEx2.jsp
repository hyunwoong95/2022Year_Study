<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	페이지 영역의 변수 값 : <%=pageContext.getAttribute("i") %> 
    request 영역의 변수 값 : <%=request.getAttribute("i") %> 
	session 영역의 변수 값 : <%=session.getAttribute("i") %> 
	application 영역의 변수 값 : <%=application.getAttribute("i") %> 
	
	<hr />
	<h2> EL을 쓰면 편리하다. (EL로 값을 출력하면 반드시 영역에 저장되어있어야 한다.)</h2>
	변수값 : ${i } <br />
	페이지 영역의 변수값 : ${pageScope.i } <br />
	request 영역의 변수값 : ${requestScope.i } <br />
	session 영역의 변수값 : ${sessionScope.i } <br />
	application 영역의 변수값 : ${applicationScope.i } <br />
</body>
</html>