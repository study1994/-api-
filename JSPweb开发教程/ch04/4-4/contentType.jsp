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
  		response对象的应用<br/>
  		点击按钮动态改变contentType属性
    <form method="get" name="form">
      <input type="submit" value="yes" name="submit">
    </form>
  </body>
</html>
