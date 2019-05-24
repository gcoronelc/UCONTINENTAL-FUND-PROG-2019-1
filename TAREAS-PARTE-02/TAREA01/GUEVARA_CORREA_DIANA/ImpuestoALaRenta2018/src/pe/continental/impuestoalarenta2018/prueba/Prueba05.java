
package pe.continental.impuestoalarenta2018.prueba;

import pe.continental.impuestoalarenta2018.service.ImpuestoALaRentaService;

public class Prueba05 {
    public static void main(String[] args) {
    // Datos
        double sueldomensual = 5400.00;
        double horasextras = 10 ;
        //proceso
        double rentabruta = ImpuestoALaRentaService.CalcularRentaBruta(sueldomensual, horasextras, horasextras, horasextras);
        // reporte
        System.out.println("Sueldo Mensual :" + sueldomensual);
        System.out.println("Horas Extras :" + horasextras);
        System.out.println("Renta Bruta :" + rentabruta);
    }
}
