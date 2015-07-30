<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'tianjia.jsp' starting page</title>
    
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
<div>
<div align="center">
	<font size="+2" color="#CC3366" >添加车主信息</font>
</div>

<div id="biao">
<form action="AddOwnerAction" method="post">
  <table width="50%" align="center"  border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6">
    <tr>
      <td class="addowner">车主姓名：<input type="text" value="张三" name="owerTruename" id="owerName" /></td>
      <td class="addowner">性别：<input type="text" value="男" name="owerSex" id="owerSex" /></td>
    </tr>
    <tr>
      <td class="addowner">登陆账号：<input type="text" value="1235" name="owerName" id="owerName" /></td>
      <td class="addowner">密码：<input type="text" value="123" name="owerPwd" id="owerPwd" /></td>
    </tr>
	 <tr>
      <td class="addowner">工作单位：<input type="text" value="平顶山学院" name="owerJop" id="owerJop" /></td>
      <td class="addowner">车型：<input type="text" value="奥迪A6" name="owerCartype" id="owerCartype" /></td>
    </tr>
    <tr>
      <td class="addowner">选用套餐：<input type="text" value="1" name="carpackage.packageId" id="packageId" /></td>
      <td class="addowner">启用日期：<input type="text" value="2012-07-08" name="packEffecttime" id="packEffecttime" /></td>
    </tr>
	 <tr>
      <td class="addowner">联系电话：<input type="text" value="18237576163" name="owerTelephone" id="owerTelephone" /></td>
      <td class="addowner">联系地址：<input type="text" value="平顶山市新华路" name="owerAddr" id="owerAddr" /></td>
    </tr>
    <tr>
      <td class="addowner">账户余额：<input type="text" value="1500元" name="accountLeft" id="accountLeft" /></td>
      <td class="addowner"> <input type="submit" id="" class="input" value="添加" />      &nbsp;&nbsp;&nbsp;&nbsp;
      <input type="reset" id="" class="input" value="重置"/></td>
    </tr>
	
  </table>
  </form>
</div>

</div>
</body>

</html>
