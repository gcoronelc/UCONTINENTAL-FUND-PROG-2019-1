
package pe.continental.supermoda.prueba;


import pe.continental.supermoda.service.SuperModaService;

/**
 *
 * @author SANGAY
 */
public class Prueba01 {
    
     public static void main(String[] args) {
        
        // DATOS
        double TamañoDelLote = 1000;
       
        
        // PROCESO
        double UnidadesComercializadas = SuperModaService.CalcularUnidadesComercializadas(TamañoDelLote);
        
        // REPORTE
        System.out.println(" Unidades Comercializadas : " + UnidadesComercializadas);
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
