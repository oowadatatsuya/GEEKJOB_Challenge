/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jdbc.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.*;

/**
 *
 * @author kumi
 */
public class jdbc extends HttpServlet {

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
        
    Connection db_con = null;
    PreparedStatement db_st = null;
    ResultSet db_data = null;    
    request.setCharacterEncoding("UTF-8");
        
    try (PrintWriter out = response.getWriter()) {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GEEKJOB_db","oowada","gomibako");
        System.out.print("接続を確認"); //接続の確認
        
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String tell = request.getParameter("tell");
        int age = Integer.parseInt(request.getParameter("age"));
        String birthday = request.getParameter("birthday"); //入力された情報の変換
        
       
        db_st = db_con.prepareStatement("insert into proflies values (?,?,?,?,?)");
        db_st.setInt(1, id);
        db_st.setString(2, name);
        db_st.setString(3, tell);
        db_st.setInt(4, age);
        db_st.setString(5, birthday);
        db_st.executeUpdate(); 
        System.out.print("情報の格納確認"); //入力された情報の格納
        
        db_st = db_con.prepareStatement("select * from proflies");
        db_data = db_st.executeQuery();
       
       
//         if(!db_data.next()){
//        System.out.print("入力データなし");
//    }else{
//              db_data.beforeFirst();
//    while(db_data.next()){
//        System.out.println("ID:" + db_data.getString("profilesID") +"<br>");
//        System.out.println("名前:" + db_data.getString("name")+ "<br>");
//        System.out.println("番号:" + db_data.getString("tell")+"<br>" );
//        System.out.println("年齢:" + db_data.getString("age")+"<br>");
//        System.out.println("誕生:" + db_data.getString("birthday")+"<br>");        
//        }}
//        System.out.println("情報の表示終了");//入力された情報の確認
        
        db_data.close();
        db_st.close();
        db_con.close();
        
    }catch(SQLException e_sql){
        System.out.print("1:接続時にエラーが発生しました:" + e_sql.toString());
    }catch(Exception e){
        System.out.print("2:接続時にエラーが発生しました:" + e.toString());
    }finally{
        if(db_con != null){
            try{db_con.close();
            }catch(Exception e_con){
                System.out.print(e_con.getMessage());
            }
        }
        
        
        
        
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
