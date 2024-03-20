<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<html>
  <head>
    <title>myjsp</title>
  </head>
  <body>
   <%
   out.println(new Date().toLocaleString());  //获取当前时间
   response.setHeader("refresh", "1");       //设置每1秒钟刷新一次
   %>
  </body>
</html>
