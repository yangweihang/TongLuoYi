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
<form action="<%=path%>/maintain/insert" method="post">
	<table>
		<tr>
			<td>设备名称</td>
			<td><input type="text" id="dname" name="dname" value="通络机"></td>
		</tr>
		<tr>
			<td>设备地址</td>
			<td><input type="text" id="address" name="address" value="辽宁省沈阳市"></td>
		</tr>
		<tr>
			<td>合伙人姓名</td>
			<td><input type="text" id="pname" name="pname" value="sdhsj"></td>
		</tr>
		<tr>
			<td>合伙人微信id</td>
			<td><input type="text" id="pwxid" name="pwxid" value="djs"></td>
		</tr>
		<tr>
			<td>联系人姓名</td>
			<td><input type="text" id="lname" name="lname" value="sdhsj"></td>
		</tr>
		<tr>
			<td>联系人电话</td>
			<td><input type="text" id="phonenum" name="phonenum" value="1980291029189"></td>
		</tr>
		<tr>
			<td>故障描述</td>
			<td><input type="text" id="gdescribe" name="gdescribe"></td>
		</tr>
		<tr>
			<td><input type="submit" value="提交"></td>
		</tr>
	</table>
</form>
</body>
</html>