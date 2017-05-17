<%-- 
    Document   : hairetsu1
    Created on : 2017/05/17, 13:16:46
    Author     : kumi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String[] date = {"10","100","soeda","hayashi","-20","118","END"};
    
    date[2] = "33";
    
    out.print(date[2]);
%>