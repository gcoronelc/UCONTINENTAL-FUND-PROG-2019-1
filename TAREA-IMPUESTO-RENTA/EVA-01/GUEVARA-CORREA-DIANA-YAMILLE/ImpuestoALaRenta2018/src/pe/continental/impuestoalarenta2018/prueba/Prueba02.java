
package pe.continental.impuestoalarenta2018.prueba;

import pe.continental.impuestoalarenta2018.service.ImpuestoALaRentaService;
public class Prueba02 {
    public static void main(String[] args) {
        // Datos
        double sueldomensual = 5400;
        double dato = 93;
        //proceso
        double gratificacion = ImpuestoALaRentaService.CalcularGratificaciones(sueldomensual, dato);
        // reporte
        System.out.println("Sueldo Mensual :" + sueldomensual);
        System.out.println("Gratificaciones :" + gratificacion);
    }
}
