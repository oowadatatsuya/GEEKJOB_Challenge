/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blackjackServlet.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;


//このプログラム上でのゲームの仕様とルール
//Aは1で固定で11カウントはしません。jokerもなし。
//勝敗が決するまで操作は全自動で行います。
//チップの概念は無し。従って特別ルール等もなし。
//以上


/**
 *
 * @author kumi
 */
public class BlackJack extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
     
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BlackJack</title>");            
            out.println("</head>");
            out.println("<body>");
       
        // ディーラーとユーザーのインスタンス   
          Dealer dealer = new Dealer();
          User user = new User();
        //手札配布
          dealer.setCard(dealer.deal());
          user.setCard(dealer.deal());
        //ユーザーの手札処理
        int usercount =0; 
        while(user.checkSum()){
             user.setCard(dealer.hit()); //17以下ならhit
            usercount++;
            }out.print("あなたは" + usercount + "回hitしました"+"<br>");
        //ディーラーの手札処理
        int dealercount =0;
        while(dealer.checkSum()){
             dealer.setCard(dealer.hit()); //16以下ならhit
             dealercount++; 
            }out.print("ディーラーは" + dealercount + "回hitしました"+"<br>" ); 
            
            out.print(dealer.myCards + "ディーラー手札<br>");
            out.print(user.myCards + "ユーザー手札<br>");
        
        String coment="";
        if(user.open()>=22){    //ユーザー手札が22を超えた
           coment=("BURSTしました。<br>");
        }else if(dealer.open()>=22){   //ディーラー手札が22を超えた
           coment=("ディーラーがBURSTしました。<br>");
        }else if(user.open() > dealer.open()){  //ユーザー手札がディーラー手札より強い
           coment=("あなたの勝ちです。<br>");
        }else if(user.open() == dealer.open()){  //手札が同じ
           coment=("引き分けですね。<br>");
        }else{                                 //ユーザー手札がディーラー手札より弱い
            coment=("あなたの負けです。<br>");
        }
        
        out.print(coment);
        out.print("あなたの手札：" + user.open() + "<br>");
        out.print("ディーラーの手札：" + dealer.open() + "<br>");
        
            
            
            
            
            
            
            
            
            
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
