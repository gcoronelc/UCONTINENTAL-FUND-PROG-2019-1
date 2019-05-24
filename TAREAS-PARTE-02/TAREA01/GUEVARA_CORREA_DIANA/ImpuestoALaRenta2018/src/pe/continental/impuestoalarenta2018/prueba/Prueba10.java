
package pe.continental.impuestoalarenta2018.prueba;

import pe.continental.impuestoalarenta2018.service.ImpuestoALaRentaService;

public class Prueba10 {
        public static void main(String[] args) {
           // Datos
        double dato1 = 63500;
        double dato2 = 12450 ;
        
           //proceso
        double rentaneta4 = ImpuestoALaRentaService.CalcularRentaNeta4(dato1);
        
          // reporte
        
        
        System.out.println("RENTA NETA 4TA C :" + rentaneta4);
    }
}
