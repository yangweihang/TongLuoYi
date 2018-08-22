<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td colspan="2"></td>
			<td colspan="3">积分来源</td>
			<td></td>
		</tr>
		<tr>
			<td>微信ID</td>
			<td>获取时间</td>
			<td>消费</td>
			<td>星评</td>
			<td>留言</td>
			<td>当前积分</td>
		</tr>
		<tr>
			<td>${it.wxid }</td>
			<td>${it.date }</td>
			<td>${it.xiaofei }</td>
			<td>${it.xingping }</td>
			<td>${it.liuyan }</td>
			<td>${it.xiaofei+it.xingping+it.liuyan }</td>
		</tr>
	</table>
</body>
</html>