<%-- 
    Document   : keisankekka
    Created on : 2017/06/08, 17:25:29
    Author     : kumi
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>計算結果</title>
    </head>
    <body>
        
    </body>
</html>

<%
    request.setCharacterEncoding("UTF-8");
   String moto2 = request.getParameter("suuji");
   int moto = Integer.parseInt(moto2);
   String kotae = "";
   
    if(moto == 1){
        out.print("１は無理です。"); //1が入力された場合
    };

    int[] sosu ={2,3,5,7};
    
        for(int kari:sosu){
            while(true){
                if(moto%kari == 0 && moto/kari != 1){
                    kotae += kari + "*";
                    moto = moto/kari;
                }else{ 
                    break;
                }
            }
        }
        
        
     out.print(moto2 + "の素因数結果は" + kotae + moto);  

%>