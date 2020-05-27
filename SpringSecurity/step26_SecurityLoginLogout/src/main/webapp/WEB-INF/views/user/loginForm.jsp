<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

</style>
<script></script>
</head>
<body>
<h1>유저 loginForm.jsp - 로그인 폼</h1>

<c:if test="${param.ng!=null}">
	Login Fail!
	Message : ${SPRING_SECURITY_LAST_EXCEPTION.message}
</c:if>

<form action="${pageContext.request.contextPath}/loginCheck" method="post">
아이디 : <input type="text" name="id"><br>
비밀번호 : <input type="password" name="pwd"><br>
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
<input type="submit" value="로그인">
</form>

</body>
</html>