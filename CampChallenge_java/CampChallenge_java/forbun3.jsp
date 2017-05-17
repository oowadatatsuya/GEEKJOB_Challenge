<%-- 
    Document   : forbun3
    Created on : 2017/05/17, 16:37:40
    Author     : kumi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int a = 0;
    for(int i=1; i<= 100; i++){
    a = a + i;
    
    } 
    
out.print(a);



%>