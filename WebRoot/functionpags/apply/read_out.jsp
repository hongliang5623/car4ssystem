<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'shenpi_out.jsp' starting page</title>
    
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
#biao .cond{
	width:80;
 	height:50;

 }
.cond{
	background-color:#FFFFFF;
 }
 #biao{
 margin-left:auto;
 margin-right:auto;
 }
 .input{
 height:20px;
 }
.STYLE1 {font-size: 12px}
.STYLE4 {
	color: #03515d;
	font-size: 12px;
}
.cond1 {	background-color:#FFFFFF;
}
</style>
</head>
   <script>
var  highlightcolor='#c1ebff';
//此处clickcolor只能用win系统颜色代码才能成功,如果用#xxxxxx的代码就不行,还没搞清楚为什么:(
var  clickcolor='#51b2f6';
function  changeto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=highlightcolor&&source.id!="nc"&&cs[1].style.backgroundColor!=clickcolor)
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=highlightcolor;
}
}

function  changeback(){
if  (event.fromElement.contains(event.toElement)||source.contains(event.toElement)||source.id=="nc")
return
if  (event.toElement!=source&&cs[1].style.backgroundColor!=clickcolor)
//source.style.backgroundColor=originalcolor
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}

function  clickto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=clickcolor&&source.id!="nc")
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=clickcolor;
}
else
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}
</script>
<body>
<div align="center">
	<font size="+2" color="#CC3366" >外出请求列表</font>
</div>
<div align="center" id="mess"></br></br>${message}</div>

<div id="biao" ></br></br>
  <table  width="80%"  align="center" style="text-align:center" border="0" 
  cellpadding="0" cellspacing="1" bgcolor="b5d6e6"  onmouseover="changeto()"  onmouseout="changeback()">
    <tr>
      <td class="cond1"  background="functionpags/images/bg.gif"><div align="center">
          <input type="checkbox" name="checkboxs" value="checkbox" />
      </div></td>
      <td class="cond1"  background="functionpags/images/bg.gif">编号</td>
      <td class="cond1"  background="functionpags/images/bg.gif">申请人姓名</td>
      <td class="cond1"  background="functionpags/images/bg.gif">申请时间</td>
      <td class="cond1"  background="functionpags/images/bg.gif">申请天数</td>
      <td class="cond1"  background="functionpags/images/bg.gif">外出目的地</td>
      <td class="cond1"  background="functionpags/images/bg.gif">外出原因简述</td>
      <td class="cond1"  background="functionpags/images/bg.gif">状态</td>
      <td class="cond1"  background="functionpags/images/bg.gif">操作</td>
    </tr>
    	<c:forEach var="appout" items="${page.list}">
    		<tr>
    		    <td class="cond1"  background="functionpags/images/bg.gif"><div align="center">
                <input type="checkbox" name="checkboxs" value="checkbox" /></div></td>
	    		<td class="cond1"><c:out value="${appout.applyOutId }" /></td>
	    		<td class="cond1"><c:out value="${appout.userByApplyOutNameid.username}"/></td>
	    		<td class="cond1"><c:out value="${appout.applyOutTime}" /></td>
	    		<td class="cond1"><c:out value="${appout.applyOutNeedtimes }"/></td>
	    		<td class="cond1"><c:out value="${appout.applyOutDestination }" /></td>
	    		<td class="cond1"><c:out value="${appout.applyOutReasons}"/></td>
	    		<td class="cond1"><c:out value="${appout.applyReadState}"/></td>
	    		
	    		<td class="cond1"><div align="center"><span class="STYLE4"><img src="functionpags/images/edt.gif" width="16" height="16" />
	    		<a href="${pageContext.request.contextPath }/CheckReadOutAction?id=${appout.applyOutId}">查看</a></span>
	    			</div>
	    		</td>
    		</tr>
    	</c:forEach>
     <tr>
      <td colspan="9" height="35" background="functionpags/images/tab_19.gif">
	  <table width="100%" cellspacing="0" cellpadding="0" border="0" >
	 	<tr>
	 		 <td width="12" height="35"><img width="12" height="35" src="functionpags/images/tab_18.gif"></td>
			 <td><table width="100%" cellspacing="0" cellpadding="0" border="0">
					<tr>
					<td class="STYLE4" height="35">共有${page.totalrecord}条记录${page.totalpage}页，当前第${page.pagenum }页</td>
					<td height="35"><table align="right" cellspacing="0" cellpadding="0" border="0">
							<tr>
							<td width="40"><a href="${page.url }">
							<img width="37" height="15" src="functionpags/images/first.gif" BORDER="0"></a></td>
							
							<td width="45"><a href="${page.url }?pagenum=${page.pagenum-1 }">
							<img width="43" height="15" src="functionpags/images/back.gif" BORDER="0"></a>
							</td>
							<td width="45"><a href="${page.url }?pagenum=${page.pagenum+1 }">
							<img width="43" height="15" src="functionpags/images/next.gif" BORDER="0"></a></td> 
							
							<td width="40"><a href="${page.url }?pagenum=${page.totalpage}">
							<img width="37" height="15" src="functionpags/images/last.gif" BORDER="0"></a></td> 
							
							<td width="100"><div align="center"><span class="STYLE1">
								转到第
								<input type="text" style="height:20px; width:20px; border:1px solid #999999;" size="4" name="textfield" id="pagenum">页</span>
											</div></td>
							<td width="40"><img width="37" height="15" src="functionpags/images/go.gif" onclick="goWhich(document.getElementById('pagenum'))"></td>
							</tr>
								</table>
					</td>
					</tr>
							
				</table>
			</td>
			<td width="16" height="35"><img width="16" height="35" src="functionpags/images/tab_20.gif"></td>
		</tr>
	  </table></td>
    </tr>
	
  </table>
  
</div>
</body>
<script type="text/javascript">
		function goWhich(input){
			var pagenum = input.value;
			if(pagenum==null || pagenum==""){
				alert("请输入页码！");
				return;
			}
			
			if(!pagenum.match("\\d+")){
				alert("请输入数字！");
				input.value="";
				return;
			}
			
			if(pagenum<1 || pagenum>${page.totalpage}){
				alert("无效的页码！");
				input.value="";
				return;
			}
			window.location.href="${page.url }?pagenum=" + pagenum;
		}
		
		function dodelete(id)
  	{
  		var b = window.confirm("您确认删除吗？？");
  		/*if(b){
  			//window.location.href="${pageContext.request.contextPath }/servlet/DeleteCustomerServlet?id=" + id;
  		}*/
  	}
	</script>
</html>

