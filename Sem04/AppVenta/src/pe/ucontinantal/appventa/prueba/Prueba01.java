package pe.ucontinantal.appventa.prueba;

import pe.ucontinantal.appventa.service.VentaService;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    int cant1 = 8;
    int cant2 = 15;
    int cant3 = 28;
    int cant4 = 50;
    // Proceso
    double dcto1 = VentaService.determinarPorcDcto(cant1);
    double dcto2 = VentaService.determinarPorcDcto(cant2);
    double dcto3 = VentaService.determinarPorcDcto(cant3);
    double dcto4 = VentaService.determinarPorcDcto(cant4);
    // Reporte
    System.out.println("Cantidad " + cant1 + " Dcto. " + dcto1);
    System.out.println("Cantidad " + cant2 + " Dcto. " + dcto2);
    System.out.println("Cantidad " + cant3 + " Dcto. " + dcto3);
    System.out.println("Cantidad " + cant4 + " Dcto. " + dcto4);
  }
  
}
