
package pe.continental.impuestoalarenta2018.prueba;

import pe.continental.impuestoalarenta2018.service.ImpuestoALaRentaService;

public class Prueba11 {
        public static void main(String[] args) {
           // Datos
        double dato1 = 63500;
        double dato2 = 12450 ;
        double rentabruta = 70000;
        double sueldomensual = 0;
        double horasextras = 0;
        double otros = 0;
        double dato = 0;
           //proceso
        double ingresostotales = ImpuestoALaRentaService.CalcularIngresosTotales(dato1, dato2, sueldomensual, horasextras, otros, dato);
        
          // reporte
        
        
        System.out.println("Ingresos Totales :" + ingresostotales);
    }
}
