<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String path = request.getContextPath();
    %>
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
		<td>设备名称</td>
		<td>设备地址</td>
		<td>合伙人姓名</td>
		<td>联系人姓名</td>
		<td>联系人电话</td>
		<td>故障描述</td>
		<td>工程师判断</td>
		<td>维修记录</td>
		<td>维修结果</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${list }" var="m">
		<tr>
			<td>${m.dname }</td>
			<td>${m.address }</td>
			<td>${m.pname }</td>
			<td>${m.lname }</td>
			<td>${m.phonenum }</td>
			<td>${m.gdescribe }</td>
			<td>${m.judge }</td>
			<td>${m.record }</td>
			<td>${m.result }</td>
			<td>
				<c:if test="${m.result eq null }">
					<a href="<%=path%>/maintain/update.jsp?pwxid=${m.pwxid}">接单</a>
				</c:if>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>