<%@page import="com.tly.controller.InventoryController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="java.util.*" %>
    <%@ page import="com.tly.model.Inventory" %>
    <%@ page import="org.springframework.context.ApplicationContext" %>
    <%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
    <%@ page import="com.tly.dao.IDeviceinoutDao" %>
    <%@ page import="com.tly.model.Deviceinout" %>
    <%
    String path = request.getContextPath();
    String realPath = request.getSession().getServletContext().getRealPath("/ewm");
    List<Inventory> l = (List<Inventory>)request.getAttribute("list");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=path%>/js/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
});
</script>
</head>
<body>
	<form action="<%=path%>/inventory/selectbyem" method="post">
		<table border="1">
			<tr>
				<td>设备型号</td>
				<td>设备编号</td>
				<td>库存状态</td>
				<td>合伙人</td>
				<td>手机号</td>
				<td>形式</td>
				<td>设备状态</td>
				<td>二维码</td>
				<td>入库出库明细</td>
				<td>操作</td>
			</tr>
				<%
				for(Inventory i:l){
					ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
					IDeviceinoutDao fdao = ac.getBean(IDeviceinoutDao.class);
					Deviceinout d = fdao.selectmax(i.getSerialnum(),"");
				%>
				<tr>
					<td><%=i.getModel()==null?"":i.getModel() %></td>
					<td><%=i.getSerialnum()==null?"":i.getSerialnum() %></td>
					<td><%=d == null?"":d.getInventorystatus() %></td>
					<td>--</td>
					<td>--</td>
					<td><%=d == null?"":d.getManner()==null?"":d.getManner() %></td>
					<td><%=d == null?"":d.getDevicestatus()==null?"":d.getDevicestatus() %></td>
					<td><img width="100px" height="100px" src="<%=path %>/icon?img=<%=i.getSerialnum()%>"></td>
					<td><a href="<%=path%>/deviceinout/selectbyserialnum?serialnum=<%=i.getSerialnum() %>">入库出库明细</a></td>
					<td>改成	
						<%
						if(!d.getInventorystatus().equals("入库")){
						%>
						<a href="<%=path%>/deviceinout/insertin?serialnum=<%=i.getSerialnum() %>">入库</a>|
						<%
						}
						%>
						<%
						if(!d.getInventorystatus().equals("出库")){
						%>
						<a href="<%=path %>/equipmentanage/insertOut.jsp?serialnum=<%=i.getSerialnum() %>">出库</a>|
						<%
						}
						%>
						<%
						if(!d.getInventorystatus().equals("报废")){
						%>
						<a href="<%=path%>/equipmentanage/insertScrap.jsp?serialnum=<%=i.getSerialnum() %>">报废</a>
						<%
						}
						%>
					</td>
				</tr>
				<%
				}
				%>
		</table>
	</form>
</body>
</html>