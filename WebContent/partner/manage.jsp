<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
			<td>微信ID</td>
			<td>昵称</td>
			<td>姓名</td>
			<td>性别</td>
			<td>出生日期</td>
			<td>手机号码</td>
			<td>所在城市</td>
			<td>合伙人类型</td>
			<td>合伙人级别</td>
			<td>钱包余额</td>
			<td>设备信息</td>
			<td>一级上线微信ID</td>
			<td>二级上线微信ID</td>
			<td>一级下线微信ID</td>
			<td>二级下线微信ID</td>
			<td>店铺管理员</td>
		</tr>
		<c:forEach items="${list }" var="p">
			<tr>
				<td>${p.get("wxid") }</td>
				<td>${p.get("username") }</td>
				<td>${p.get("name") }</td>
				<td>${p.get("sex") }</td>
				<td>${p.get("date") }</td>
				<td>${p.get("phonenum") }</td>
				<td>${p.get("city") }</td>
				<td>${p.get("manner") }</td>
				<td>${p.get("level") }</td>
				<td>${p.get("balance") }</td>
				<td><a href="<%=path%>/partnerequipment/select?pwxid=${p.get("id")}">设备信息</a></td>
				<td><a href="<%=path%>/partner/selectone?id=${p.get("id")}">查看一级上线</a></td>
				<td><a href="<%=path%>/partner/selecttwo?id=${p.get("id")}">查看二级上线</a></td>
				<td><a href="<%=path%>/partner/selectthree?id=${p.get("id")}">查看一级下级</a></td>
				<td><a href="<%=path%>/partner/selectfour?id=${p.get("id")}">查看二级下级</a></td>
				<td>${p.get("aname") }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>