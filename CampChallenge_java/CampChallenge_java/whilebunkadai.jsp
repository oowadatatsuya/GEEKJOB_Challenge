<%-- 
    Document   : whilebunkadai
    Created on : 2017/05/17, 16:56:26
    Author     : kumi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
 int num = 1000;
 int count = 0;
 
while(num>=100){
    num =num / 2;
    count++;
   }

out.print(count+ "回割りました");

%>
