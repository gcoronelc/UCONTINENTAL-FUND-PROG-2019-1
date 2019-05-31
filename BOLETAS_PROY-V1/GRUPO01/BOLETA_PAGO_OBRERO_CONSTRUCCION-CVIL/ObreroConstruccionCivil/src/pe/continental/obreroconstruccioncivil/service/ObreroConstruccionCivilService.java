

package pe.continental.obreroconstruccioncivil.service;

/**
 *
 * @author: Angie Cauti Guzman
 * @author: Sebastian Rodriguez Valdez
 */
public class ObreroConstruccionCivilService {
 // Constantes:
    public static final String OPERARIO = "OPERARIO";
    public static final String OFICIAL = "OFICIAL";
    public static final String PEON = "PEON";
    
    
    public static double determinarSalarioBasico(String  categoria, int diasLaborados){
        // Variable:
        double salariojornal = 0.0;
        // Proceso:
      switch (categoria){
          case OPERARIO :
              salariojornal = 67.20 * diasLaborados;
              break;
          case OFICIAL :
              salariojornal = 53.70 * diasLaborados;
              break;
          case PEON :
              salariojornal = 48.10 * diasLaborados;
              break;
              
      }
        // Reporte:
        return Trunco2Deci(salariojornal);
    }
    public static double determinarDominical(String categoria, int diasLaborados){
       // Variable:
        double dominical = 0.0;
        // Proceso:
        switch (categoria){
            case OPERARIO:
               dominical = 67.20 / 6 * diasLaborados;
                break;
            case OFICIAL:
                dominical = 53.70 / 6 * diasLaborados;
                break;
            case PEON:
                dominical = 48.10 / 6 * diasLaborados;
                break;
        }
        // Reporte:
        return Trunco2Deci(dominical);
      
    }
    public static double determinarBUC(String categoria, int diasLaborados){
        // Variable:
        double BUC = 0.0;
        // Proceso:
        switch (categoria){
            case OPERARIO:
                BUC = 67.20 * 0.32 * diasLaborados;
                break;
            case OFICIAL:
                BUC = 53.70 * 0.30 * diasLaborados;
                break;
            case PEON:
                BUC = 48.10 * 0.30 * diasLaborados;
                break;       
        }
        // Reporte:
        return Trunco2Deci(BUC);
      
    }
    
    public static double determinarMovilidad(int diasLaborados){
        // Variable:
        double Movilidad;
        // Proceso:
        Movilidad = 7.2 * diasLaborados;
        // Reporte:
        return Trunco2Deci(Movilidad);
    }
    
    public static double determinarIndemnizacion(String categoria, int diasLaborados){
      // Variable: 
      double Indemnizacion;
      // Proceso:
      Indemnizacion = determinarSalarioBasico(categoria, diasLaborados)* 0.15;
      // Reporte:
      return Trunco2Deci(Indemnizacion);
  }
    public static double determinarVacaciones(String categoria, int diasLaborados){
      // Variable:
      double vacaciones = 0;
      // Proceso:
      vacaciones = determinarSalarioBasico(categoria, diasLaborados)* 0.10;
      // Reporte:
      return Trunco2Deci(vacaciones);
  }
    public static double determinarAsignacion(String categoria, int cantHijos, int diasLaborados){
      // Variable:  
      double asignacion;
      // Proceso: 
      asignacion = determinarSalarioBasico(categoria, diasLaborados)/12 * cantHijos;
      // Reporte:
      return Trunco2Deci(asignacion);
}
   // Condicion:
    public static final String FIESTASPATRIAS = "Fiestas Patrias";
    public static final String NAVIDAD = "Navidad";
    public static double determinarGratificacion(String categoria, String condicion, int diasLaborados){
        // Variable:
        double gratificacion = 0 ;
        // Proceso:
        switch (categoria){
            case OPERARIO:
                switch(condicion){
                    case FIESTASPATRIAS:
                        gratificacion = 12.80 * (diasLaborados + 1);
                        break;
                    case NAVIDAD:
                        gratificacion = 17.92 * (diasLaborados + 1);
                        break;
                 
                }
            case OFICIAL:
                switch(condicion){
                    case FIESTASPATRIAS:
                        gratificacion = 10.23 * (diasLaborados +1);
                        break;
                    case NAVIDAD:
                        gratificacion = 14.32 * (diasLaborados + 1);
                       
                }
            case PEON:
                switch (condicion){
                    case FIESTASPATRIAS:
                        gratificacion = 9.16 * (diasLaborados + 1);
                        break;
                    case NAVIDAD:
                        gratificacion = 12.83 * (diasLaborados +1);
                  break;
                }
           break;     
        }
        
        
       
        // Reporte:
           return Trunco2Deci(gratificacion);
           
    }
    public static double Pago60Extra (String categoria, int diasLaborados, int dias60extra){
        // Variable:
        double pago60extra;
        // Proceso:
        pago60extra = determinarSalarioBasico(categoria, diasLaborados)/diasLaborados / 8 * dias60extra + determinarSalarioBasico(categoria, diasLaborados)/ diasLaborados / 8 *0.60* dias60extra;
        // Reporte: 
        return Trunco2Deci(pago60extra);
        
    }
    public static double Pago100Extra(String categoria, int diasLaborados, int dias100extra){
        // Variable:
        double pago100extra;
        // Proceso:
        pago100extra = determinarSalarioBasico(categoria, diasLaborados)/diasLaborados /8 *2 *dias100extra;
        // Reporte:
        return Trunco2Deci(pago100extra);
    }
    public static double determinarONP(String categoria, int diasLaborados){
        // Variable:
        double ONP;
        // Proceso:
        ONP = (determinarSalarioBasico(categoria, diasLaborados)+ determinarDominical(categoria, diasLaborados)+ determinarBUC(categoria, diasLaborados)+ determinarVacaciones(categoria, diasLaborados))*0.13;
        // Reporte:
        return Trunco2Deci(ONP);
    }
    public static double determinarCONAFOVICER(String categoria, int diasLaborados){
        // Variable:
        double CONAFOVICER;
        // Proceso:
        CONAFOVICER =(determinarSalarioBasico(categoria, diasLaborados)+ determinarDominical(categoria, diasLaborados))*0.02;
        // Reporte:
        return Trunco2Deci(CONAFOVICER);
    }
    
    public static double ImporteTotal(String categoria, int diasLaborales, int cantHijos , int dias60extra, int dias100extra, String condicion){
        // Variable:
        double importeTotal;
        // Proceso
        importeTotal = determinarSalarioBasico(categoria, diasLaborales)+determinarDominical(categoria, diasLaborales)+determinarBUC(categoria, diasLaborales)+determinarMovilidad(diasLaborales)+determinarAsignacion(categoria, cantHijos, diasLaborales)+Pago60Extra(categoria, diasLaborales, dias60extra)+ Pago100Extra(categoria, diasLaborales, dias100extra)+determinarVacaciones(categoria, diasLaborales)+determinarIndemnizacion(categoria, diasLaborales)+ determinarGratificacion(categoria, condicion, diasLaborales)-determinarCONAFOVICER(categoria, diasLaborales)-determinarONP(categoria, diasLaborales);
        // Reporte
        return Trunco2Deci(importeTotal);
    
    }
    public static double Trunco2Deci (double dato){
        // Proceso
        dato = dato *100;
        dato = Math.round(dato)*1.0;
        dato = dato / 100.0;
        // Reporte
        return dato;
    }
   
}
