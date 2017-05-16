<%-- 
    Document   : hensuukadai
    Created on : 2017/05/16, 13:48:52
    Author     : kumi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
  int height = 179;
  String name = "大和田達也です";
  
out.print(name);
out.print("身長は" + height + "cmです");

%>