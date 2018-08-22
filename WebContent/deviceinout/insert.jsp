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
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
 	$("#sub").click(function(){
 		if($("#devicenos").val() == ''){
 			alert("设备编号不可以为空！");
	 		return false;
 		}
 		if($("#devicename").val() == ''){
 			alert("设备型号不可以为空！");
 			return false;
 		}
 		$("#form1").submit();
 	});
});
</script>
</head>
<body>
	<form action="<%=path%>/deviceinout/insert" id="form1" method="post">
		<table style="margin-top:20px;">
   			<tr>
   				<td>设备编号:</td>
   				<td><input type="text" name="devicenos" id="devicenos"></td>
   			</tr>
   			<tr>
   				<td>设备型号:</td>
   				<td><input type="text" name="devicename" id="devicename"></td>
   			</tr>
   			<tr>
   				<input type="button" value="新增" id="sub">
   				<input type="reset" value="重置">
   			</tr>
   		</table>
	</form>
</body>
</html>