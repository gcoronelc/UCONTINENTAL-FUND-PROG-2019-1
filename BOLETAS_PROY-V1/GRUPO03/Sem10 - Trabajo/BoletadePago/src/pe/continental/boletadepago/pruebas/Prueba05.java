
package pe.continental.boletadepago.pruebas;

import pe.continental.boletadepago.service.BoletadePagoService;

public class Prueba05 {
    
    public static void main(String[] args) {
        // Datos
        double sueldomensual = 5400.00;
        
        //proceso
        double essalud = BoletadePagoService.CalcularEsSalud(sueldomensual);
        // reporte
        System.out.println("SPP :" + essalud);
        
        
    }
}
