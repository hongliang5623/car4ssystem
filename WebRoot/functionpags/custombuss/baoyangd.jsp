<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'baoyangd.jsp' starting page</title>
    
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
#biao.baoy{
	width:20px;
 	height:40;
	
 }
 .baoy{
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
 <div>
<div align="center">
	<font size="+2" color="#CC3366" >保养单</font>
</div>
<form action="SaveBaoyangAction" method="post">
<div id="biao">
  <table width="80%" align="center"  border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6">
    <tr>
      <td class="baoy">操作员姓名：<input type="text" value="${user.username}" name="name2" id="emp_name" class="input" /></td>
      <td class="baoy"> 保养日期：<input type="text" name="baoyangTime" id="baoyang_time" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" class="input"/></td>
    </tr>
    <tr>
      <td class="baoy">车&nbsp;主&nbsp;姓名：<input type="text"  name="name1" id="ower_name" class="input"/></td>
      <td class="baoy">保养前车身状况：<input type="text" value="正常" name="beforeState" id="before_state" class="input"/></td>
    </tr>
	<tr>
      <td colspan="2" class="baoy">
	 操作项：</br>
	 检查项：  <input type='checkbox' name="baoyangItem" value="轮胎" />轮胎 <input type='checkbox' name="baoyangItem" value="刹车" />刹车 <input type='checkbox'name="baoyangItem" value="洗车" />离合器 
	           <input type='checkbox' name="baoyangItem" value="洗车" />仪表 <input type='checkbox' name="baoyangItem" value="洗车" />雨刷 <input type='checkbox' name="baoyangItem" value="洗车" />喇叭
			   <input type='checkbox' name="baoyangItem" value="洗车" />变速箱 <input type='checkbox' name="baoyangItem" value="洗车" />车灯系统</br>
	  操作项：   
	 <input type='checkbox' name="baoyangItem" value="洗车" />洗车  <input type='checkbox' name="baoyangItem" value="洗车" />汽车打蜡</br>
	  更换项：
	 <input type='checkbox' name="baoyangItem" value="洗车" />换机油 <input type='checkbox' name="baoyangItem" value="洗车" />更换火花塞
	 <input type='checkbox' name="baoyangItem" value="洗车" />添加防冻液 <input type='checkbox' name="baoyangItem" value="洗车" />更换皮带 <input type='checkbox' name="baoyangItem" value="洗车" />更换刹车液  
	 <input type='checkbox' name="baoyangItem" value="洗车" />喷油嘴	<input type='checkbox' name="baoyangItem" value="洗车" />更换齿轮
	 </td>
	 </tr>
	 <tr>
    <td colspan="2" class="baoy" align="center">
      <input type="submit" id="" class="input" value="提交"/>      &nbsp;&nbsp;&nbsp;&nbsp;
      <input type="reset" id="" class="input" value="重置"/></td>
    </tr>
  </table>
</div>
</form>
</div>
<div id="mess" align="center" >${tianjiaMessage}</div>
</body>
<script language="javascript">
function codefans(){
var box=document.getElementById("mess");
box.style.display="none";	
}
setTimeout("codefans()",5000);//3秒
</script>
</html>
