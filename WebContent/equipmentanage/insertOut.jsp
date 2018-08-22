<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
    String path = request.getContextPath();
    String serialnum = request.getParameter("serialnum");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=path%>/deviceinout/insertout" method="post">
	<input type="hidden" id="serialnum" name="serialnum" value="<%=serialnum%>">
	<table>
		<tr>
			<td>形式</td>
			<td>
				<select id="manner" name="manner">
					<option value="">请选择</option>
					<option value="租出">租出</option>
					<option value="售出">售出</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>合伙人</td>
			<td>
				<input type="text" id="applicationid" name="applicationid">
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="提交">
			</td>
		</tr>
	</table>
</form>
</body>
</html>