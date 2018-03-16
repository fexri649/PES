<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Fakhri_HP
  Date: 3/16/2018
  Time: 11:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Netice</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <% ArrayList <String> Listf = (ArrayList<String>)request.getAttribute("list"); %>

        <%for(int i =0; i< Listf.size();i+=2){%>
    <div class="sets"> <label class="dres"><%=Listf.get(i)%> </label><label class="dress">  VS   </label> <label style="margin-left: 14px" class="dres"><%=Listf.get(i+1)%></label></div>

    <%}%>

</body>
</html>
