
package pe.continental.boletadepago.service;


public class BoletadePagoService {
    
    public static double CalcularSPP (double sueldomensual){
        
        // Datos
        double SPP;
        // Proceso
        SPP = sueldomensual * 0.10 + sueldomensual * 0.016 + sueldomensual * 0.0135 ;
        // Reporte
        return truncar2Dec (SPP);
    }

    public static double CalcularPartidoPolitico (double sueldomensual){
        
        // Datos
        double partidopolitico;
        // Proceso
        partidopolitico = sueldomensual * 0.07 ;
        // Reporte
        return truncar2Dec (partidopolitico);
    }
    
    
    
    public static double CalcularDescuentosTotal (double sueldomensual , double impuesto, double prestacion){
        
        // Datos
        double descuentostotal;
        // Proceso
        descuentostotal = CalcularSPP(sueldomensual) + CalcularPartidoPolitico(sueldomensual) +  ImpuestoALaRentaServiceBP.CalcularImpuestoALaRentaMensual(impuesto) + prestacion;
        // Reporte
        return truncar2Dec (descuentostotal);
    }
    
    public static double CalcularNetoAPagar (double sueldomensual, double impuesto, double prestacion){
        
        // Datos
        double netoapagar;
        // Proceso
        netoapagar = sueldomensual - CalcularDescuentosTotal(sueldomensual, impuesto, prestacion) ;
        // Reporte
        return truncar2Dec (netoapagar);
    }
    public static double CalcularEsSalud (double sueldomensual){
        
        // Datos
        double essalud;
        // Proceso
        essalud = sueldomensual * 0.09 ;
        // Reporte
        return truncar2Dec (essalud);
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
