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
 height:20px;
 }

</style>
  </head>
  
  <body>
<div align="center"><font color="#CC3366" size="+2">出差通知单</font></div>
<form id="wxd">

<div id="biao" >

<table width="80%" align="center"  border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6">
  <tr>
    <td class="weix">出 差 单号：
      <input type="text" id="" value="2" class="input"/></td>
    <td class="weix">审批结果：
      <input type="text" id=""  value="同意" class="input"/></td>
  </tr>
  <tr>
    <td class="weix">申请人姓名：
      <input type="text" id="" value="张三" class="input"/></td>
    <td class="weix">申请时间：
      <input type="text" id="" value="2012-06-24" class="input"/></td>
  </tr>
  
  <tr>
    <td class="weix">外出目的地：
      <input type="text" id="" value="河北石家庄" class="input"/></td>
    <td class="weix">申请天数：
      <input type="text" id=""  value="5天" class="input"/></td>
  </tr>
  <tr height="50">
      <td class="weix">外出原因简述：      
        <textarea id="reasons" name="reasons"  rows="3" cols="50" > </textarea></td>   
	  <td  class="weix">外出需携带工具简述：      
        <textarea id="tools" name="tools"  rows="3" cols="50" > </textarea></td>
    </tr>

 <tr>
    <td class="weix">审 批 意见：
      <input type="text" id=""  value="谨慎办事，早去早回" class="input"/></td>
      <td class="weix">审批人签字：
      <input type="text" id="" value="申少博" class="input"/></td>
  </tr>
</table>

</div>
</form>

</body>
</html>
