
package pe.continental.impuestoanual.prueba;

import pe.continental.impuestoanual.service.ImpuestoAnualService;

/**
 *
 * @author EDWIN
 */
public class Prueba02 {
    public static void main (String[] args) {
        //VARIABLES:
          double sueldo = 1200;
          double bono = 500;
          double gratificacion = 2400;
          double vacaciones = 1200;
        //PROCESO:
          double remuneracionBruta = ImpuestoAnualService.calcularRemuneracionBruta(bono, bono, gratificacion, vacaciones);
        //REPORTE:
          System.out.println("remuneracionBruta:" + remuneracionBruta);
          System.out.println("Sueldo:" + sueldo);
          System.out.println("Bono:" + bono);
          System.out.println("Gratificacion:" + gratificacion);
          System.out.println("Vacaciones:" + vacaciones);
    }
    
}
