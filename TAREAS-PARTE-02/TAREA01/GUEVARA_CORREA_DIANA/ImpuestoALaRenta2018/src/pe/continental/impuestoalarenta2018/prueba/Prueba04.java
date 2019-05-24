
package pe.continental.impuestoalarenta2018.prueba;

import pe.continental.impuestoalarenta2018.service.ImpuestoALaRentaService;
public class Prueba04 {
    public static void main(String[] args) {
    // Datos
        double sueldomensual = 5400.00;
        double horasextras = 10 ;
        double dato = 93;
        //proceso
        double pagoxhorasextras = ImpuestoALaRentaService.CalcularHorasExtras(horasextras, sueldomensual, dato);
        // reporte
        System.out.println("Sueldo Mensual :" + sueldomensual);
        System.out.println("Horas Extras :" + horasextras);
        System.out.println("Pago por Horas Extras :" + pagoxhorasextras);
        
    
    }
}
