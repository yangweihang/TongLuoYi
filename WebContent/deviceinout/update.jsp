<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String path = request.getContextPath();
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#sub").click(function(){
			if($("#price").val() == ''){
				$("#price").val(0)
			}
			if($("#inventorystatus").val() == '报废'){
				if($("#note").html() == ''){
					alert("请输入报废原因！");
					return false;
				}
			}
			$("#form1").submit();
		});
		$("#inventorystatus").val('${d.inventorystatus}');
		$("#manner").val('${d.manner}');
		$("#devicestatus").val('${d.devicestatus}');
		$("#note").val('${d.note}');
		$("#outtime").val('${d.outtime}');
	});
</script>
</head>
<body>
	<form id="form1" action="<%=path %>/deviceinout/update" method="post">
		<input type="hidden" id="id" name="id" value="${d.id }">
        <table style="margin-top:20px;">
   			<tr>
   				<td>库存状态</td>
   				<td>
   					<select id="inventorystatus" name="inventorystatus">
   						<option value="">请选择</option>
   						<option value="出库">出库</option>
   						<option value="入库">入库</option>
   						<option value="报废">报废</option>
   					</select>
   				</td>
   			</tr>
   			<tr>
   				<td>形式</td>
   				<td>
   					<select id="manner" name="manner">
   						<option value="">请选择</option>
   						<option value="售出">售出</option>
   						<option value="租出">租出</option>
   					</select>
   				</td>
   			</tr>
   			<tr>
   				<td>价格</td>
   				<td><input type="text" id="price" name="price" onkeyup="this.value=this.value.replace(/[^\d\.]/g,'')"></td>
   			</tr>
   			<tr>
   				<td>设备状态</td>
   				<td>
   					<select id="devicestatus" name="devicestatus">
   						<option value="">请选择</option>
   						<option value="在线">在线</option>
   						<option value="待机">待机</option>
   					</select>
   				</td>
   			</tr>
   			<tr>
   				<td>备注</td>
   				<td><textarea id="note" name="note"></textarea></td>
   			</tr>
   			<tr>
   				<input type="button" value="修改" id="sub">
   				<input type="reset" value="重置">
   			</tr>
   		</table>
   	</form>	
</body>
</html>