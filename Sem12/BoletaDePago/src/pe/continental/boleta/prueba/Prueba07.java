
package pe.continental.boleta.prueba;

import pe.continental.boleta.service.BoletaDePagoDeUnVendedorService;

/**
 *
 * @author SANGAY
 */
public class Prueba07 {
    public static void main(String[] args) {
        
        // DATOS
        double SueldoImponible = 1654.00;
        
        // PROCESO
        double ESSALUD = BoletaDePagoDeUnVendedorService.CalcularESSALUD(SueldoImponible);
       
        
        // REPORTE
        System.out.println("ESSALUD : " + ESSALUD);
        
        
        
        
        
    }
    
    
    
    
    
    
}
