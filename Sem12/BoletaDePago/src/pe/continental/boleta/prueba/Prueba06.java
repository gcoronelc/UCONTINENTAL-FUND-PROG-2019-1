
package pe.continental.boleta.prueba;

import pe.continental.boleta.service.BoletaDePagoDeUnVendedorService;

/**
 *
 * @author SANGAY
 */
public class Prueba06 {
    
    public static void main(String[] args) {
        
        // DATO
        double AFPFondoDePensiones = 165.40;
        double AFPPrimaSeguro = 22.49;
        double AFPComision = 25.64;
                                
        // PROCESO
        double DescuentoTotal = BoletaDePagoDeUnVendedorService.CalcularDescuentoTotal(AFPFondoDePensiones, AFPPrimaSeguro, AFPComision);
        
        // REPORTE
        System.out.println("Descuento Total : " + DescuentoTotal);
        
        
        
        
        
        
    }
  
    
    
    
    
    
    
    
    
    
    
}
