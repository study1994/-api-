<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
  <% 
	  String str = request.getParameter("submit");
	  if(str==null){
		  str="";
	  }
	  if(str.equals("yes")){
	  response.setContentType("application/msword;charset=GB2312");	
	  }
  %>
<html>
  <body>
  		response�����Ӧ��<br/>
  		�����ť��̬�ı�contentType����
    <form method="get" name="form">
      <input type="submit" value="yes" name="submit">
    </form>
  </body>
</html>
