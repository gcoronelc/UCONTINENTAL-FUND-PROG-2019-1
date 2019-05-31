
package pe.continental.impuestoanual.prueba;

import pe.continental.impuestoanual.service.ImpuestoAnualService;

/**
 *
 * @author EDWIN
 */
public class Prueba01 {
    public static void main (String[] args){
        //VARIABLES:
          double pagos = 930;
        //PROCESO:
          double sueldo = ImpuestoAnualService.calcularSueldo(pagos);
        //REPORTE:
          System.out.println("Pagos:" + pagos);
          System.out.println("Sueldo:" + sueldo);
    }
    
}
