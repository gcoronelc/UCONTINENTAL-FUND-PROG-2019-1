package pe.continental.hablabien.service;

/**
 *
 * @author soporte
 * @blog: www.desarrollasoftware.com
 */
public class HablaBienService {

  public static double calcularImporte(int consumo) {
    // Dato
    double importe = 0.0;
    // Proceso
    int control = 0;
    while (consumo > 0) {
      control++;
      switch (control) {
        case 1: // Rango 50
          if (consumo > 50) {
            importe += 50 * 1.30;
            consumo -= 50;
          } else {
            importe += consumo * 1.30;
            consumo = 0;
          }
          break;
        case 2: // Rango 30
          if (consumo > 30) {
            importe += 30 * 1.20;
            consumo -= 30;
          } else {
            importe += consumo * 1.20;
            consumo = 0;
          }
          break;
        case 3: // Rango 70
          if (consumo > 70) {
            importe += 70 * 1.10;
            consumo -= 70;
          } else {
            importe += consumo * 1.10;
            consumo = 0;
          }
          break;
        case 4: // Rango 150
          if (consumo > 150) {
            importe += 150 * 1.00;
            consumo -= 150;
          } else {
            importe += consumo * 1.00;
            consumo = 0;
          }
          break;
        case 5: // Resto
          importe += consumo * 0.7;
          consumo = 0;
          break;
      }
    }
    // Reporte
    return importe;

  } // Fin de calcularImporte ( no comer )

  public static double calcularDonacion(int consumo) {
    // Dato
    double donacion = 0.0;
    // Proceso
    int control = 0;
    while (consumo > 0) {
      control++;
      switch (control) {
        case 1: // Rango 50
          if (consumo > 50) {
            donacion += 50 * 1.30 * 0.018;
            consumo -= 50;
          } else {
            donacion += consumo * 1.30 * 0.018;
            consumo = 0;
          }
          break;
        case 2: // Rango 30
          if (consumo > 30) {
            donacion += 30 * 1.20 * 0.020;
            consumo -= 30;
          } else {
            donacion += consumo * 1.20 * 0.020;
            consumo = 0;
          }
          break;
        case 3: // Rango 70
          if (consumo > 70) {
            donacion += 70 * 1.10 * 0.025;
            consumo -= 70;
          } else {
            donacion += consumo * 1.10 * 0.025;
            consumo = 0;
          }
          break;
        case 4: // Rango 150
          if (consumo > 150) {
            donacion += 150 * 1.00 * 0.030;
            consumo -= 150;
          } else {
            donacion += consumo * 1.00 * 0.030;
            consumo = 0;
          }
          break;
        case 5: // Resto
          donacion += consumo * 0.7 * 0.040;
          consumo = 0;
          break;
      }
    }

    // Reporte
    return donacion;

  } // Fin de calcularDonacion ( no comer )

} // Fin de clase ( no comer )
