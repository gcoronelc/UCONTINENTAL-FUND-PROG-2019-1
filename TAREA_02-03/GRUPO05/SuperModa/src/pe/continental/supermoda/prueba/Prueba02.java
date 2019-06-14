
package pe.continental.supermoda.prueba;

import pe.continental.supermoda.service.SuperModaService;

/**
 *
 * @author SANGAY
 */
public class Prueba02 {
    
    public static void main(String[] args) {
        
        // DATOS
        double PrecioDelLote = 50000;
        double GastosAdministrativos = 25;
        
        // PROCESO
        
        double CostoTotal = SuperModaService.CalcularCostoTotal(PrecioDelLote, GastosAdministrativos);
        
        // REPORTE
        System.out.println(" Costo Total del Lote : " + CostoTotal);
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
