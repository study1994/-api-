<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<html>
  <head>
    <title>myjsp</title>
  </head>
  <body>
   <%
   out.println(new Date().toLocaleString());  //��ȡ��ǰʱ��
   response.setHeader("refresh", "1");       //����ÿ1����ˢ��һ��
   %>
  </body>
</html>
