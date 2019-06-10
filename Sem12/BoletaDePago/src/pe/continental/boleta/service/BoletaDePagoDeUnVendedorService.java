
package pe.continental.boleta.service;

/**
 *
 * @author SANGAY
 */
public class BoletaDePagoDeUnVendedorService {
    
    
    public static double CalcularRemuneracionBruta(double DiasTrabajados, double PagoDiario){
        
        // DATOS
        double RemuneracionBruta;
        
        // PROCESO
        RemuneracionBruta = DiasTrabajados * PagoDiario ;
        
        // REPORTE
        
        return truncar2Dec (RemuneracionBruta);
    
    }
    
    
    
    public static double CalcularFeriado(double DiasFeriados, double PagoFeriado){
        
        // DATOS
        double Feriado;
        
        // PROCESO
        Feriado = DiasFeriados * PagoFeriado ;
        
        // REPORTE
        
        return truncar2Dec (Feriado);
    
    }
    
    
    
    public static double CalcularComisionVenta(double VentaTotal){
        
        // DATOS
        double ComisionVenta;
        
        // PROCESO
        ComisionVenta = VentaTotal * 0.10 ; // 10% 
        
        // REPORTE
        
        return truncar2Dec (ComisionVenta);
    
    }
    
    
    
    public static double CalcularSueldoImponible(double RemuneracionBruta, double Feriado, double ComisionVenta){
        
        // DATOS
        double SueldoImponible;
        
        // PROCESO
        SueldoImponible = RemuneracionBruta + Feriado + ComisionVenta ;
        
        // REPORTE
        
        return truncar2Dec (SueldoImponible);
    
    }
   
    
     
    public static double CalcularAsignacionDeTransporte(double CostoDePasaje, double DiasTrabajados){
        
        // DATOS
        double AsignacionDeTransporte;
        
        // PROCESO
        AsignacionDeTransporte = CostoDePasaje * DiasTrabajados ;
        
        // REPORTE
        
        return truncar2Dec (AsignacionDeTransporte);
    
    }
    
    
    
    public static double CalcularIngresosTotales(double SueldoImponible, double AsignacionDeTransporte){
        
        // DATOS
        double IngresosTotales;
        
        // PROCESO
        IngresosTotales = SueldoImponible + AsignacionDeTransporte ;
        
        // REPORTE
        
        return truncar2Dec (IngresosTotales);
    
    }
    
    
    
    public static double CalcularAFPFondoDePensiones(double SueldoImponible){
        
        // DATOS
        double AFPFondoDePensiones;
        
        // PROCESO
        AFPFondoDePensiones = SueldoImponible * 0.10 ; // Impuesto de aporte 10%
        
        // REPORTE
        
        return truncar2Dec (AFPFondoDePensiones);
    
    }
    
    
    
    public static double CalcularAFPPrimaSeguro(double SueldoImponible){
        
        // DATOS
        double AFPPrimaSeguro;
        
        // PROCESO
        AFPPrimaSeguro = SueldoImponible * 0.0136 ; // Impuesto de seguro 1.36%
        
        // REPORTE
        
        return truncar2Dec (AFPPrimaSeguro);
    
    }
    
    
    public static double CalcularAFPComision(double SueldoImponible){
        
        // DATOS
        double AFPComision;
        
        // PROCESO
        AFPComision = SueldoImponible * 0.0155 ; // Impuesto de comision 1.55%
        
        // REPORTE
        
        return truncar2Dec (AFPComision);
    
    }
     
     
    public static double CalcularDescuentoTotal(double AFPFondoDePensiones, double AFPPrimaSeguro, double AFPComision){
        
        // DATOS
        double DescuentoTotal;
        
        // PROCESO
        DescuentoTotal = AFPFondoDePensiones + AFPPrimaSeguro + AFPComision ;
        
        // REPORTE
        
        return truncar2Dec (DescuentoTotal);
    
    }
      
      
      
    public static double CalcularESSALUD(double SueldoImponible){
        
        // DATOS
        double ESSALUD;
        
        // PROCESO
        ESSALUD = SueldoImponible * 0.09 ; // Impuesto 9%
        
        // REPORTE
        
        return truncar2Dec (ESSALUD);
    
    }
    
    
    public static double CalcularSueldoNeto(double IngresosTotales, double DescuentoTotal){
        
        // DATOS
        double SueldoNeto;
        
        // PROCESO
        SueldoNeto = IngresosTotales - DescuentoTotal ;
        
        // REPORTE
        
        return truncar2Dec (SueldoNeto);
    
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
