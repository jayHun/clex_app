<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View Page</title>
</head>
<body>
	<h2>This is MVC -> View Page for clex main</h2>
	<div>JSP List Test</div>
	<c:forEach var="item" items="${list}" varStatus="idx">
	${idx.index}, ${item} <br />
	</c:forEach>
</body>
</html>
