<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>  
  <body>
  	<form method=post action=index.jsp>
  	  ����:<input type=text name=name><br>
  	  ����: <input type=password name=password><br>
  	  <input type=submit value=login>
  	</form>
		<!--��ȡ�û�������û��������룬���ֱ�ֵ������name��password��֮���жϱ���ֵ�Ƿ�Ϊ�գ�����Ϊ������ת��ҳ��receive.jsp�������ݲ���-->
  	<% String name=request.getParameter("name");
  	   String password = request.getParameter("password");
  	   if(name!=null&&password!=null){
		   response.sendRedirect("receive.jsp?sendname="+name+"&password="+password);		   }		
  	%>	
  </body>
</html>
