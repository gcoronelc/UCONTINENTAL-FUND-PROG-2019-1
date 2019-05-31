
package pe.continental.boletadepagodeunvendedor.prueba;

import pe.continental.boletadepagodeunvendedor.service.BoletaDePagoDeUnVendedorService;

/**
 *
 * @author SANGAY
 */
public class Prueba08 {
    
    public static void main(String[] args) {
        
        // DATO
        double IngresosTotales =1804.00;
        double DescuentoTotal = 213.53;
        
        // PROCESO
        double SueldoNeto = BoletaDePagoDeUnVendedorService.CalcularSueldoNeto(IngresosTotales, DescuentoTotal);
        
        // REPORTE
        System.out.println("Sueldo Neto : " + SueldoNeto);
   
        
    }
    
    
    
    
    
    
    
    
    
}
