<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
  <body>
		<!--获取传递过来的参数，并分别赋值给sendName和password，对两个值进行比较，若其中一个为空，则返回页面index.jsp，否则输出用户名和欢迎信息-->
		<%
		String sendName = request.getParameter("sendname");
		String password = request.getParameter("password");
		if(sendName.equals("")||password.equals("")){
			response.sendRedirect("index.jsp");
		}		
		%>
		<%=sendName %><br/>
		<font size = 5>欢迎回来！</font>
  </body>
</html>
