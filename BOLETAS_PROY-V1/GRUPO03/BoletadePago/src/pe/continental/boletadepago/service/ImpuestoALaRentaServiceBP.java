
package pe.continental.boletadepago.service;

public class ImpuestoALaRentaServiceBP {
    
    public static double CalcularSueldoAnual(double sueldomensual, double dato) {
        // Datos
        double sueldoAnual;
        //Proceso
        sueldoAnual = 12 * (sueldomensual + dato);
        //Reporte
        return truncar2Dec (sueldoAnual);
      
    }
    
    public static double CalcularGratificaciones (double sueldomensual, double dato) {
        // Datos
        double gratificacion;
        //Proceso
        gratificacion = 2 * (sueldomensual + dato);
        //Reporte
        return truncar2Dec (gratificacion);
       
    }
        
    public static double CalcularGratificacionesExtraordinarias (double sueldomensual, double dato) {
        // Datos
        double gratificacionextraordinaria;
        //Proceso
        gratificacionextraordinaria = CalcularGratificaciones(sueldomensual, dato)*0.09;
        //Reporte
        return truncar2Dec (gratificacionextraordinaria);
    }
    
    public static double CalcularHorasExtras (double horasextras, double sueldomensual, double dato) {
        // Datos
        double pagoxhorasextras;
        
        //Proceso
        pagoxhorasextras = horasextras * 1.5 * (sueldomensual+dato)/160 ;
        //Reporte
        return truncar2Dec (pagoxhorasextras);
    }

   public static double CalcularRentaBruta (double sueldomensual, double horasextras, double otros, double dato) {
        // Datos
        double rentabruta;
        
        //Proceso
        rentabruta = CalcularSueldoAnual(sueldomensual, dato) + CalcularGratificaciones(sueldomensual, dato) + CalcularGratificacionesExtraordinarias(sueldomensual, dato) + CalcularHorasExtras(horasextras, sueldomensual, dato) + otros;
        
        //Reporte
        return truncar2Dec (rentabruta);
    }
    public static double CalcularRNIT ( double rentabruta, double dato2, double dato1) {
        // Datos
        double RNIT ;
        
        // Proceso
        RNIT = (rentabruta + CalcularRentaNeta4(dato1) ) - (29050 + dato2);
        
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
    public static double CalcularAsignacion (double dato) {   
        // Datos
        double asignacion  ;
        dato = 93;
        //Proceso
        asignacion = dato ;
        
        //Reporte
        return truncar2Dec (asignacion);
    }
    public static double CalcularRentaNeta4 (double dato1) {   
        // Datos
        double rentaneta4  ;
        
        //Proceso
        rentaneta4 = (dato1 - dato1 * 0.20) ;
        
        //Reporte
        return truncar2Dec (rentaneta4);
    }
    public static double CalcularIngresosTotales (double dato1, double dato2, double sueldomensual, double horasextras, double otros, double dato) {   
        // Datos
        double ingresostotales  ;
        
        //Proceso
        ingresostotales = CalcularRentaNeta4(dato1) + CalcularRentaBruta(sueldomensual, horasextras, otros, dato) ;
        
        //Reporte
        return truncar2Dec (ingresostotales);
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

