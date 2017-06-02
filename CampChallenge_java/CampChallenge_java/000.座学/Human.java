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


/**
 *
 * @author kumi
 */
abstract public class Human {
    abstract public int open(); //手札公開
    abstract public void setCard(ArrayList<Integer>Hand); //山から手札
    abstract public boolean checkSum(); //手札の判定
    protected ArrayList<Integer> myCards = new ArrayList<Integer>(); //手札を作る
    
}
