package pe.continental.descomponerapp.service;

public class PlataService {

  public static String descompone( int importe ){
    // Variable del reporte
    String repo = "";
    // Valor iniciales
    String tipo = "BILLETES";
    int valor = 200;
    int cant = 0;
    // Proceso
    while( importe > 0){
      // Calculos
      cant = importe / valor;
      importe = importe % valor;
      // Reporte
      if( cant > 0 ){
        repo += tipo + " de " + valor + ": " + cant + "\n";
      }
      // Siguiente valor
      switch( valor ){
        case 200:
          valor = 100;
          break;
        case 100:
          valor = 50;
          break;
        case 50:
          valor = 20;
          break;
        case 20:
          valor = 10;
          break;
        case 10:
          valor = 5;
          tipo = "MONEDAS";
          break;
        case 5:
          valor = 2;
          break;
        case 2:
          valor = 1;
          break;
      }
    }
    // Reporte
    return repo;
  }

  
}
