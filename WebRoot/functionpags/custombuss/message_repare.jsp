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
    <div id="tishi"   align="center">
    ${tianjiaMessage}<input type="button" value="查看维修单" onclick="changeBody(1)"/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="button" value="继续添加" onclick="window.location.href='http://localhost:8080${pageContext.request.contextPath }/functionpags/custombuss/weixiud.jsp'" >
    </div>
    <div id="mess" align="center" style="display: none;">
    <div align="center">
	<font size="+2" color="#CC3366" ></br></br>本次填写维修单信息如下</br></br></br></font>
	</div>
    <table width="50%" align="center"  border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6" >
  <tr>
    <td class="weix">维修人员姓名：<input type="text" name="repareName" value="张三" class="input"/></td>
    <td class="weix">车主姓名：<input type="text" name="carName" value="李四" class="input"/></td>
  </tr>
  <tr>
    <td class="weix"> 故 障 原 因 ：<input type="text" name="repareResons" value="刹车失灵" class="input"/></td>
    <td class="weix">维修时间：<input type="text" name="repareTime" class="input"/></td>
  </tr>
  <tr height="50">
    <td  class="weix">解决方案：      
      <textarea name="reparePlan" name="reparePlan"  rows="3" cols="50" > </textarea></td>
    <td class="weix"><span>所用零件：</span>&nbsp;&nbsp;	
    <textarea name="reparePlan" name="reparePlan"  rows="3" cols="50" > </textarea>
 	</td>
   </tr>
     
  <tr>
    <td class="weix">维修结果：<input type="text" name="repareResult" class="input" value="更换液压器" /></td>
    <td class="weix">维修总费用：<input type="text" name="repareSum" class="input" value="800元"/></td>
  </tr>
  
  <tr>
    <td class="weix">技术主管：<input type="text" name="zhuguanname" class="input" value="申少博" /></td>
    <td class="weix" align="center"><input type="button" value="确定" onclick="window.location.href='http://localhost:8080${pageContext.request.contextPath }/functionpags/custombuss/weixiud.jsp'" ></td>
  </tr>
</table>
</div>
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
