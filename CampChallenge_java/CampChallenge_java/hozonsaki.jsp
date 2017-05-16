<%-- 
    Document   : hozonsaki
    Created on : 2017/05/16, 17:35:56
    Author     : kumi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
   
    char kana = 'A';
    
    switch(kana){
        case 'A':
         out.print("英語");
         break ;
      
        case 'あ' :
         out.print("日本語");
         break ;
        
        default:
         break ;
}

%>         