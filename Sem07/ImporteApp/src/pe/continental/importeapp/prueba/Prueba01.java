package pe.continental.importeapp.prueba;

import pe.continental.importeapp.service.CalcularImporteService;

public class Prueba01 {

  public static void main(String[] args) {
    // Consumo
    int consumoKWH = 100;
    // Proceso
    double importe = CalcularImporteService.calcularImporte(consumoKWH);
    // Reporte
    System.out.println("Consumo KWH: " + consumoKWH);
    System.out.println("Importe a pagar: " + importe);
  }
}
