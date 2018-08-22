<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<td>级别</td>
		<td>身份</td>
		<td>一级上线消费提成</td>
		<td>二级上线消费提成</td>
		<td>一级上线租用提成</td>
		<td>二级上线租用提成</td>
		<td>一级上线销售提成</td>
		<td>二级上线销售提成</td>
	</tr>
	<c:forEach items="${list }" var="c">
		<tr>
			<td>${c.level }</td>
			<td>${c.identity }</td>
			<td>${c.xftcone }</td>
			<td>${c.xftctwo }</td>
			<td>${c.zytcone }</td>
			<td>${c.zytctwo }</td>
			<td>${c.xstcone }</td>
			<td>${c.xstctwo }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>