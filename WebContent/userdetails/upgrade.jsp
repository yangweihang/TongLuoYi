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
			<td>ID</td>
			<td>微信ID</td>
			<td>昵称</td>
			<td>姓名</td>
			<td>姓别</td>
			<td>出生日期</td>
			<td>手机号码</td>
			<td>所在城市</td>
		</tr>
		<c:forEach items="${list }" var="u">
			<tr>
				<td>${u.id }</td>
				<td>${u.wxid }</td>
				<td>${u.name }</td>
				<td>${u.username }</td>
				<td>${u.sex }</td>
				<td>${u.date }</td>
				<td>${u.phonenum }</td>
				<td>${u.city }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>