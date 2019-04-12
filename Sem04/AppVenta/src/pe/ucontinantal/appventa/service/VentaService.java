package pe.ucontinantal.appventa.service;

public class VentaService {
  
  public static double determinarPorcDcto( int cantidad){
    // Dato inicial
    double dcto = 0.0;
    // Proceso
    if( cantidad <= 12 ){
      dcto = 0.0; // 0%
    } else if( cantidad <= 24 ){
      dcto = 0.05; // 5%
    } else if( cantidad <= 36 ){
      dcto = 0.08; // 8%
    } else {
      dcto = 0.10; // 10%;
    }
    // Reporte
    return dcto;
  }
  
  
  public static double calcularDcto( double precio, int cantidad){
    // Variables
    double dcto = 0.0;
    // Proceso
    double total = precio * cantidad;
    dcto = total * determinarPorcDcto(cantidad);
    // Reporte
    return dcto;
  }
  
  public static double calcularImporteTotal(double precio, int cantidad){
    // Variables
    double importeTotal = 0.0;
    // Proceso
    double total = precio * cantidad;
    double dcto = total * determinarPorcDcto(cantidad);
    importeTotal = total - dcto;
    // Reporte
    return importeTotal;
  }
}
