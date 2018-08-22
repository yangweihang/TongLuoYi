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
		<td>设备型号</td>
		<td>设备编号</td>
		<td>设备二维码</td>
		<td>形式</td>
		<td>当前状态</td>
		<td>出库时间</td>
		<td>验收时间</td>
	</tr>
	<c:forEach items="${list }" var="z">
		<tr>
			<input type="text" id="s" value="${z.get("serialnum") }">
			<td>${z.get("model") }</td>
			<td>${z.get("serialnum") }</td>
			<td><img width="100px" height="100px" src="../icon?img=${z.get("serialnum")}"></td>
			<td>${z.get("manner") }</td>
			<td>${z.get("devicestatus") }</td>
			<td>${z.get("outtime") }</td>
			<td>${z.get("ystime") }</td>
		</tr>
	</c:forEach>
	<c:forEach items="${list1 }" var="x">
		<tr>
			<td>${x.get("model") }</td>
			<td>${x.get("serialnum") }</td>
			<td><img width="100px" height="100px" src="../icon?img=${x.get("serialnum")}"></td>
			<td>${x.get("manner") }</td>
			<td>${x.get("devicestatus") }</td>
			<td>${x.get("outtime") }</td>
			<td>${x.get("ystime") }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>