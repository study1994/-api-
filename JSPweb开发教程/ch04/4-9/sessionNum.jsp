<%@page contentType="text/html;charset=gb2312" language="java" %>
  <%!int Num = 0;%>
  <%
    if(session.isNew()){
      Num+=1;
      session.setAttribute("Num",Num); }       //��session�д���Num����
  %>
<html>
  <body> 
  ���ǵ�<%=session.getAttribute("Num") %>�����ʱ�վ���û�
  </body>
</html>