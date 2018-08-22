<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
    String path = request.getContextPath();
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=path%>/js/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#name").blur(function(){
			if($("#name").val() == ''){
				alert("请输入名称！");
			}
		});
		$("#model").blur(function(){
			if($("#model").val() == ''){
				alert("请输入型号！");
			}
		});
		$("#sub").click(function(){
			if($("#deposit").val() == ''){
				$("#deposit").val(0);
			}
			if($("#price").val() == ''){
				$("#price").val(0);
			}
		});
	});
</script>
</head>
<body>
	<form action="<%=path%>/inventory/insert" method="post">
		<table>
			<tr>
				<td>名称</td>
				<td><input type="text" id="name" name="name"></td>
			</tr>
			<tr>
				<td>型号</td>
				<td><input type="text" id="model" name="model"></td>
			</tr>
			<tr>
				<td>押金</td>
				<td><input type="text" id="deposit" name="deposit" onkeyup="this.value=this.value.replace(/[^\d\.]/g,'')"></td>
			</tr>
			<tr>
				<td>售价</td>
				<td><input type="text" id="price" name="price" onkeyup="this.value=this.value.replace(/[^\d\.]/g,'')"></td>
			</tr>
			<tr>
				<td>数量</td>
				<td><input type="text" id="num" name="num"></td>
			</tr>
			<tr>
				<td>
					<input type="submit" id="sub" value="新增">
					<input type="reset" value="重置">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>