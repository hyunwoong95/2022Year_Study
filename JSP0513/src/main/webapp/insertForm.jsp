<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insertOk.jsp" method="post">
		이름 : <input type="text" name="name" required="required"/> <br />
		나이 : <input type="number" name="age" required="required"/> <br />
		<input type="submit" value="저장하기" />
	</form>
</body>
</html>