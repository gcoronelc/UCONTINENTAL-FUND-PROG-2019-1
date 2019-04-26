package pe.continental.descomponerapp.prueba;

import pe.continental.descomponerapp.service.PlataService;

public class Prueba01 {

  public static void main(String[] args) {
    // Importe
    int importe = 1377;
    // Proceso
    String repo = PlataService.descompone(importe);
    // Reporte
    System.out.println("IMPORTE: " + importe);
    System.out.println("REPORTE: ");
    System.out.println(repo);
  }
}
