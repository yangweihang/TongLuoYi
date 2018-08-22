<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<td>管理员微信id</td>
		<td>管理员姓名</td>
		<td>管理员手机号</td>
	</tr>
	<c:forEach items="${list }" var="a">
		<tr>
			<td>${a.wxid }</td>
			<td>${a.name }</td>
			<td>${a.phonenum }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>