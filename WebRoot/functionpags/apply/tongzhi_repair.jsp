<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'tongzhi_repair.jsp' starting page</title> 
    
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
<div align="center">
	<font size="+2" color="#CC3366" >维修通知单</font>
</div>
<form id="wxd" action="ShowReadRepareAction" method="post">

<div id="biao" >

<table width="80%" align="center"  border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6">
  <tr>
    <td class="weix">维 修 单号：<input type="text" id="" value="15" class="input"/></td>
    <td class="weix">审批结果：<input type="text" id="" value="同意" class="input"/></td>
  </tr>
  <tr>
    <td class="weix">申请人姓名：<input type="text" id="" value="张三" class="input"/></td>
    <td class="weix">申请时间：<input type="text" id="" value="2012-09-25"  class="input"/></td>
  </tr>
  <tr>
    <td class="weix">报 修 时间：<input type="text" id="" value="2012-09-23"   class="input"/></td>
    <td class="weix">故障原因：<input type="text" id=""value="刹车失灵" class="input"/></td>
  </tr>
  <tr >
    <td class="weix">所 用 套餐：<input type="text" id=""value="保养在身边" class="input"/>  </td>
	  <td rowspan="2" class="weix">维修方案：</br>    
      <textarea id="fanan" name="fanan"  rows="2" cols="50" > </textarea></td>
    </tr>
  <tr >
    <td class="weix">预 计 工时：<input type="text" id=""value="2天" class="input"/>  </td>
  </tr>
  <tr>
    <td class="weix">审批人签字：<input type="text" id="" value="申少博" class="input"/></td>
    <td class="weix">审批意见：<input type="text" id=""value="立即维修，注意检查液压器" class="input"/></td>
  </tr>
  <tr>
    <td colspan="2" align="right" class="weix" >
      <input type="submit" id="" value="确定" />&nbsp;&nbsp;&nbsp;&nbsp;
  </tr>
</table>

</div>
</form>

</body>
</html>
