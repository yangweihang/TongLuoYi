<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	//点击按钮进行页面的跳转
	function byzx(value){
		document.getElementById("name").value=value;
		document.getElementById("form1").submit();
	}
	$(function(){
		//查询租用机型还是销售机型
		$("#zx").change(function(){
			$("#form1").submit();
		});
		//查询一个的时候让一方隐藏
		$("#zx").val('${zx}');
		if($("#zx").val() == 'Z'){
			$("#div2").hide();
		}
		if($("#zx").val() == 'X'){
			$("#div1").hide();
		}
		//修改
		$("[id ^= 'upd_']").click(function() {
			var id = this.id.split("_")[1];
			$("#id").val(id);
			$("#form1").attr("action","<%=path %>/inventory/selectOne");    //通过jquery为action属性赋值
			$("#form1").submit();
		});
		//删除
		$("[id ^= 'del_']").click(function() {
			var id = this.id.split("_")[1];
			$("#id").val(id);
			$("#form1").attr("action","<%=path %>/inventory/deletein");    //通过jquery为action属性赋值
			$("#form1").submit();
		});
	});
</script>
</head>
<body>
<form action="<%=path %>/inventory/select" id="form1" method="post">
	<table>
		<input type="hidden" id="name" name="name" value="${name }">
		<input type="hidden" id="id" name="id" value="${id }">
		<tr>
			<td><input type="button" id="tlj" value="通络机" onclick="byzx(this.value)"></td>
			<td><input type="button" id="tlytj" value="通络一体机" onclick="byzx(this.value)"></td>
			<td><input type="button" id="dptlp" value="单盆通络盆" onclick="byzx(this.value)"></td>
			<td><input type="button" id="sptlp" value="双盘通络盆" onclick="byzx(this.value)"></td>
		</tr>
		<tr><td>
			<select id="zx" name="zx">
				<option value="">请选择</option>
				<option value="Z">租用机型</option>
				<option value="X">销售机型</option>
			</select>
		</td></tr>
	</table>
</form>
<div id="div1" >
<h3>租用机型</h3>
<table id="tab1">
	<tr>
		<td>型号</td>
		<td>押金(元/台)</td>
		<td>库存数量</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${zlist }" var="z">
		<tr>
			<td>${z.model }</td>
			<td>
				<c:if test="${z.deposit eq 0}">--</c:if>
				<c:if test="${z.deposit ne 0}">${z.deposit }</c:if>
			</td>
			<td>${z.num }</td>
			<td>
				<input type="button" id="upd_${z.id }" value="修改">
				<input type="button" id="del_${z.id }" value="删除">
			</td>
		</tr>
	</c:forEach>	
</table>
</div>
<div id="div2">
<h3>销售机型</h3>
<table id="tab2">
	<tr>
		<td>型号</td>
		<td>售价(元/台)</td>
		<td>库存数量</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${xlist }" var="x">
		<tr>
			<td>${x.model }</td>
			<td>
				<c:if test="${x.price eq 0 }">--</c:if>
				<c:if test="${x.price ne 0 }">${x.price }</c:if>
			</td>
			<td>${x.num }</td>
			<td>
				<input type="button" id="upd_${x.id }" value="修改">
				<input type="button" id="del_${x.id }" value="删除">
			</td>
		</tr>
	</c:forEach>	
</table>
</div>
</body>
</html>