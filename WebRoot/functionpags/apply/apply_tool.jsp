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
<script language="javascript"  type="text/javascript" src="${pageContext.request.contextPath }/functionpags/My97DatePicker/WdatePicker.js"></script>
<script language="javascript"  type="text/javascript" src="${pageContext.request.contextPath }/functionpags/My97DatePicker/calendar.js"></script>
  </head>
 <script type="text/javascript" language="javascript">
 
 function addFile() {
 var div = document.createElement("div");
 
 var s1=document.createElement("span");
 //s1.setAttribute("nodeValue","零件名：")
 //s1.nodeValue="零件名："
 s1.innerHTML="零件名："
 div.appendChild(s1)
 
 var t1 = document.createElement("input");
 //IE不支持这种格式
/* t1.setAttribute("type", "text")*/
 t1.type='text';
// t1.setAttribute("style" ,"width:100px;height:30px;")
 t1.style.cssText = 'width:100px;height:30px';
 t1.setAttribute("name", "mingzi")
 //t1.setAttribute("size", "50")
 div.appendChild(t1)
 
 var s2=document.createElement("span");
// s1.setAttribute("nodeValue","数量：")
// s2.nodeValue="数量："
 s2.innerHTML="&nbsp;数量："
 div.appendChild(s2)
 
 var t2 = document.createElement("input");
 //t2.setAttribute("type", "text")
 t2.type='text';
 //alert(1);
 /*IE不支持下面这种为其设置样式*/
 //t2.setAttribute("style" ,"width:40px;height:30px;")
 t2.style.cssText = 'width:40px;height:30px';
 t2.setAttribute("name", "shuliang")
 //t2.setAttribute("size", "20")
 t2.setAttribute("value","1")
 div.appendChild(t2)
 
 var d = document.createElement("input");
 d.setAttribute("type", "button")
 /*IE不支持下面这种为其触发事件*/
 //d.setAttribute("onclick", "deteFile(this)");
 d.onclick=function(){deteFile(this);};
 d.setAttribute("value", "删除")
 div.appendChild(d)
 document.getElementById("_container").appendChild(div);
 }
 
 function deteFile(object) {
 while (object.tagName != "DIV")
  object = object.parentNode;
 object.parentNode.removeChild(object);
 }
 </script>
  
<body>

<div>

<div align="center">
	<font size="+2" color="#CC3366" >零件申请单</font>
</div>

<form action="SaveApplyToolsAction" method="post" >

<div id="biao" >

<table width="50%" align="center"  border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6" >
  <tr>
    <td class="weix">申请人姓名：<input type="text" id=""name="Name" value="${user.username}" class="input"/></td>
    <td class="weix">申请时间：<input type="text" id="" name="appleToolsTime" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  class="input"/></td>
  </tr>
  <tr>
    <td class="weix">维修单编号：<input type="text" id=""name="wxdId" class="input"/></td>
    <td class="weix">技术主管：<input type="text" id="" name="repareshenpi" value="申少博" class="input"/></td>
  </tr>
  <tr>
    <td colspan="2" class="weix"><span>申请零件列表</span>&nbsp;&nbsp;
	<div id="_container">
	 零件名：<input type="text"  name="mingzi" value="保险杠" style ="width:100px;height:30px;" />
	 数量：<input type="text"  name="shuliang"  value="1"    style ="width:40px;height:30px;"/>
    </div>
 
 	<div>
	 <input type="button" value="下一个零件" onclick="addFile()"/>
 	</div>	
 	</td>
  </tr>
  <tr>
    <td class="weix" colspan="2" align="center">
    <input type="submit" id="" class="input" value="提交"/>&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="reset" id="" class="input" value="重置"/></td>
  </tr>
</table>

</div>

</form>

</div>
<div id="mess" align="center" > ${tianjiaMessage}</div>
</body>
<script language="javascript">
function codefans(){
var box=document.getElementById("mess");
box.style.display="none";	
}
setTimeout("codefans()",5000);//3秒
</script>
</html>
