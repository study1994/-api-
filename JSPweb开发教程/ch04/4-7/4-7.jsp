<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
  <head>
  <title>myjsp</title>
  </head>
  <body>
    <%
      out.println("JSP");              				//输出文本并换行
      out.clearBuffer();               				//清除缓冲区中数据
      out.println("JSP Web应用开发案例教程<br>");		//输出文本并换行
      out.flush();                    				//输出缓冲区中的数据
      out.println(out.getBufferSize()+"bytes");     		//获取并输出缓冲区大小
      out.close();                  					//关闭输出流
      out.println("我不会出现");      					//输出文本并换行
    %>
  </body>
</html>