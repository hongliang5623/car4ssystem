<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'message.jsp' starting page</title>
    
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
#biao.addowner{
	width:20px;
 	height:40;
	
 }
 .addowner{
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
    
    <div id="mess">
    <div align="center">
	<font size="+2" color="#CC3366" ></br></br>车主户信息</br></br></font>
	</div>
	
	<div>
    <table width="50%" align="center"  border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6">
    <tr>
      <td class="addowner">车主姓名：<input type="text" value="${caro.owerTruename}" name="owerTruename" id="owerName" /></td>
      <td class="addowner">性别：<input type="text" value="${caro.owerSex}" name="owerSex" id="owerSex" /></td>
    </tr>
    <tr>
      <td class="addowner">登陆账号：<input type="text" value="${caro.owerName}" name="owerName" id="owerName" /></td>
      <td class="addowner">密码：<input type="text" value="${caro.owerPwd}" name="owerPwd" id="owerPwd" /></td>
    </tr>
	 <tr>
      <td class="addowner">工作单位：<input type="text" value="${caro.owerJop}" name="owerJop" id="owerJop" /></td>
      <td class="addowner">车型：<input type="text" value="${caro.owerCartype}" name="owerCartype" id="owerCartype" /></td>
    </tr>
    <tr>
      <td class="addowner">选用套餐：<input type="text" value="${caro.carpackage.packageName}" name="carpackage.packageId" id="packageId" /></td>
      <td class="addowner">启用日期：<input type="text" value="${caro.packEffecttime}" name="packEffecttime" id="packEffecttime" /></td>
    </tr>
	 <tr>
      <td class="addowner">联系电话：<input type="text" value="${caro.owerTelephone}" name="owerTelephone" id="owerTelephone" /></td>
      <td class="addowner">联系地址：<input type="text" value="${caro.owerAddr}" name="owerAddr" id="owerAddr" /></td>
    </tr>
    <tr>
     <td  class="addowner">账户余额：<input type="text" value="${caro.accountLeft}" name="accountLeft" id="accountLeft" /></td>
     <td class="addowner" align="center"><form action="ShowOwnerAction"><input type="submit" value="确定"></form></td>
    </tr>
	
  </table></div>
  </div>
  </body>
  
</html>
