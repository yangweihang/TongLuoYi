<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%
    String path = request.getContextPath();
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=path%>/js/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		//alert('${result}');
	});
</script>
</head>
<body>
	<form action="<%=path%>/userdetails/insert" method="post">
		<table>
			<tr>
				<td>微信id</td>
				<td><input type="text" id="wxid" name="wxid" value="2109-09"></td>
			</tr>
			<tr>
				<td>昵称</td>
				<td><input type="text" id="name" name="name" value="皮皮虾"></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input type="text" id="username" name="username" value="王博文"></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><input type="text" id="sex" name="sex" value="男"></td>
			</tr>
			<tr>
				<td>出生日期</td>
				<td><input type="text" id="date" name="date" value="1994-09-10"></td>
			</tr>
			<tr>
				<td>手机号</td>
				<td><input type="text" id="phonenum" name="phonenum" value="15898391987"></td>
			</tr>
			<tr>
				<td>所在城市</td>
				<td><input type="text" id="city" name="city" value="沈阳"></td>
			</tr>
			<tr>
				<td>余额</td>
				<td><input type="text" id="saldo" name="saldo" value="100"></td>
			</tr>
			<tr>
				<td>权限</td>
				<td><input type="text" id="permisos" name="permisos" value="1"></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交"></td>
				<span id="span"></span>
			</tr>
		</table>
	</form>
</body>
</html>