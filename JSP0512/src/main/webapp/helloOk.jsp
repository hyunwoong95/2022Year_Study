<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- VO로 한번에 받아보자!!! --%>
	<%-- jsp:useBean은 
		PersonVO vo = new PersonVO();
		request.setAttribute("vo",vo); 
	--%>
	<jsp:useBean id="vo" class="kr.human.vo.PersonVO" scope="request"/>
	<%-- 
	vo의 setter를 불러줘야 한다. 
	property="*" 게 쓰면 모든 setter를 불러준다.
	--%>
	<jsp:setProperty property="*" name="vo"/> 
	<%-- 특정 setter를 불러 직접 값 입력도 가능하다. --%>
	<jsp:setProperty property="ip" name="vo" value="<%=request.getRemoteAddr() %>"/>
	
	이름 : <jsp:getProperty property="name" name="vo"/> <br />
	이름 : ${vo.name } <br />
	<hr />
	${vo }
	 
</body>
</html>