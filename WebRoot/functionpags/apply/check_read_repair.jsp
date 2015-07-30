<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'check_repair.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">

body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	
}
#biao.weix{
	width:20px;
 	height:40;
	
 }
.weix{
background-color:#FFFFFF;
}
 #biao{
 margin-left:30px;
 margin-right:100px;
 
 }
 .input{
 height:20px;
 }

</style>
  </head>
  
  <body>
<div align="center"><font color="#CC3366" size="+2">维修通知单</font></div>


<div id="biao" >
<form action="ShowReadRepareAction" method="post">
<table width="80%" align="center"  border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6">
  <tr>
    <td class="weix">申请人姓名：<input type="text" id="" name="name1" value="${applyr.userByApplyRepareName.username}" class="input"/></td>
    <td class="weix">申请时间：<input type="text" id=""  name="applyRepareTime" value="${applyr.applyRepareTime}"class="input"/></td>
  </tr>
  <tr>
    <td class="weix">申请人姓名：<input type="text" id="" name="name1" value="${applyr.userByApplyRepareName.username}" class="input"/></td>
    <td class="weix">申请时间：<input type="text" id=""  name="applyRepareTime" value="${applyr.applyRepareTime}"class="input"/></td>
  </tr>
  <tr>
    <td class="weix">维修单编号：<input type="text" id="" name="applyBaoxiuTime" value="${applyr.applyBaoxiuTime}" class="input"/></td>
    <td class="weix">技术主管：<input type="text" id="" name="repareReasons" value="${applyr.repareReasons}" class="input"/></td>
  </tr>
  <tr >
    <td class="weix">所 用 套餐：<input type="text" id="" value="${applyr.carpackage.packageName}" name="packagename"class="input"/>  </td>
    <td rowspan="2" class="weix">维修方案：</br>    
      <textarea id="fanan" name="reparePlan"  rows="2" cols="50" >${applyr.reparePlan}</textarea></td>
  </tr>
   <tr >
    <td class="weix">预 计 工时：<input type="text" id=""value="${applyr.repareNeedtime}" name="repareNeedtime" class="input"/>  </td>
  </tr>
  
  <tr>
 	<td class="weix">审 批 意见：<input type="text" id=""  value="小心操作，以免功败垂成" class="input"/></td>
    <td class="weix"> 审批人签字：<input type="text" id="" name="name2" value="${applyr.userByShenpiName.username}" class="input"/>
   			</td>
  </tr> 
    
  <tr>
    <td colspan="2" align="right" class="weix" >
      <input type="submit" id="" value="确定" />&nbsp;&nbsp;&nbsp;&nbsp;
  </tr>

</table>
</form>
</div>

</body>
</html>
