<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
  <body>
		<!--��ȡ���ݹ����Ĳ��������ֱ�ֵ��sendName��password��������ֵ���бȽϣ�������һ��Ϊ�գ��򷵻�ҳ��index.jsp����������û����ͻ�ӭ��Ϣ-->
		<%
		String sendName = request.getParameter("sendname");
		String password = request.getParameter("password");
		if(sendName.equals("")||password.equals("")){
			response.sendRedirect("index.jsp");
		}		
		%>
		<%=sendName %><br/>
		<font size = 5>��ӭ������</font>
  </body>
</html>
