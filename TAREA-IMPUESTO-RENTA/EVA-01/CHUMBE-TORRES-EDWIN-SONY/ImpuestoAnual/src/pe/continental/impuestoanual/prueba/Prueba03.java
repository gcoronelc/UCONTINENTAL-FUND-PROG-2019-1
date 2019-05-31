
package pe.continental.impuestoanual.prueba;

import pe.continental.impuestoanual.service.ImpuestoAnualService;

/**
 *
 * @author EDWIN
 */
public class Prueba03 {
    public static void main (String[] args){
        //VARIABLES:
          double sueldo = 2000;
          double bono = 1000;
          double gratificacion = 4000;
          double vacaciones = 2000;
        //PROCESO:
          double remuneracionNeta = ImpuestoAnualService.calcularRemuneracionNeta(bono, bono, gratificacion, vacaciones);
        //REPORTE:
           System.out.println("remuneracionNeta:" + remuneracionNeta);
           System.out.println("Sueldo:" + sueldo);
           System.out.println("Bono:" + bono);
           System.out.println("Gratificacion:" + gratificacion);
           System.out.println("Vacaciones:" + vacaciones);
    }
    
}
