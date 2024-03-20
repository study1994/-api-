<html>
  <body>
  <%
     Object id = session.getAttribute("name");   //获取session中关键字name对应的对象
     Object password = session.getAttribute("password");
/*如果id不为空，输出姓名和密码，否则输出文字“无设置session数据！！”*/
     if(id!=null){
     out.println("姓名："+id.toString());
     out.println("<br>");
     out.println("密码："+password.toString());
     }else{
        out.println("无设置session数据！！");
     }  
  %>
  </body>
</html>
