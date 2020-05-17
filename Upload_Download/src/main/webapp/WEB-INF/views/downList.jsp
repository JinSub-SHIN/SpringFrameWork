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

<h1> 다운로드 리스트 목록 </h1>

<ol>
<c:forEach items="${fileNames}" var="file" varStatus="state">	
		<li> <a href="down.do?fname=${file}" style="text-decoration: none;">${file} </a>
		</li>	
</c:forEach>
</ol>
</body>
</html>