
package pe.continental.impuestoalarenta2018.service;


public class IngresosTotalesService {
     public static double CalcularRNIT ( double rentabruta) {
        // Datos
        double RNIT ;
        
        // Proceso
        RNIT = rentabruta - 29050;
        
        // Reporte
        return truncar2Dec (RNIT);
        
        
    }
    
    public static double CalcularImpuestoALaRentaAnual(double RNIT) {   // IMPUESTOALARENTANUAL = IRA
        // Datos
        double impuesto = 0;
        //PROCESO
        int control = 0;
        while (RNIT > 0){
            control++;
            switch(control){
            case 1:
              if ( RNIT > 20750){
                  impuesto += 20750*0.08;
                  RNIT -= 20750;
              }else{
                  impuesto += RNIT*0.08;
                  RNIT = 0;
                  
              }
              break;
              case 2:
              if ( RNIT > 62250){
                    impuesto += 62250*0.14;
                  RNIT -= 62250;
              }else{
                  impuesto += RNIT*0.14;
                  RNIT = 0;
                  
              }
              break;
              case 3:
              if ( RNIT > 62250){
                  impuesto += 62250*0.17;
                  RNIT -= 62250;
              }else{
                  impuesto += RNIT*0.17;
                  RNIT = 0;
                  
              }
              break;
              case 4:
              if ( RNIT > 41500){
                  impuesto += 41500*0.20;
                  RNIT -= 41500;
              }else{
                  impuesto += RNIT*0.20;
                  RNIT = 0;
                  
              }
              break;
               case 5:
              
                  impuesto += RNIT*0.3;
                  RNIT  = 0;   
              break;
                  }
                  }
        
        //REPORTE
        return truncar2Dec (impuesto);
        
        
    }
    public static double CalcularImpuestoALaRentaMensual(double impuesto) {   // IMPUESTOALARENTAMENSUAL = IRM
        // Datos
        double IRM  ;
        
        //Proceso
        IRM = impuesto / 12 ;
        
        //Reporte
        return truncar2Dec (IRM);
    }
    private static double truncar2Dec(double dato) {
        //Proceso
        dato = dato*100;
        dato = Math.round(dato) * 1.0;
        dato = dato / 100.0;
       
        //Reporte
        return dato;
        
        
    }
}
