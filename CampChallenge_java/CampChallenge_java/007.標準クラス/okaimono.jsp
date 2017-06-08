<%-- 
    Document   : okaimono
    Created on : 2017/06/07, 17:25:52
    Author     : kumi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>課題：商品見積もり</title>
    </head>
    <body>
        
    </body>
</html>

<%
    request.setCharacterEncoding("UTF-8");
    int syouhin = Integer.parseInt(request.getParameter("type"));
    int kane = Integer.parseInt(request.getParameter("total"));
    int kazu = Integer.parseInt(request.getParameter("count"));

    switch(syouhin){
        case 1:
            out.print("商品:冊子<br>");
            break;
        case 2:
            out.print("商品:小説<br>");
            break;
        case 3:
            out.print("商品:グッズ<br>");
            break;
    }    //商品種別の表示
    
    int tanka = kane / kazu; 
    out.print("一個当たりの値段：" + tanka + "円<br>" );
    //一個当たりの値段の算出、表示
    
    if( kane >= 5000 ){
        double point = kane * 0.05;
        out.print("5000円以上5%ポイント発生の為：" + point + "ポイント発生<br>");
    }else if(kane >= 3000){
        double point2 = kane * 0.04;
        out.print("3000円以上4%ポイント発生の為：" + point2 + "ポイントの発生<br>");
    } //総額に応じたポイントの計算、表示


      



%>