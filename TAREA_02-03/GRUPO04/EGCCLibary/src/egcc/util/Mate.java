/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egcc.util;

/**
 *
 * @author aulas_limno
 */
public class Mate {
  
  public static double dosDec( double num){
    num *= 100;
    num = Math.round(num);
    num /= 100.0;
    return num;
  }
  
  
}
