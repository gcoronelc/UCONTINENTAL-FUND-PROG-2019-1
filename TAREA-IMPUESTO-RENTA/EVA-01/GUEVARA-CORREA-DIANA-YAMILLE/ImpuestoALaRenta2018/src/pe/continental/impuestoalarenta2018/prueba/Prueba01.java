
package pe.continental.impuestoalarenta2018.prueba;

import pe.continental.impuestoalarenta2018.service.ImpuestoALaRentaService;

public class Prueba01 {
    public static void main(String[] args) {
        // Datos
        double sueldomensual = 5400.00;
        double dato = 0;
        //proceso
        double sueldoanual = ImpuestoALaRentaService.CalcularSueldoAnual(sueldomensual, dato);
        // reporte
        System.out.println("Sueldo Mensual :" + sueldomensual);
        System.out.println("Sueldo Anual :" + sueldoanual);
        
    }
    
}
