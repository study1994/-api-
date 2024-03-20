<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>  
  <body>
  	<form method=post action=index.jsp>
  	  姓名:<input type=text name=name><br>
  	  密码: <input type=password name=password><br>
  	  <input type=submit value=login>
  	</form>
		<!--获取用户输入的用户名和密码，并分别赋值给变量name和password，之后判断变量值是否为空，若不为空则跳转到页面receive.jsp，并传递参数-->
  	<% String name=request.getParameter("name");
  	   String password = request.getParameter("password");
  	   if(name!=null&&password!=null){
		   response.sendRedirect("receive.jsp?sendname="+name+"&password="+password);		   }		
  	%>	
  </body>
</html>
