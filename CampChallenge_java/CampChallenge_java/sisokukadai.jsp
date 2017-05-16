<%-- 
    Document   : sisokukadai
    Created on : 2017/05/16, 15:02:49
    Author     : kumi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
  final int BASE = 100;
  int num = 2;
  
out.print(BASE + num);
out.print(BASE - num);
out.print(BASE * num);
out.print(BASE / num);

%>