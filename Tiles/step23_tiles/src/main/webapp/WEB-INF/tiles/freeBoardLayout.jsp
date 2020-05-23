<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#a{
		width: 800px; height: 400px; background-color: pink;
	}
	#b{
		width: 800px; height: 400px; background-color: orange;
	}

</style>
<script></script>
</head>
<body>
<div id="a">
	<tiles:insertAttribute name="top"></tiles:insertAttribute>
</div>
<div id="b">
	<tiles:insertAttribute name="bottom"></tiles:insertAttribute>
</div>
</body>
</html>