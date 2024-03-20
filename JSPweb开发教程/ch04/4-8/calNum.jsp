<%@page contentType="text/html;charset=gb2312" language="java" import="java.sql.*" 	errorPage=""%>
<html>
  <head>
    <title>无标题文档</title>
  </head>
  <body>
    <%
       int n=0;
		//获取application对象索引值是count的对象，并赋给counter
       String counter = (String)application.getAttribute("count");  
       if(counter!=null)                  //如果counter不为空
       n = Integer.parseInt(counter);        //将counter值转换为整形，并赋给n
       n=n+1;
       out.print("第"+n+"次");
       counter = String.valueOf(n);         //返回string类型的n的值，并赋给counter
       //将对象counter添加到application中，并为其指定索引关键字count
       application.setAttribute("count", counter);
    %>
  </body>
</html>
