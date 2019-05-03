package pe.continental.hablabien.prueba;

import pe.continental.hablabien.service.HablaBienService;

/**
 *
 * @author soporte
 * @blog: www.desarrollasoftware.com
 */
public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    int consumo = 30;
    // Proceso
    double importe = HablaBienService.calcularImporte(consumo);
    double donacion = HablaBienService.calcularDonacion(consumo);
    // Reporte
    System.out.println("Consumo: " + consumo);
    System.out.println("Importe: " + importe);
    System.out.println("Donación: " + donacion);
  }
  
}
