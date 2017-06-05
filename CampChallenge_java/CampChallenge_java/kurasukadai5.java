/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.newkurasukadai.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.io.*;
import java.text.*;



/**
 *
 * @author kumi
 */
public class kurasukadai5 extends HttpServlet {

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
            out.println("<title>Servlet kurasukadai5</title>");            
            out.println("</head>");
            out.println("<body>");
            
            Collection entaku = new ArrayList();            //紹介されていない標準クラス
            Date now = new Date();                          //タイムスタンプ     
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            
            File log = new File ("test.txt");               //logを入れるファイルを開く
            FileWriter logw = new FileWriter(log);          //書き込むインスタンス
            
            logw.write("追加処理開始：" + sdf.format(now) + "<br>");
            
            
            entaku.add("King Arthur"+"<br>");
            entaku.add("Lancelot"+"<br>");
            entaku.add("Gawain"+"<br>");
            entaku.add("Galahad"+"<br>");
            entaku.add("Agravain"+"<br>");
            entaku.add("Bedivere"+"<br>");
            entaku.add("Tristan"+"<br>");
            entaku.add("Mordred");
            
            logw.write("追加処理終了" + sdf.format(now) + "<br>");
            
            logw.close();
            
            FileReader fr = new FileReader(log);
            BufferedReader br = new BufferedReader(fr);
            
            out.print(br.readLine());
            out.print("開始と終了の間に行われた処理：<br>" + entaku.toString());
            out.print("<br>" + "がCollectionに追加されました。");
            
            br.close();
            
            
            
            
            
            
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
