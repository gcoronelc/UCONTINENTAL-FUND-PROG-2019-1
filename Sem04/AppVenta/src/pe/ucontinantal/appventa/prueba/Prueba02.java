
package pe.ucontinantal.appventa.prueba;

import pe.ucontinantal.appventa.service.VentaService;


public class Prueba02 {
  
  public static void main(String[] args) {
    // Datos
    double precio = 118.7;
    int cantidad = 25;
    // Proceso
    double dcto = VentaService.calcularDcto(precio, cantidad);
    double importeTotal = VentaService.calcularImporteTotal(precio, cantidad);
    // Reporte
    System.out.println("Dcto: " + dcto);
    System.out.println("Importe Total: " + importeTotal);
  }
}
