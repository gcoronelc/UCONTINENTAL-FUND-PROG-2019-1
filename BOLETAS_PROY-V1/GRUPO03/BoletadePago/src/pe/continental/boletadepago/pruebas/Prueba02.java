
package pe.continental.boletadepago.pruebas;

import pe.continental.boletadepago.service.BoletadePagoService;

public class Prueba02 {
    
    public static void main(String[] args) {
        // Datos
        double sueldomensual = 5400.00;
        
        //proceso
        double partidopolitico = BoletadePagoService.CalcularPartidoPolitico(sueldomensual);
        // reporte
        System.out.println("SPP :" + partidopolitico);
        
        
    }
}
