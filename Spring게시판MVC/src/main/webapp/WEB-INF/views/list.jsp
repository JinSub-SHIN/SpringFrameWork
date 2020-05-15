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

<h1> 리스트 출력 </h1>

<button onclick="location.href='registerForm.kosta'">등록하기</button>

<table class="table" style="display: table; width: 500px; border: 1px solid" >
<tr>
	<th>글번호</th>
	<th>번호</th>
	<th>제목</th>
	<th>날짜</th>
	<th>작성자</th>
	<th>삭제</th>
</tr>
<c:forEach items="${list}" var="board" varStatus="state">
	<tr>
	<td>${state.count}
	<td>${board.no}
	<td><button name="${board.no}" onclick="location.href='read/${baord.no}.kosta'">${board.title}</button></td>
	<td>${board.date}</td>
	<td>${board.name}</td>
	<td><button onclick="location.href='delete/${board.no}.kosta'">삭제</button></td>
	</tr>
</c:forEach>
</table>


</body>
</html>