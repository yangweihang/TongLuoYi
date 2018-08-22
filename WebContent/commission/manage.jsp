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
<table border="1">
	<tr>
		<td>会员级别</td>
		<td>合伙人级别</td>
		<td>收入累计金额(元)</td>
		<td>经营收益</td>
		<td>消费一级下线</td>
		<td>消费二级下线</td>
		<td>租用一级下线</td>
		<td>租用二级下线</td>
		<td>购买一级下线</td>
		<td>购买二级下线</td>
		<td>已提现金额(元)</td>
		<td>钱包余额(元)</td>
	</tr>
	<tr>
		<td>${ml.level }</td>
		<td>${p.level }合伙人</td>
		<td>${sm }</td>
		<td><a href="<%=path %>/commission/detail?type=1&wxid=fffdsf">${money }</a></td>
		<c:if test="${xfone eq 0 }">
			<td></td>
		</c:if>
		<c:if test="${xfone ne 0 }">
			<td>${xfone }</td>
		</c:if>
		<c:if test="${xftwo eq 0 }">
			<td></td>
		</c:if>
		<c:if test="${xftwo ne 0 }">
			<td>${xftwo }</td>
		</c:if>
		<c:if test="${zyone eq 0 }">
			<td></td>
		</c:if>
		<c:if test="${zyone ne 0 }">
			<td>${zyone }</td>
		</c:if>
		<c:if test="${zytwo eq 0 }">
			<td></td>
		</c:if>
		<c:if test="${zytwo ne 0 }">
			<td>${zytwo }</td>
		</c:if>
		<c:if test="${gmone eq 0 }">
			<td></td>
		</c:if>
		<c:if test="${gmone ne 0 }">
			<td>${gmone }</td>
		</c:if>
		<c:if test="${gmtwo eq 0 }">
			<td></td>
		</c:if>
		<c:if test="${gmtwo ne 0 }">
			<td>${gmtwo }</td>
		</c:if>
		<td></td>
		<td>${p.balance }</td>
	</tr>
</table>
</body>
</html>