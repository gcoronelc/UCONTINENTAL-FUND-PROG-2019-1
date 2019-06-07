
package pe.continental.boleta.prueba;

import pe.continental.boleta.service.BoletaDePagoDeUnVendedorService;

/**
 *
 * @author SANGAY
 */
public class Prueba05 {
    
    public static void main(String[] args) {
        
        // DATOS
        double SueldoImponible = 1654.00;
        
        // PROCESO
        double AFPFondoDePensiones = BoletaDePagoDeUnVendedorService.CalcularAFPFondoDePensiones(SueldoImponible);
        double AFPPrimaSeguro = BoletaDePagoDeUnVendedorService.CalcularAFPPrimaSeguro(SueldoImponible);
        double AFPComision = BoletaDePagoDeUnVendedorService.CalcularAFPComision(SueldoImponible);
        
        // REPORTE
        System.out.println(" AFP Fondo De Pensiones : " + AFPFondoDePensiones);
        System.out.println("AFP Prima Seguro : " + AFPPrimaSeguro);
        System.out.println("AFP Comision : " + AFPComision);
        
    }
    
    
    
    
    
    
    
    
    
    
}
