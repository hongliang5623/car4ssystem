<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="cn.pdsu.bs.domain.User"%>
<%@page import="cn.pdsu.bs.domain.Carowner"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'mainframe.jsp' starting page</title>
    
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
  <script  type="text/javascript">
var preClassName = "man_nav_1";
function list_sub_nav(Id,sortname){
   if(preClassName != ""){
      getObject(preClassName).className="bg_image";
   }
   if(getObject(Id).className == "bg_image"){
      getObject(Id).className="bg_image_onclick";
      preClassName = Id;
	  showInnerText(Id);
	  
	  window.top.frames['leftFrame'].outlookbar.getbytitle(sortname);
	  window.top.frames['leftFrame'].outlookbar.getdefaultnav(sortname);
   }
}

function showInnerText(Id){
    var switchId = parseInt(Id.substring(8));
	var showText = "对不起没有信息！";
	switch(switchId){
	    case 1:
		   showText =  "欢迎在线使用车辆售后与维修跟踪管理系统!";
		   break;
	    case 2:
		   showText =  "system setting!";
		   break;
	    case 3:
		   showText =  "User Manage";
		   break;		   
	    case 4:
		   showText =  "Chanage Manage";
		   break;	
	    case 5:
		   showText =  "Ad AND news!";
		   break;		   		   
	}
	getObject('show_text').innerHTML = showText;
}
 //获取对象属性兼容方法
 function getObject(objectId) {
    if(document.getElementById && document.getElementById(objectId)) {
	// W3C DOM
	return document.getElementById(objectId);
    } else if (document.all && document.all(objectId)) {
	// MSIE 4 DOM
	return document.all(objectId);
    } else if (document.layers && document.layers[objectId]) {
	// NN 4 DOM.. note: this won't find nested layers
	return document.layers[objectId];
    } else {
	return false;
    }
}
</script>
  <body>
  
  <!--车主登陆显示div-->
  <%
   HttpSession sessions=request.getSession();
   int i=Integer.parseInt(sessions.getAttribute("value").toString());
  if(i==1){
   %>
<div id="nav">
    <ul>
    	<li id="man_nav_1" onclick="list_sub_nav(id,'售后简介')"  class="bg_image_onclick">售后简介</li>
		<li id="man_nav_2" onclick="list_sub_nav(id,'车主业务')"  class="bg_image">车主业务</li>
	</ul>
</div>
<%}else{ %>
 <!--4s店员工登陆显示div-->

<div id="nav">
    <ul><li id="man_nav_1" onclick="list_sub_nav(id,'售后简介')"  class="bg_image_onclick">售后简介</li>
		<!--
		<li id="man_nav_2" onclick="list_sub_nav(id,'车主业务')"  class="bg_image">车主业务</li>
		-->
		<li id="man_nav_2" onclick="list_sub_nav(id,'用户管理')"  class="bg_image">用户管理</li>
		<li id="man_nav_3"  onclick="list_sub_nav(id,'审批管理')"  class="bg_image">审批管理</li>
		<li id="man_nav_4"  onclick="list_sub_nav(id,'历史账单')"  class="bg_image">历史账单</li>
		<li id="man_nav_5"  onclick="list_sub_nav(id,'仓库管理')"  class="bg_image">仓库管理</li></ul>
</div>
<%}%>
<div id="sub_info">&nbsp;&nbsp;<img src="images/hi.gif" />&nbsp;
<span id="show_text">欢迎在线使用车辆售后与维修跟踪管理系统!</span>
</div>
</body>
</html>
