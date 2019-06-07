/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.app01;

import egcc.util.SwingUtil;
import pe.continental.app01.view.FormMain;

/**
 *
 * @author aulas_limno
 */
public class App01 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    FormMain view = new FormMain();
    SwingUtil.showFormCenter(view);
  }
  
}
