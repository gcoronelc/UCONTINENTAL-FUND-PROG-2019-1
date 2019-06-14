
package pe.continental.supermoda.prueba;

import pe.continental.supermoda.service.SuperModaService;


public class Prueba01 {
    public static void main(String[] args) {
         // Datos
        double lote = 1000.00;
        
        //proceso
        double unidadesComercializar = SuperModaService.calcularUnidadesComercializar(lote);
        // reporte
        System.out.println("unidades comercializadas :" + unidadesComercializar);
    }
    
}
