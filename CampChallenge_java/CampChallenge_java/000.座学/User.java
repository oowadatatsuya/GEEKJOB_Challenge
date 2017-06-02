/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blackjackServlet.sample;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 *
 * @author kumi
 */
public class User extends Human{
    
@Override
public int open(){
      int total = 0;
      for(int i = 0; i< myCards.size();i++){
          total+= myCards.get(i);
      }
   
        
        
       return total;
}

@Override
public boolean checkSum(){
       int total = open();
       return total<= 17;
}

@Override
public void setCard(ArrayList<Integer>Hand){
     for(int i=0;i<Hand.size();i++){
         myCards.add(Hand.get(i));
     }
         }

}
