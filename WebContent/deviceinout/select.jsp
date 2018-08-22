<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
    String path = request.getContextPath();
    %>
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
			<td>库存状态</td>
			<td>入库时间</td>
			<td>出库时间</td>
			<td>绑定合伙人</td>
			<td>合伙人手机号</td>
			<td>使用形式</td>
		</tr>
		<c:forEach items="${list }" var="d">
			<tr>
				<td>${d.serialnum }</td>
				<td>${d.intime }</td>
				<td>${d.inventorystatus }</td>
				<td>${d.outtime }</td>
				<td>--</td>
				<td>--</td>
				<td>${d.manner }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>