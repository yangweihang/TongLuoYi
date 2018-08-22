<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<form action="<%=path%>/deviceinout/insertscrap" method="post">
	<input type="hidden" id="serialnum" name="serialnum" value="<%=serialnum%>">
	<table>
		<tr>
			<td>报废原因</td>
			<td>
				<input type="text" id="note" name="note">
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