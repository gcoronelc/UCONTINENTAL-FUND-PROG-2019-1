package pe.continental.importeapp.service;

public class CalcularImporteService {

  public static double calcularImporte(int consumoKWH) {
    // variable
    double importe = 0.0;
    // Proceso
    int control = 0;
    while(consumoKWH > 0){
      control++;
      switch(control){
        case 1:
          if(consumoKWH > 100){
            importe += 100 * 0.4;
            consumoKWH -= 100;
          } else {
            importe += consumoKWH *0.4;
            consumoKWH = 0;
          }
          break;
        case 2:
          if(consumoKWH > 100){
            importe += 100 * 0.5;
            consumoKWH -= 100;
          } else {
            importe += consumoKWH *0.5;
            consumoKWH = 0;
          }
          break;
        case 3:
          if(consumoKWH > 100){
            importe += 100 * 0.6;
            consumoKWH -= 100;
          } else {
            importe += consumoKWH *0.6;
            consumoKWH = 0;
          }
          break;
        case 4:
          if(consumoKWH > 100){
            importe += 100 * 0.7;
            consumoKWH -= 100;
          } else {
            importe += consumoKWH *0.7;
            consumoKWH = 0;
          }
          break;
        case 5:
          importe += consumoKWH *0.8;
          consumoKWH = 0;
          break;
          
      }
    }
    // reporte
    return importe;
  }
}
