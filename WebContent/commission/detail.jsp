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
		<td>微信id</td>
		<td>下级微信id</td>
		<td>获得金额</td>
	</tr>
	<c:if test="${type eq 1 }">
		<c:forEach items="${list }" var="c">
			<tr>
				<c:if test="${c.onewxid ne null }">
					<td>${c.onewxid }</td>
				</c:if>
				<c:if test="${c.twowxid ne null }">
					<td>${c.twowxid }</td>
				</c:if>
				<td>${c.wxid }</td>
				<td>${c.xfone+c.xftwo+c.zyone+c.zytwo+c.gmone+c.gmtwo }</td>
			</tr>
		</c:forEach>
	</c:if>
</table>
</body>
</html>