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
	<form action="<%=path%>/usestatistical/insert" method="post">
		<table>
			<tr>
				<td>设备编号</td>
				<td><input type="text" id="serialnum" name="serialnum"></td>
			</tr>
			<tr>
				<td>本次时长</td>
				<td><input type="text" id="duration" name="duration"></td>
			</tr>
			<tr>
				<td>会员ID</td>
				<td><input type="text" id="uid" name="uid"></td>
			</tr>
			<tr>
				<td><input type="submit" id="sub" value="提交"></td>
			</tr>
		</table>
	</form>
	<a href="<%=path%>/usestatistical/selectByUid?uid=1">查询</a>
</body>
</html>