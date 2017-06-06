<%-- 
    Document   : newjsp
    Created on : 2017/06/06, 11:17:02
    Author     : kumi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
    </body>
</html>

<%
    request.setCharacterEncoding("UTF-8");
   
    out.print("名前：" + request.getParameter("Name") + "<br>");
    String sex = request.getParameter("sex");
        if(sex != null){
            if(sex.equals("1")){
                out.print("性別：男性" + "<br>");
            }else if(sex.equals("2")){
                out.print("性別：女性" + "<br>");}
        }
    out.print("趣味：" + request.getParameter("syumi"));

%>
