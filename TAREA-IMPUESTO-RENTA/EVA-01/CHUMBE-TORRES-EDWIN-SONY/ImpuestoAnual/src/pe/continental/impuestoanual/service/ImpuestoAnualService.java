
package pe.continental.impuestoanual.service;

/**
 *
 * @author EDWIN
 */
public class ImpuestoAnualService {
    public static double calcularSueldo (double pagos){
        //VARIABLES:
          double sueldo;
        //PROCESO:
          sueldo = pagos*12;
        //REPORTE:
          return sueldo;
    }
    
    public static double calcularRemuneracionBruta (double pagos, double bono, double gratificacion, double vacaciones ){
        //VARIABLES:
          double remuneracionBruta;
        //PROCESO:
          remuneracionBruta = (calcularSueldo(pagos) + bono + gratificacion + vacaciones);
        //REPORTE:
          return remuneracionBruta;
    }
    
    public static double calcularRemuneracionNeta (double pagos, double bono, double gratificacion, double vacaciones){
        //VARIABLES:
          double remuneracionNeta;
        //PROCESO:
          remuneracionNeta = calcularRemuneracionBruta(pagos, bono, gratificacion, vacaciones) - 29400;
        //REPORTE:
          return remuneracionNeta;
    }
    
    public static double calcularImpuestoProyectado (double pagos, double bono, double gratificacion, double vacaciones){
        //VARIABLES:
          double impuestoProyectado = 0.0;
        //PROCESO:
          int control = 0;
          while (calcularRemuneracionNeta(pagos, bono, gratificacion, vacaciones) > 0) {
              control++;
              switch (control) {
                  case 1:
                      if (calcularRemuneracionNeta(pagos, bono, gratificacion, vacaciones)>4200*5){
                          impuestoProyectado += 4200*5*0.08;
                          
                      }else{
                          impuestoProyectado += calcularRemuneracionNeta(pagos, bono, gratificacion, vacaciones)*0.08;
                          
                      }
                      break;
              }
          }
        //REPORTE:
          return impuestoProyectado;
    }
    
}
