<%@page contentType="text/html;charset=gb2312" language="java" import="java.sql.*" 	errorPage=""%>
<html>
  <head>
    <title>�ޱ����ĵ�</title>
  </head>
  <body>
    <%
       int n=0;
		//��ȡapplication��������ֵ��count�Ķ��󣬲�����counter
       String counter = (String)application.getAttribute("count");  
       if(counter!=null)                  //���counter��Ϊ��
       n = Integer.parseInt(counter);        //��counterֵת��Ϊ���Σ�������n
       n=n+1;
       out.print("��"+n+"��");
       counter = String.valueOf(n);         //����string���͵�n��ֵ��������counter
       //������counter��ӵ�application�У���Ϊ��ָ�������ؼ���count
       application.setAttribute("count", counter);
    %>
  </body>
</html>
