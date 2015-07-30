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
    <div id="tishi"   align="center">
    ${tianjiaMessage}<input type="button" value="查看所添用户" onclick="changeBody(1)"/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="button" value="继续添加" onclick="window.location.href='http://localhost:8080${pageContext.request.contextPath }/functionpags/custombuss/tianjia.jsp'" >
    </div>
    <div id="mess" align="center" style="display: none;">
    <div align="center">
	<font size="+2" color="#CC3366" ></br></br>本次添加的用户信息如下</br></br></br></font>
	<!--http://localhost:8080/car4ssystem/functionpags/custombuss/tianjia.jsp
	--></div>
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
     <td  class="addowner">账户余额：<input type="text" value="1500元" name="accountLeft" id="accountLeft" /></td>
     <td class="addowner" align="center"><input type="button" value="确定" onclick="window.location.href='http://localhost:8080${pageContext.request.contextPath }/functionpags/custombuss/tianjia.jsp'" ></td>
    </tr>
	
  </table></div>
  </body>
  <script type="text/javascript">
function changeBody(index){
  switch(index){
    case 1:{
      document.getElementById('mess').style.display = "";
     // document.getElementById('iDBody2').style.display = "none";
	 break;
    }
    case 2:{
      document.getElementById('mess').style.display = "none";
      //document.getElementById('iDBody2').style.display = "";
    }
  }
} 
</script>
</html>
