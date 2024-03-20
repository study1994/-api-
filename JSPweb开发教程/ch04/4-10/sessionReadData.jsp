<%@page contentType="text/html;charset=gb2312" language="java" %>
<% 
request.setCharacterEncoding("gb2312");              //设置浏览器编码类型
%>
<html>
  <body>
    <% String name = request.getParameter("name");    //获取用户名并赋给变量name
       //获取密码并赋给变量password
       String password = request.getParameter("password");
       session.setAttribute("name", name);            //在session中新增对象name
       session.setAttribute("password", password);      //在session中新增对象password
    %>
    <a href="usingSession.jsp">通过session显示登录信息</a>
  </body>
</html>