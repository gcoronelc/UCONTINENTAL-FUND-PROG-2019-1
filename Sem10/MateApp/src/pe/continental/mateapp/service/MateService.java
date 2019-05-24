package pe.continental.mateapp.service;

import pe.continental.mateapp.dto.MateDto;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com 
 * @blog www.desarrollasoftware.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 */
public class MateService {

  public MateDto procesar( MateDto dto ){
    // Proceso
    int mcd = calcularMcd(dto.getNum1(), dto.getNum2());
    int mcm = calcularMcm(dto.getNum1(), dto.getNum2());
    // Reporte
    dto.setMcd(mcd);
    dto.setMcm(mcm);
    return dto;
  }

  private int calcularMcd(int num1, int num2) {
    // Proceso
    while( num1 != num2){
      if( num1 > num2){
        num1 = num1 - num2;
      } else {
        num2 = num2 - num1;
      }
    }
    // reporte
    return num1;
  }

  private int calcularMcm(int num1, int num2) {
    // Proceso
    int mcm = num1 * num2 / calcularMcd(num1, num2);
    // Reporte
    return mcm;
  }
  
}
