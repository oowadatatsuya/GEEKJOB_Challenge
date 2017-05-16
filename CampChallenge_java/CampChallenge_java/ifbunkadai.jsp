<%-- 
    Document   : ifbunkadai
    Created on : 2017/05/16, 16:02:21
    Author     : kumi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int num = 2;
    
if (num == 1) { 
    out.print("１です！");
} else if (num == 2) { 
    out.print("プログラミングキャンプ！");
}  else {
    out.print("その他です！");
}

%>
