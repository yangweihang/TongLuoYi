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
<form action="<%=path%>/maintain/update" method="post">
	<table>
		<tr>
			<input type="text" id="pwxid" name="pwxid" value="${param.pwxid }">
			<td>工程师微信id</td>
			<td><input type="text" id="wxid" name="wxid" value="2109-17"></td>
		</tr>
		<tr>
			<td>工程师判断</td>
			<td><input type="text" id="judge" name="judge"></td>
		</tr>
		<tr>
			<td>维修记录</td>
			<td><input type="text" id="record" name="record"></td>
		</tr>
		<tr>
			<td>维修结果</td>
			<td><input type="text" id="result" name="result"></td>
		</tr>
		<tr>
			<td><input type="submit" value="提交"></td>
		</tr>
	</table>
</form>
</body>
</html>