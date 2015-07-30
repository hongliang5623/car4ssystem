<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'weixiud.jsp' starting page</title>
    
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
  </head>
  
<body>

<div>

<div align="center">
	<font size="+2" color="#CC3366" >零件领取通知单</font>
</div>

<form >

<div id="biao" >

<table width="50%" align="center"  border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6" >
  <tr>
    <td class="weix">申 请 单号：<input name= a readonly type="text" id="" value="15" class="input"/></td>
    <td class="weix">审批结果：<input type="text" id="" value="同意" class="input"/></td>
  </tr>
  <tr>
    <td class="weix">申请人姓名：<input type="text" id="" value="张三" class="input"/></td>
    <td class="weix">申请时间：<input type="text" id="" value="2012-06-25" class="input"/></td>
  </tr>
  <tr>
    <td class="weix">维修单编号：<input type="text" id="" value="1011" class="input"/></td>
    <td class="weix">技术主管：<input type="text" id="" value="申少博" class="input"/></td>
  </tr>
  
   <tr height="50">
      <td class="weix">零件列表：      
        <textarea id="reasons" name="reasons"  rows="3" cols="50" >保险杠，1个；前挡风玻璃，2个；轮胎，2个  </textarea></td>   
	  <td  class="weix">仓库意见：      
        <textarea id="tools" name="tools"  rows="3" cols="50" >请与2012-06-28日到仓库领取 </textarea></td>
    </tr>
  
</table>

</div>

</form>

</div>

</body>
</html>
