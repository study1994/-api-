<%@page contentType="text/html;charset=gb2312"%>
<%@page import="java.util.*"%>
<HTML>
  <body>
  �����á�#���ָ������֣�����ύ��ť�Ὣ#�ָ����������
    <form action="" method=post name =form>
      <input type="text" name = "jsp">
      <br/>
      <input type="submit" value = "����" name="submit">
    </form>
    <%
      //��ȡname����ֵΪjsp�ı������ֵ��������content
      String content = request.getParameter("jsp");      
      if(content==null){                        //��content���зǿ��ж�
         content = ""; 
      }
      //��#�ָ�contentֵ����������ַ���������ʽ����
      String arr[] = content.split("#");
      double sum = 0;
      try{
      /*���������и����������ת����double���ͺ����*/
      for(String str:arr){
        out.print(" "+str);
        sum+=Double.parseDouble(str);
      }
      out.print("<br/>���ֵĺ���:"+sum);         //���������Ӻ��ֵ
      }catch(Exception e){
      out.print("����������");
      }
    %>
  </body>
</HTML>