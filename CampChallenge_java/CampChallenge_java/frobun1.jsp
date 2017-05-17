<%-- 
    Document   : frobun1
    Created on : 2017/05/17, 14:26:58
    Author     : kumi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
     long num = 8;
        for(int i=1; i<20; i++){
     num =num * 8;
     }        
      out.print(num);  
 
%>
