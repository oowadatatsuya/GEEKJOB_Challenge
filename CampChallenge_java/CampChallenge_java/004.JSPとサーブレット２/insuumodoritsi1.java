/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.IDs.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kumi
 */
public class insuumodoritsi1 extends HttpServlet {

    String ID[] = {"1111","2222","3333"};
    String name[] = {"水戸","宇都宮","前橋",};
    String birth[] = {"2000/01/01","2000/02/02","2000/03/03",};
    String address[]= {"茨城",null,"群馬"};
 
 String person(int id){
        String profile = ""; 
     if(id == 1){
              profile = name[0] + "さん" + birth[0] + "生まれ" + address[0] + "出身" + "<br>";
     }
     if(id == 2){
         
              profile = name[1] + "さん" + birth[1] + "生まれ" + address[1] + "出身" + "<br>";
         }
     if(id == 3){
              profile = name[2] + "さん" + birth[2] + "生まれ" + address[2] + "出身" + "<br>";
     }
 
     return profile;
     
    }
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
            out.println("<title>Servlet insuumodoritsi1</title>");            
            out.println("</head>");
            out.println("<body>");
           // ループ処理
          char key = 'A';
        while(key != 'D'){
                 switch(key){
            
                case 'A': out.print(person(1) + "<br>");
                  key = 'B';
                  break;
               
                case 'B': out.print(person(2) + "<br>");
                key = 'C';
                if(address[1] == null){continue;}
                  
                  break;
                  
                case 'C': out.print(person(3) + "<br>");
                  key = 'D';
                  break;
        }
                  
        
        
        
        
        }            
            
            
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
