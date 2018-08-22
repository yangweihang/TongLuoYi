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
			<td>设备编号</td>
			<td>开机时间</td>
			<td>本次使用时长(分钟)</td>
		</tr>
		<c:forEach items="${list }" var="u">
			<tr>
				<td>${u.serialnum }</td>
				<td>${u.kjtime }</td>
				<td>${u.duration }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>