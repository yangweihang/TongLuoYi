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
			<td>微信ID</td>
			<td>昵称</td>
			<td>姓名</td>
			<td>性别</td>
			<td>出生日期</td>
			<td>手机号码</td>
			<td>所在城市</td>
			<td>合伙人类型</td>
			<td>合伙人级别</td>
			<td>钱包余额</td>
		</tr>
		<c:forEach items="${list }" var="p">
			<tr>
				<td>${p.wxid }</td>
				<td>${p.username }</td>
				<td>${p.name }</td>
				<td>${p.sex }</td>
				<td>${p.date }</td>
				<td>${p.phonenum }</td>
				<td>${p.city }</td>
				<td>${p.manner }</td>
				<td>${p.level }</td>
				<td>${p.balance }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>