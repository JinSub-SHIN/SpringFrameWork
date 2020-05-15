<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> result.jsp 실행되었음... </h1>

<h3> ${requestScope.id}</h3>
<h3> ${requestScope.message}</h3>

	<hr>
	메시지 : ${msg} <p>
	
	<fieldset>
		<legend>취미</legend>	
	<c:forEach items="${hobbys}" var="h">
		<input type="checkbox" name="hobby" value="${h}">${h}
	</c:forEach>
	</fieldset>



</body>
</html>