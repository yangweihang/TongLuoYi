<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%
    String path = request.getContextPath();
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=path%>/js/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#tr1").hide();
		$("#tr2").hide();
		$("#tr3").hide();
		$("#tr4").hide();
		$("#manner").change(function(){
			var val = $("#manner option:selected").val();
			if(val == '租出'){
				$("#tr1").show();
				$("#tr2").show();
				$("#tr3").hide();
				$("#tr4").hide();
			}
			if(val == '售出'){
				$("#tr1").hide();
				$("#tr2").hide();
				$("#tr3").show();
				$("#tr4").show();
			}
			if(val == '租出+售出'){
				$("#tr1").show();
				$("#tr2").show();
				$("#tr3").show();
				$("#tr4").show();
			}
			if(val == ''){
				$("#tr1").hide();
				$("#tr2").hide();
				$("#tr3").hide();
				$("#tr4").hide();
			}
		});
		$("#wxid").blur(function(){
			$("#pwxid").val($("#wxid").val());
		});
	});
</script>
</head>
<body>
	<form action="<%=path%>/partner/insert" method="post">
		<table>
			<tr>
				<td>微信id</td>
				<td><input type="text" id="wxid" name="wxid"></td>
			</tr>
			<tr>
				<td>昵称</td>
				<td><input type="text" id="username" name="username"></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input type="text" id="name" name="name"></td>
			</tr>
			<tr>
				<td>性别</td>
				<td>
					<select id="sex" name="sex">
						<option value="">请选择</option>
						<option value="男">男</option>
						<option value="女">女</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>出生日期</td>
				<td><input type="date" id="date" name="date"></td>
			</tr>
			<tr>
				<td>手机号码</td>
				<td><input type="text" id="phonenum" name="phonenum"></td>
			</tr>
			<tr>
				<td>城市</td>
				<td><input type="text" id="city" name="city"></td>
			</tr>
			<tr>
				<td>合伙人类型</td>
				<td>
					<select id="manner" name="manner">
						<option value="">请选择</option>
						<option value="租出">租出</option>
						<option value="售出">售出</option>
						<option value="租出+售出">租出+售出</option>
					</select>
				</td>
			</tr>
			<input type="hidden" id="pwxid" name="pwxid">
			<tr id="tr1">
				<td>租出设备</td>
				<td>
					<select id="zcid" name="zcid">
						<option value="0">请选择</option>
						<c:forEach items="${zclist }" var="zc">
							<option value="${zc.get("id") }">${zc.get("name") }--${zc.get("model") }</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr id="tr2">
				<td>租出数量</td>
				<td><input type="text" id="zcnum" name="zcnum" value="0"></td>
			</tr>
			<tr id="tr3">
				<td>销售设备</td>
				<td>
					<select id="xsid" name="xsid">
						<option value="0">请选择</option>
						<c:forEach items="${xslist }" var="xs">
							<option value="${xs.get("id") }">${xs.get("name") }--${xs.get("model") }</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr id="tr4">
				<td>销售数量</td>
				<td><input type="text" id="xsnum" name="xsnum" value="0"></td>
			</tr>
			<tr>
				<td>合伙人级别</td>
				<td>
					<select id="level" name="level">
						<option value="">请选择</option>
						<option value="普通">普通</option>
						<option value="金牌">金牌</option>
						<option value="钻石">钻石</option>
						<option value="超级">超级</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>余额</td>
				<td><input type="text" id="balance" name="balance"></td>
			</tr>
			<tr>
				<td>店铺管理员</td>
				<td>
					<select id="aid" name="aid">
						<option value="">请选择</option>
						<c:forEach items="${list }" var="a">
							<option value="${a.id }">${a.name }</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
</body>
</html>