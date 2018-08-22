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
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#chall").click(function(){
		if(this.checked == true){
			$("[id^= 'ch_']").prop("checked","true");
		}else{
			$("[id^= 'ch_']").removeAttr("checked");
		}
	});
	$("#delmulti").click(function(){
		var arr = [];
		$("[id^= 'ch_']").each(function(){
			if(this.checked == true){
				var ids = this.id.split("_")[1];
				arr.push(ids);
			}
		});
		if(!arr.length > 0){
			alert("请选择你要删除的设备");
			return false;
		}
	});
});
function next(pageNum) {
	if(pageNum<1){
		alert("已经是首页了！");
		return;
	}
	if(pageNum>'${total }'){
		alert("已经是尾页了！");
		return;
	}
	document.forms[0].action="<%=path %>/deviceinout/selectByPage?pageNum="+pageNum;
	document.forms[0].submit();
}
</script>
</head>
<body>
	<table>
		<form action="<%=path%>/deviceinout/deleteByd" method="post">
		<tr><td><input type="submit" id="delmulti" value="删除"></td></tr>
		<tr>
			<td><input type="checkbox" id="chall"></td>
			<td>设备编号</td>
			<td>入库时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="d">
			<tr>
				<td><input type="checkbox" name="arr" id="ch_${d.id }" value="${d.id }"></td>
				<td>${d.inventorystatus }</td>
				<td>${d.intime }</td>
				<td><a href="<%=path%>/deviceinout/selectOne?id=${d.id}">修改</a></td>
			</tr>
		</c:forEach>
		</form>
	</table>
	<form action="<%=path %>/deviceinout/selectByPage" method="post">
		第${pageNum }页|共${total }页|
		<input type="button" value="首页" onclick="next(1)" />
		<input type="button" value="上一页" onclick="next(${pageNum-1 })" />
		<input type="button" value="下一页" onclick="next(${pageNum+1 })" />
		<input type="button" value="尾页" onclick="next(${total })" />
		<input type="hidden" id="total" name="total" value="${total }" />
	</form>
</body>
</html>