
package pe.continental.boletadepago.pruebas;

import pe.continental.boletadepago.service.BoletadePagoService;

public class Prueba03 {
    
    public static void main(String[] args) {
        // Datos
        double sueldomensual = 5400.00;
        double prestacion = 0;
        double impuesto = 1000;
        
        //proceso
        double descuento = BoletadePagoService.CalcularDescuentosTotal(sueldomensual, impuesto, prestacion);
        // reporte
        System.out.println("SPP :" + descuento);
        
        
    }
}
