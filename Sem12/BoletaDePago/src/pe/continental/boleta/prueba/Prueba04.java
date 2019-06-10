
package pe.continental.boleta.prueba;

import pe.continental.boleta.service.BoletaDePagoDeUnVendedorService;

/**
 *
 * @author SANGAY
 */
public class Prueba04 {
    public static void main(String[] args) {
    
    // TOTAL DE INGRESOS ( remunerativos y no remunerativos )
        
            // DATOS
            double SueldoImponible = 1654.00;
            double AsignacionDeTransporte = 150.00;
           
            // PROCESO
            double IngresosTotales = BoletaDePagoDeUnVendedorService.CalcularIngresosTotales(SueldoImponible, AsignacionDeTransporte);
            
            
            // REPORTE
            System.out.println("Ingresos Totales : " + IngresosTotales);
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
