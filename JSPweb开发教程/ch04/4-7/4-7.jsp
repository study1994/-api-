<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
  <head>
  <title>myjsp</title>
  </head>
  <body>
    <%
      out.println("JSP");              				//����ı�������
      out.clearBuffer();               				//���������������
      out.println("JSP WebӦ�ÿ��������̳�<br>");		//����ı�������
      out.flush();                    				//����������е�����
      out.println(out.getBufferSize()+"bytes");     		//��ȡ�������������С
      out.close();                  					//�ر������
      out.println("�Ҳ������");      					//����ı�������
    %>
  </body>
</html>