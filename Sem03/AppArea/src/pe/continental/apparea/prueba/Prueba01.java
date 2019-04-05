
package pe.continental.apparea.prueba;

import pe.continental.apparea.service.MateService;


public class Prueba01 {
 
  public static void main(String[] args) {
    //datos
    int base = 30;
    int altura = 40;
    // proceso
    int area = MateService.areaDelRectangulo(base, altura);
    //reporte
    System.out.println("base: " + base);
    System.out.println("altura: " + altura);
    System.out.println("area: " + area);
    
  }
}
