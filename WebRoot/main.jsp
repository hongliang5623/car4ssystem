<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <link rel="stylesheet" href="css/common.css" type="text/css" />
    <title>车辆售后管理系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <frameset rows="50,*" cols="*" frameborder="no" border="0" framespacing="0">
  <frame src="topframe.jsp" name="topFrame" frameborder="0" scrolling="No" noresize="noresize" id="topFrame" title="topFrame" />
 	 <!--下部-->
  <frameset id="myFrame" cols="199,7,*" frameborder="no" border="0" framespacing="0">
 	 <!--下左部-->
    <frame src="leftframe.jsp" name="leftFrame" frameborder="0" scrolling="No" noresize="noresize" id="leftFrame" title="leftFrame" />
	 <!--下中部   显示一个图片控制下左的隐藏与显示-->
	<frame src="switchframe.jsp" name="midFrame" frameborder="0" scrolling="No" noresize="noresize" id="midFrame" title="midFrame" />
	 <!--下右部   分两块-->
    <frameset rows="59,*" cols="*" frameborder="no" border="0" framespacing="0">
		<!--控件菜单条-->
         <frame src="mainframe.jsp" name="mainFrame" frameborder="0" scrolling="no"  noresize="noresize" id="mainFrame" title="mainFrame" />
        <!--  显示块-->
		 <frame src="functionpags/manframe.jsp" name="manFrame" frameborder="0" id="manFrame" title="manFrame" />
     </frameset>
	 
  </frameset>
  
</frameset>
<noframes><body>
</body>
</noframes>
</html>
