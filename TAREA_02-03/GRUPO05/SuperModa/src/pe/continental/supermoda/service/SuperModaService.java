
package pe.continental.supermoda.service;

/**
 *
 * @author SANGAY
 */
public class SuperModaService {
  
    
    public static double CalcularUnidadesComercializadas(double TamañoDelLote){
    
        // DATOS
        double UnidadesComercializadas;
        
        // PROCESO
        UnidadesComercializadas = TamañoDelLote * 0.90;
        
        // REPORTE
        return truncar2Dec (UnidadesComercializadas);
    
    }
    
    
    
     public static double CalcularCostoTotal(double PrecioDelLote, double GastosAdministrativos) {
        
        // DATOS
        double CostoTotal;
        
        // PROCESO
        CostoTotal = PrecioDelLote + (PrecioDelLote * GastosAdministrativos/100) ; 
        
        // REPORTE
        return truncar2Dec (CostoTotal);
       
    }
     
     
     public static double CalcularCostoUnitario(double CostoTotal, double UnidadesComercializadas) {
      
        // DATOS
        double CostoUnitario;
        
        // PROCESO
        CostoUnitario = CostoTotal / UnidadesComercializadas ;
        
        // REPORTE
        return truncar2Dec (CostoUnitario);
        
    }
     
     
     
     public static double CalcularPrecioDeVenta(double CostoUnitario, double GananciaPorUnidad) {
        
        // DATOS
        double PrecioDeVenta;
        
        // PROCESO
        PrecioDeVenta = CostoUnitario + (CostoUnitario * GananciaPorUnidad/100) ;
        
        // REPORTE
        
        return truncar2Dec (PrecioDeVenta);
        
    }
    
     
     
     
     public static double CalcularPrecioAlPublico(double PrecioDeVenta) {
        
        // DATOS
        double PrecioAlPublico;
        
        // PROCESO
        PrecioAlPublico = PrecioDeVenta * (1 + 0.18) ; // 18% de IGV
        
        // REPORTE
        return truncar2Dec (PrecioAlPublico);
        
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
