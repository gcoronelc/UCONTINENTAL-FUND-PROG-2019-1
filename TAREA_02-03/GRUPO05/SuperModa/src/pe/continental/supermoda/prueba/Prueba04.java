
package pe.continental.supermoda.prueba;

import pe.continental.supermoda.service.SuperModaService;

/**
 *
 * @author SANGAY
 */
public class Prueba04 {
    
     public static void main(String[] args) {
        
        // DATOS
        double CostoUnitario = 69.44;
        double GananciaPorUnidad = 200;
        
        // PROCESO
       double PrecioDeVenta = SuperModaService.CalcularPrecioDeVenta(CostoUnitario, GananciaPorUnidad);
                
           
        // REPORTE
        System.out.println(" Precio de Venta : " + PrecioDeVenta);
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
