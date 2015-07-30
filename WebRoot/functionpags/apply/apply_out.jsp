<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'apply_out.jsp' starting page</title>
    
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
<div align="center"><font color="#CC3366" size="+2">外出申请表</font></div>


<div id="biao" >
<form action="ApplyOutAction" method="post">
<table width="80%" align="center"  border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6">
  <tr>
    <td class="weix">申请人姓名：
      <input type="text" id="Name"name="Name" value="1230" class="input"/></td>
    <td class="weix">申请时间：
      <input type="text" id="applyOutTime"name="applyOutTime" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" class="input"/></td>
  </tr>
  <tr>
    <td class="weix">外出目的地：
      <input type="text" id="applyOutDestination"name="applyOutDestination" value="河北石家庄" class="input"/></td>
    <td class="weix">申请天数：
      <input type="text" id="applyOutNeedtimes" name="applyOutNeedtimes" value="5天" class="input"/></td>
  </tr>
  <tr height="50">
      <td class="weix">外出原因简述：      
        <textarea id="applyOutReasons" name="applyOutReasons"  rows="3" cols="50" > </textarea></td>   
	  <td  class="weix">外出需携带工具简述：      
        <textarea id="applyOutNeedtools" name=applyOutNeedtools"  rows="3" cols="50" > </textarea></td>
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
setTimeout("codefans()",5000);//5秒
</script>
</html>
