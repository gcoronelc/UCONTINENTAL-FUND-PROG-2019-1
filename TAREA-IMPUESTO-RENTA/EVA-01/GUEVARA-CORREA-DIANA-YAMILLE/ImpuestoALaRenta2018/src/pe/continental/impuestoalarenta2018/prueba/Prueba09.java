
package pe.continental.impuestoalarenta2018.prueba;

import pe.continental.impuestoalarenta2018.service.ImpuestoALaRentaService;

public class Prueba09 {
        public static void main(String[] args) {
           // Datos
        double dato = 93;
        
           //proceso
        double asignacion = ImpuestoALaRentaService.CalcularAsignacion(dato);
        
          // reporte
        
        
        System.out.println("Asignacion :" + asignacion);
    }
}
