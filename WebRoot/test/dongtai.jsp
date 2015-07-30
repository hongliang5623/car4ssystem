<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>My JSP 'upload.jsp' starting page</title>
   
 <meta http-equiv="pragma" content="no-cache">
 <meta http-equiv="cache-control" content="no-cache">
 <meta http-equiv="expires" content="0">   
 <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
 <meta http-equiv="description" content="This is my page">
 <!--
 <link rel="stylesheet" type="text/css" href="styles.css">
 -->
<script type="text/javascript">
function addmore(){
var td=document.getElementByIdx_x("more");
var sp=document.createElement("span");
var br=document.createElement_x("br");
var file=document.createElement_x("input");
var button=document.createElement_x("input");
 file.type="file";
 file.name="file";
 button.type="button";
 button.value="remove";
 button.onclick=function(){
 td.removeChild(br);
  td.removeChild(file);
   td.removeChild(button);
 }
 
 td.appendChild(br);
 td.appendChild(file);
 td.appendChild(button);
}
</script>
  </head>
 
  <body>
    <form action="upload" method="post">
    <table>
	    <tr>
		     <td>name</td>
		     <td><input id="xingming" type="text" name="xingming" /></br></td>
	    </tr>
	    <tr>
		     <td>数量</td>
		     <td><input id="shuliang" type="text" name="shuliang" value="2" /></td>
	    </tr>
	    <tr>
		     <td>file</td>
		     <td id="more"><input type ="file" /><input type="button" value="more" onclick="addmore();"/></td>
	    </tr>
	    <tr>
		     <td>提交</td>
		     <td><input type="submit"></td>
		     
	    </tr>
    </table>
   </form>
  </body>
</html>