<%@page contentType="text/html;charset=gb2312"%>
<%@page import="java.util.*"%>
<HTML>
  <body bgcolor=cyan><font size=2.2>
  <%
    //ָ��������������������ݽ������±���ʱ��ʹ�õı���
    request.setCharacterEncoding("gb2312");  
    String path = request.getServletPath();     //��ȡ����Servlet�Ĳ���URL,������path
    String webDir = request.getContextPath(); //��ȡ��ǰҳ��Ļ���·����������webDir
//��ȡ��webDir������ĸ�𳤶�Ϊ1���ַ�������ʣ���ַ�����ֵ��webDir
    webDir = webDir.substring(1);           
    String clientIP = request.getRemoteAddr();   //��ȡ�ͻ��˵�IP��ַ��������clientIP
    int serverPort=request.getServerPort();   //��ȡURL����Ķ˿ںţ�������serverPort
    int clientPort = request.getRemotePort();	     //��ȡ�ͻ��˶˿ںţ�������clientPort
    String serverName = request.getServerName();   //��ȡ����������������serverName
    //��ȡrequest���ַ����뼯���ƣ�������characterEncoding
    String characterEncoding = request.getCharacterEncoding();  
  %>
  �û������ҳ�棺<%=path%>
  <br/>web����Ŀ¼������:<%=webDir%>
  <br/>�û���IP��ַ:<%=clientIP%>
  <br/>�������Ķ˿ں�:<%=serverPort%>
  <br/>�ͻ��˵Ķ˿ں�:<%=clientPort %>
  <br/>����������:<%=serverName %>
  <br/>�����ַ�����:<%=characterEncoding %>
  </body>
</HTML>