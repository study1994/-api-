<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<html>
  <body>
�ղ�����������ǣ�<br/>
<%
  //��ȡform�������о���name���Եı����󣬷���Enumeration���͵�ö��
	Enumeration enu = request.getParameterNames();
  /*������ȡ�����б����󣬻�ȡ��������ֵ����ѭ����������ƺ�ֵ*/
	while(enu.hasMoreElements()){
		String Name = (String)enu.nextElement();
		String value = (String)request.getParameter(Name);	
		out.println("�������ƣ�"+Name);
		out.println("�������ݣ�"+value);	
	}
%>
  </body>
</html>