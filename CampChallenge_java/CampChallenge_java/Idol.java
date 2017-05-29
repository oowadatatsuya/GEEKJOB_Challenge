/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kusasukadai.sample;

import java.io.PrintWriter;



/**
 *
 * @author kumi
 */
public class Idol {
     //フィールド
    public String name = "" ;
    public int age= 0 ;
    //メソッド
    public void setIdol(String a,int n){
        
        //　引数をフィールドへ
        this.name = a;
        this.age = n;
    
    }
    
public void output (PrintWriter out){
       out.print("名前は" + name + "。<br>");
       out.print("年齢は" + age + "歳。");
 }

    /**
     *
     * @param args
     */
    public void teigi(String[] args){
   // クラスにインスタンス生成
      Idol uzuki = new Idol();
   // インスタンスのメソッド利用 
    uzuki.setIdol("島村凛",15);
  }
    
    
}
