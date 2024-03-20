<%@page contentType="text/html;charset=gb2312"%>
<%@page import="java.util.*"%>
<HTML>
  <body bgcolor=cyan><font size=2.2>
  <%
    //指定对浏览器发送来的数据进行重新编码时所使用的编码
    request.setCharacterEncoding("gb2312");  
    String path = request.getServletPath();     //获取调用Servlet的部分URL,并赋给path
    String webDir = request.getContextPath(); //获取当前页面的环境路径，并赋给webDir
//截取掉webDir从首字母起长度为1的字符串，将剩余字符串赋值给webDir
    webDir = webDir.substring(1);           
    String clientIP = request.getRemoteAddr();   //获取客户端的IP地址，并赋给clientIP
    int serverPort=request.getServerPort();   //获取URL请求的端口号，并赋给serverPort
    int clientPort = request.getRemotePort();	     //获取客户端端口号，并赋给clientPort
    String serverName = request.getServerName();   //获取服务器名，并赋给serverName
    //获取request的字符编码集名称，并赋给characterEncoding
    String characterEncoding = request.getCharacterEncoding();  
  %>
  用户请求的页面：<%=path%>
  <br/>web服务目录的名字:<%=webDir%>
  <br/>用户的IP地址:<%=clientIP%>
  <br/>服务器的端口号:<%=serverPort%>
  <br/>客户端的端口号:<%=clientPort %>
  <br/>服务器名称:<%=serverName %>
  <br/>正文字符编码:<%=characterEncoding %>
  </body>
</HTML>