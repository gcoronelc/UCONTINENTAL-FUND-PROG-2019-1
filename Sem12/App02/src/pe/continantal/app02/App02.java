/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continantal.app02;

import egcc.util.SwingUtil;
import pe.continantal.app02.view.FormMain;

/**
 *
 * @author aulas_limno
 */
public class App02 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    FormMain view = new FormMain();
    SwingUtil.showFormCenter(view);
  }

}
