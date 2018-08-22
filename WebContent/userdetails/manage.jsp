<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.tly.model.UserDetails" %>
    <%@ page import="org.springframework.context.ApplicationContext" %>
    <%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
    <%@ page import="com.tly.dao.IUserDetailsDao" %>
    <%@ page import="com.tly.dao.IIntegralDao" %>
    <%@ page import="com.tly.dao.IUseStatisticalDao" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
    String path = request.getContextPath();
    List<UserDetails> l = (List<UserDetails>)request.getAttribute("list");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<table border="1">
			<tr>
				<td>ID</td>
				<td>微信ID</td>
				<td>昵称</td>
				<td>姓名</td>
				<td>姓别</td>
				<td>出生日期</td>
				<td>手机号码</td>
				<td>所在城市</td>
				<td>钱包余额</td>
				<td>积分</td>
				<td>使用次数</td>
				<td>累计时长</td>
				<td>一级上线</td>
				<td>二级上线</td>
				<td>一级下线</td>
				<td>二级下线</td>
			</tr>
			<%
			for(UserDetails u : l){
				//查询积分
				ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
				IIntegralDao iidao = ac.getBean(IIntegralDao.class);
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("wxid", u.getWxid());
				Integer jifen = iidao.selectByWxid(map);
				//查询使用次数
				IUseStatisticalDao iudao = ac.getBean(IUseStatisticalDao.class);
				Integer time = iudao.selectByCishu(u.getId());
				//查询使用时长
				Integer duration = iudao.selectByduration(u.getId());
			%>
				<tr>
					<td><%=u.getId() %></td>
					<td><%=u.getWxid()==null?"":u.getWxid() %></td>
					<td><%=u.getName()==null?"":u.getName() %></td>
					<td><%=u.getUsername()==null?"":u.getUsername() %></td>
					<td><%=u.getSex()==null?"":u.getSex() %></td>
					<td><%=u.getDate()==null?"":u.getDate() %></td>
					<td><%=u.getPhonenum()==null?"":u.getPhonenum() %></td>
					<td><%=u.getCity()==null?"":u.getCity() %></td>
					<td><%=u.getSaldo()==null?"":u.getSaldo() %></td>
					<td><a href="<%=path%>/integral/selectOne?wxid=<%=u.getWxid() %>"><%=jifen==null?0:jifen %></a></td>
					<td><%=time==null?0:time %></td>
					<td><%=duration==null?0:duration %></td>
					<%-- <td><a href="<%=path%>/grade/insertonid">增加上级</a></td>
					<td><a href="<%=path%>/grade/insertupid">增加下级</a></td> --%>
					<td><a href="<%=path%>/userdetails/selectuseron?id=<%=u.getId() %>">查看一级上线</a></td>
					<td><a href="<%=path%>/userdetails/selecttwouseron?id=<%=u.getId() %>">查看二级上线</a></td>
					<td><a href="<%=path%>/userdetails/selectuserup?id=<%=u.getId() %>">查看一级下级</a></td>
					<td><a href="<%=path%>/userdetails/selecttwouserup?id=<%=u.getId() %>">查看二级下级</a></td>
				</tr>
			<%
			}
			%>
		</table>
</body>
</html>