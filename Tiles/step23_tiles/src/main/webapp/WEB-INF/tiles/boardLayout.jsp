<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	width: 800px;
	border: red solid 5px;
}

th {
	border-collapse: collapse;
	border: 1px solid gray;
}

.a {
	width: 600px;
}
</style>
<script></script>
</head>
<body>

	<table>
		<tr>
			<th colspan="2">
			<tiles:insertAttribute name="top"></tiles:insertAttribute>			
			</th>
		</tr>
		<tr>
			<th class="a"><tiles:insertAttribute name="content"></tiles:insertAttribute></th>
			<th><tiles:insertAttribute name="aside"></tiles:insertAttribute></th>
		</tr>
		<tr>
			<th colspan="2"><tiles:insertAttribute name="footer"></tiles:insertAttribute></th>
		</tr>
	</table>

</body>
</html>