
package pe.continental.supermoda.prueba;

import pe.continental.supermoda.service.SuperModaService;

/**
 *
 * @author SANGAY
 */
public class Prueba03 {
    
     public static void main(String[] args) {
        
        // DATOS
        double CostoTotal = 62500;
        double UnidadesComercializadas = 900;
        
        // PROCESO
        double CostoUnitario = SuperModaService.CalcularCostoUnitario(CostoTotal, UnidadesComercializadas);
        
        // REPORTE
        System.out.println(" Costo por Unidad : " + CostoUnitario);
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
