
package pe.continental.supermoda.prueba;

import pe.continental.supermoda.service.SuperModaService;

/**
 *
 * @author SANGAY
 */
public class Prueba05 {
    
    public static void main(String[] args) {
        
        // DATOS
        double PrecioDeVenta = 208.32;
        
        // PROCESO
        double PrecioAlPublico = SuperModaService.CalcularPrecioAlPublico(PrecioDeVenta);
        
        // REPORTE
        System.out.println(" Precio al Publico : " + PrecioAlPublico);
        
        
    }
    
    
    
    
    
    
    
    
    
}
