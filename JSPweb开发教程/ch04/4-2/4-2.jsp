<%@page contentType="text/html;charset=gb2312"%>
<%@page import="java.util.*"%>
<HTML>
  <body>
  输入用“#”分隔的数字，点击提交按钮会将#分隔的数字相加
    <form action="" method=post name =form>
      <input type="text" name = "jsp">
      <br/>
      <input type="submit" value = "运算" name="submit">
    </form>
    <%
      //获取name属性值为jsp的表单对象的值，并赋给content
      String content = request.getParameter("jsp");      
      if(content==null){                        //对content进行非空判断
         content = ""; 
      }
      //按#分割content值，将结果以字符串数组形式返回
      String arr[] = content.split("#");
      double sum = 0;
      try{
      /*遍历数组中各项，并将各项转换成double类型后相加*/
      for(String str:arr){
        out.print(" "+str);
        sum+=Double.parseDouble(str);
      }
      out.print("<br/>数字的和是:"+sum);         //输出各项相加后的值
      }catch(Exception e){
      out.print("请输入数字");
      }
    %>
  </body>
</HTML>