<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'taocan.jsp' starting page</title>
    
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
#biao.taocan{
	width:20px;
 	height:40;
	
 }
 .taocan{
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
	<font size="+2" color="#CC3366" >设置套餐</font>
</div>
<form action="savePackageAction" method="post">
<div id="biao">
  <table width="80%" align="center"  border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6">
    <tr>
      <td class="taocan">创意人：<input type="text" value="1" name="user.userid" id="username" /></td>
      <td class="taocan">生效日期：<input type="text" value="2012-09-05" name="packageTime" id="packageTime" /></td>
    </tr>
    
    <tr>
      <td class="taocan">套餐名：<input type="text" value="保养在身边" name="packageName" id="packageName" /></td>
      <td class="taocan">收费标准：<input type="text" value="5000" name="packageCost" id="packageCost" /></td>
    </tr>
    
	<tr>
      <td colspan="2" class="taocan">套餐具体内容：
		<textarea  id="packageDetails" name="packageDetails" rows="3" cols="120" > </textarea>
	 </td>
	 </tr>
	 
	 <tr>
    <td colspan="2" class="taocan" align="center">
      <input type="submit" id="" class="input" value="提交"/>      &nbsp;&nbsp;&nbsp;&nbsp;
      <input type="reset" id="" class="input" value="重置"/></td>
    </tr>
  </table>
</div>

</form>

</div>

</body>
</html>
