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
	<form action="<%=path%>/integral/insert" method="post">
		<table>
			<tr>
				<td>微信ID</td>
				<td><input type="text" id="wxid" name="wxid" value="2109-09"></td>
			</tr>
			<tr>
				<td>获取时间</td>
				<td><input type="text" id="date" name="date" value="2019-09-09"></td>
			</tr>
			<tr>
				<td>消费</td>
				<td><input type="text" id="xiaofei" name="xiaofei" value="3"></td>
			</tr>
			<tr>
				<td>星评</td>
				<td><input type="text" id="xingping" name="xingping" value="1"></td>
			</tr>
			<tr>
				<td>留言</td>
				<td><input type="text" id="liuyan" name="liuyan" value="1"></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
	<a href="<%=path%>/integral/selectOne?wxid=2109-09">查询</a>
</body>
</html>