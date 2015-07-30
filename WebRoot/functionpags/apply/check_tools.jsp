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
<div align="center"><font color="#CC3366" size="+2">外出审批单</font></div>


<div id="biao" >
<form action="ShenpiApplyToolsAction" method="post">
<table width="80%" align="center"  border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6">
  <tr>
    <td class="weix">申请人姓名：
      <input type="text" id="" name="name1" value="${applyt.userByApplyToolsName.username}" class="input"/></td>
    <td class="weix">申请时间：
      <input type="text" id="" name="appleToolsTime" value="${applyt.appleToolsTime}" class="input"/></td>
  </tr>
  
  <tr>
    <td class="weix">维修单编号：
      <input type="text" id=""name="applyRId" value="${applyt.applyRepare.applyRepareId}" class="input"/></td>
    <td class="weix">技术主管：
      <input type="text" id="" name="repareshenpi" value="${applyt.repareshenpi}" class="input"/></td>
  </tr>
  <tr height="50">
      <td class="weix">申请零件：      
        <textarea id="reasons" name="applyTools"  rows="3" cols="50" >${applyt.applyTools} </textarea></td>   
	  <td  class="weix">仓库意见：      
        <textarea id="tools" name="applyToolsNote"  rows="3" cols="50" >请与2012-06-28日到仓库领取  </textarea></td>
    </tr>
 
  <tr>
 	
    <td colspan="2"class="weix" align="center">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="checkbox" name="shenpiReuslt"value="同意"/>同意<input type="checkbox" name="shenpiReuslt"value="不同意"/>不同意
   			</td>
  </tr> 
    <tr >
    <td colspan="2"  class="weix" align="right"><input type="hidden" name="applyToolsId" value="${applyt.applyToolsId}"> 审批人签字：<input type="text" id="" name="name2" value="${user.username}" class="input"/></td>
    </tr>
  <tr>
    <td colspan="2" align="center" class="weix" >
      <input type="submit" id="" value="提交" />&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="reset" id=""  value="重置" /></td>
  </tr>
</table>
</form>
</div>


</body>
</html>
