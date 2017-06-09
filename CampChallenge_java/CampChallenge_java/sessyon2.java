/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sessyon2.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 *
 * @author kumi
 */
public class sessyon2 extends HttpServlet {

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
            
            request.setCharacterEncoding("UTF-8");      //入力された情報の引継ぎ
            String name = request.getParameter("name");
            String sex = request.getParameter("sex");
            String syumi = request.getParameter("syumi");
            
            out.print("今回入力された情報：<br>");      //今回入力された情報の表示
            out.print("名前：" + name + "<br>");
            out.print("性別：" + sex + "<br>");
            out.print("趣味：" + syumi + "<br>");
                      
            HttpSession hs = request.getSession();     //セッションに登録
            hs.setAttribute("name", name);
            hs.setAttribute("sex",sex);
            hs.setAttribute("syumi",syumi);
            
            out.print("<br>前回入力された情報" + "<br>");           //前回入力された情報の表示
            String oldName = (String)hs.getAttribute("name");
            out.print("名前：" + oldName + "<br>");
            
            String oldSex = (String)hs.getAttribute("sex");
             out.print("性別：" + oldSex + "<br>");
            
            String oldsyumi = (String)hs.getAttribute("syumi");
            out.print("趣味：" + oldsyumi +  "<br>");
            
            
            
            
            
            
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
