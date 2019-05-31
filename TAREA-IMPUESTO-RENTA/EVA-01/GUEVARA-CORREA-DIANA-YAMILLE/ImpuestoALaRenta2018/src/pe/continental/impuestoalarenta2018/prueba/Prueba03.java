
package pe.continental.impuestoalarenta2018.prueba;

import pe.continental.impuestoalarenta2018.service.ImpuestoALaRentaService;

public class Prueba03 {
    public static void main(String[] args) {
    // Datos
        int sueldomensual = 5400;
        double dato = 93;
        //proceso
        double gratificacionextraordinaria = ImpuestoALaRentaService.CalcularGratificacionesExtraordinarias(sueldomensual, dato);
        // reporte
        System.out.println("Sueldo Mensual :" + sueldomensual);
        System.out.println("Gratificacion Extraordinaria :" + gratificacionextraordinaria);
        
    
    }
}
