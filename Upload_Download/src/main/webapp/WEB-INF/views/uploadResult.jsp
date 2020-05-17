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

<h1> 업로드 된 결과.. </h1>

<h3>
	작성자 : ${name} <p>
	파일이름 : ${fileName} <p>
	파일용량 : ${fileSize} <p>
	저장경로 : ${path} <p>
</h3>

<hr>

<h1>업로드된 결과 - UploadDTO 객체 </h1>
<h3>
	작성자 : ${uploadDTO.name}<p>
	파일이름 : ${uploadDTO.fileName}<p>
	파일용량 : ${uploadDTO.fileSize}<p>
	저장경로 : ${path2}<p>
</h3>



</body>
</html>