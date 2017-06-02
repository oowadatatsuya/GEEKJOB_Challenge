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

// ディーラー
public class Dealer extends Human{
    
   ArrayList<Integer>cards = new ArrayList<Integer>(); //山札
    private int i;

   //初期処理でcardsに全てのトランプを渡す
   public Dealer(){
        for(int mark=1;mark<=4;mark++){  //ﾏｰｸ４種分
         for(int num=1;num<=10;num++){   //１～１０の数
             cards.add(num);
         }}
        for(int i=1;i<=12;i++){          //各絵柄J,Q,K分の１０
             cards.add(10);}
   }
   
   Random rand = new Random();            //乱数
   //公開メソッドdeal、cardsからランダム２枚を山札に戻す
   public ArrayList<Integer> deal(){
       ArrayList<Integer>dealCard = new ArrayList<>();
       for(int i=0;i<2;i++){                   //２枚渡す為のループ
       Integer Index =rand.nextInt(cards.size()); 
       dealCard.add(cards.get(Index));       //ランダムで１枚渡す    
       cards.remove(Index);                  //渡した分の消去
       }return dealCard;                     //結果を戻す
       }
   
   //公開メソッドhit、cardsからランダム１枚
   public ArrayList<Integer> hit(){
       ArrayList<Integer>hitCard = new ArrayList<>();
       Integer Index = rand.nextInt(cards.size());
       hitCard.add(cards.get(Index));
       cards.remove(Index);
       return hitCard;
}

   @Override
   public int open(){
       int total = 0;
       for(int i = 0;i < myCards.size();i++){
           total+= myCards.get(i);}          //手札を足す
       
       
       
       
   return total;
}
  
@Override
public boolean checkSum(){
      int total = open();
       return total<=16;
     
}

@Override
public void setCard(ArrayList<Integer>Hand){
         for(int i=0; i<Hand.size();i++){
         myCards.add(Hand.get(i));
         }
}

}

 


 
   
   
   
   
   
   
   
    
    
    
    











