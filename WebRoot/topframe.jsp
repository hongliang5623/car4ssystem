<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'topframe.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="css/common.css" type="text/css" />
  </head>
  
  <body>
    <div class="header_content">
     <div class="logo"><img src="images/man_logo.jpg" alt="车辆售后维修与跟踪管理系统" /></div>
	 <div class="right_nav">
	    <div class="text_left"><ul class="nav_list"></ul>
	    </div>
		<div class="text_right"> <%SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); %><ul class="nav_return">当前时间：<%out.print(sdf.format(new Date())); %></ul>
		</div>
	 </div>
</div>
  </body>
</html>
