
package pe.continental.boletadepago.pruebas;

import pe.continental.boletadepago.service.BoletadePagoService;

public class Prueba01 {
    
    public static void main(String[] args) {
        // Datos
        double sueldomensual = 5400.00;
        
        //proceso
        double SPP = BoletadePagoService.CalcularSPP(sueldomensual);
        // reporte
        System.out.println("SPP :" + SPP);
        
        
    }
}
