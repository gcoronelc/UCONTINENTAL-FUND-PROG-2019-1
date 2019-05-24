
package pe.continental.impuestoalarenta2018.prueba;

import pe.continental.impuestoalarenta2018.service.ImpuestoALaRentaService;

public class Prueba08 {
        public static void main(String[] args) {
           // Datos
        double impuesto = 5606.60;
        
           //proceso
        double IRM = ImpuestoALaRentaService.CalcularImpuestoALaRentaMensual(impuesto);
        
          // reporte
        
        
        System.out.println("Impuesto a la renta mensual :" + IRM);
    }
}
