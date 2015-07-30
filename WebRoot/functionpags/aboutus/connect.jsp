<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'connect.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <p>地址：河南省平顶山市建设路</p>
   <p>联系电话：13261405959</p>
    <p>&nbsp;</p>
   	<p>&nbsp;</p>
   	<p>&nbsp;</p>
   	<p>&nbsp;</p>
   	<p>&nbsp;</p>
<div id="pic" align="right" style="margin-bottom:1px"><img src="${pageContext.request.contextPath }/functionpags/images/dec1.jpg" /></div>
  </body>
</html>
