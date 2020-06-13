/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.design;

/**
 *
 * @author NazgulTorre
 */
public class Conversor {
    
   //método para conversão de °C para °F
   public Double celFah(double cel){
       return 9 * cel / 5 + 32;
   } 
   
   public Double fahCel(Double fah){
       return (fah - 32) / 9 * 5;
   }
    
}
