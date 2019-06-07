
package pe.continental.boletadepagodeunvendedor.prueba;

import pe.continental.boletadepagodeunvendedor.service.BoletaDePagoDeUnVendedorService;

/**
 *
 * @author SANGAY
 */
public class Prueba03 {
    public static void main(String[] args) {
    
    // INGESOS NO REMUNERATIVOS
    
        // DATOS
        double CostoDePasaje = 5.00;
        double DiasTrabajados = 30;
        
        // PROCESO
        double AsignacionDeTransporte = BoletaDePagoDeUnVendedorService.CalcularAsignacionDeTransporte(CostoDePasaje, DiasTrabajados);
        
        // REPORTE
        System.out.println("Asignacion De Transporte : " + AsignacionDeTransporte);
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
