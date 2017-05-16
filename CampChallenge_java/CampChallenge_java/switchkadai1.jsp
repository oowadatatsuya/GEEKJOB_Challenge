<%-- 
    Document   : switchkadai1
    Created on : 2017/05/16, 16:48:43
    Author     : kumi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int num = 1;
    switch(num){
        case 1 :
            out.print("one");
            break;
            
        case 2 :
            out.print("two");
            break;
 
        default :
           out.print("想定外");
           break;
    }
            
%>