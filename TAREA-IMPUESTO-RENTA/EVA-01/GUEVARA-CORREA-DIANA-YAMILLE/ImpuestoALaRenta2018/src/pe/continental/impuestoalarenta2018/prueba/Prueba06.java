package pe.continental.impuestoalarenta2018.prueba;

import pe.continental.impuestoalarenta2018.service.ImpuestoALaRentaService;

public class Prueba06 {
        public static void main(String[] args) {
           // Datos
        double rentabruta = 77990;
        double dato1 = 63500;
        double dato2 = 12450;
           //proceso
        double RNIT = ImpuestoALaRentaService.CalcularRNIT(rentabruta, dato2, dato1);
          // reporte
        
        System.out.println("RNIT :" + RNIT);
        
    }
}


