package pe.continental.appsumar.prueba;

import pe.continental.appsumar.service.MateService;

public class Prueba01 {
  
  public static void main(String[] args) {
    
    // Datos
    int n1 = 76;
    int n2 = 65;
    
    // Proceso
    int suma = MateService.sumar(n1, n2);
    
    // Reporte
    System.out.println("Número 1: " + n1);
    System.out.println("Número 2: " + n2);
    System.out.println("Suma: " + suma);
    
  }
  
}
