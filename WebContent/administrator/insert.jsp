<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<form action="<%=path%>/administrator/insert" method="post">
	<table>
		<tr>
			<td>微信id</td>
			<td><input type="text" id="wxid" name="wxid"></td>
		</tr>
		<tr>
			<td>姓名</td>
			<td><input type="text" id="name" name="name"></td>
		</tr>
		<tr>
			<td>电话</td>
			<td><input type="text" id="phonenum" name="phonenum"></td>
		</tr>
		<tr>
			<td><input type="submit" value="提交"></td>
		</tr>
	</table>
</form>
<a href="<%=path%>/administrator/select">查询</a>
</body>
</html>