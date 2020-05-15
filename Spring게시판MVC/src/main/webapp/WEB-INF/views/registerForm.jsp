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

<h1> 등록 폼 입니다 </h1>
<form action="register.kosta" method="post">
번호<input type="text" name="no"><br>
제목<input type="text" name="title"><br>
내용<textarea rows="10" cols="20" name="detail"></textarea><br>
날짜<input type="text" name="date"><br>
작성자<input type="text" name="name"><br>
<input type="submit" value="등록">
</form>
</body>
</html>