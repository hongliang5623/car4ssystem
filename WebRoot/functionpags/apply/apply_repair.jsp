<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'apply_repair.jsp' starting page</title> 
    
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
 height:30px;
 }

</style>
<script language="javascript"  type="text/javascript" src="${pageContext.request.contextPath }/functionpags/My97DatePicker/WdatePicker.js"></script>
<script language="javascript"  type="text/javascript" src="${pageContext.request.contextPath }/functionpags/My97DatePicker/calendar.js"></script>
  </head>
  
<body>
<div align="center">
	<font size="+2" color="#CC3366" >维修申请单</font>
</div>


<div id="biao" >
<form id="wxd" action="SaveApplyRepareAction">
<table width="80%" align="center"  border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6">
  <tr>
    <td class="weix">申请人姓名：<input type="text" id="" name="Name" value="${user.username}" class="input"/></td>
    <td class="weix">申请时间：<input type="text" id=""  name="applyRepareTime" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" class="input"/></td>
  </tr>
  <tr>
    <td class="weix">报 修 时间：<input type="text" id="" name="applyBaoxiuTime" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  class="input"/></td>
    <td class="weix">故障原因：<input type="text" id="" name="repareReasons" value="刹车失灵" class="input"/></td>
  </tr>
  <tr >
    <td class="weix">所 用 套餐：<input type="text" id=""value="保养在身边" name="packagename"class="input"/>  </td>
	  <td rowspan="2" class="weix">维修方案：</br>    
      <textarea id="fanan" name="reparePlan"  rows="2" cols="50" > </textarea></td>
    </tr>
  <tr >
    <td class="weix">预 计 工时：<input type="text" id=""value="2天" name="repareNeedtime" class="input"/>  </td>
  </tr>
  <tr>
    <td colspan="2" align="center" class="weix" >
      <input type="submit" id="" value="提交" />&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="reset" id=""  value="重置" /></td>
  </tr>
</table>
</form>
</div>
<div id="mess" align="center" > ${tianjiaMessage}</div>

</body>
<script language="javascript">
function codefans(){
var box=document.getElementById("mess");
box.style.display="none";	
}
setTimeout("codefans()",5000);//3秒
</script>
</html>
