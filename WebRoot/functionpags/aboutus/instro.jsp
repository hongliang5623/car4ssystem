<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'instro.jsp' starting page</title>
    
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
  </br></br>
   	&nbsp;&nbsp;&nbsp;&nbsp;繁忙的您只需提前致电鹰城车辆售后中心进行服务预约，便可让您的爱车在进入授权经销商后获得既快捷又专业的服务。宝贵时间将完全掌握在自己的手里。

当鹰城车辆售后中心的技术人员提前了解您的爱车状况后，便会做好一切准备。您将享受更完美、更周到的车辆维修保养服务。

敬请拨打预约电话约定时间，把爱车送鹰城车辆售后中心，我们便能在最短时间内为您提供最高效率及一流的专业服务。
	<p>&nbsp;</p>
   	<p>&nbsp;</p>
   	<p>&nbsp;</p>
   	<p>&nbsp;</p>
   	<p>&nbsp;</p>
<div id="pic" align="right" style="margin-bottom:1px"><img src="${pageContext.request.contextPath }/functionpags/images/dec1.jpg" /></div>
  </body>
</html>
