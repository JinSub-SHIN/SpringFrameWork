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

<h1> 예외 Page 입니다 . . </h1>

<h3>에러메시지 : ${errMsg}</h3>
<h3>에러Info : ${errInfo}</h3>

<a href="${pageContext.request.contextPath}/exception.html">메인으로...</a>

<button onclick="history.back()">뒤로가기</button>

</body>
</html>