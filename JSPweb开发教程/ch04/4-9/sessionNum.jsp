<%@page contentType="text/html;charset=gb2312" language="java" %>
  <%!int Num = 0;%>
  <%
    if(session.isNew()){
      Num+=1;
      session.setAttribute("Num",Num); }       //在session中存入Num变量
  %>
<html>
  <body> 
  您是第<%=session.getAttribute("Num") %>个访问本站的用户
  </body>
</html>