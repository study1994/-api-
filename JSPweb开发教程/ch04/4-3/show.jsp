<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<html>
  <body>
刚才输入的内容是：<br/>
<%
  //获取form表单中所有具有name属性的表单对象，返回Enumeration类型的枚举
	Enumeration enu = request.getParameterNames();
  /*遍历获取的所有表单对象，获取各个对象值，并循环输出其名称和值*/
	while(enu.hasMoreElements()){
		String Name = (String)enu.nextElement();
		String value = (String)request.getParameter(Name);	
		out.println("参数名称："+Name);
		out.println("参数内容："+value);	
	}
%>
  </body>
</html>