package pe.continental.mateapp.prueba;

import pe.continental.mateapp.dto.MateDto;
import pe.continental.mateapp.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    MateDto dto = new MateDto();
    dto.setNum1(20);
    dto.setNum2(15);
    // Proceso
    MateService mateService = new MateService();
    dto = mateService.procesar(dto);
    // Reporte
    System.out.println("DATOS");
    System.out.println("Número 1: " + dto.getNum1());
    System.out.println("Número 2: " + dto.getNum2() + "\n");
    System.out.println("REPORTE");
    System.out.println("MCD: " +dto.getMcd());
    System.out.println("MCM: " +dto.getMcm());
  }

}
