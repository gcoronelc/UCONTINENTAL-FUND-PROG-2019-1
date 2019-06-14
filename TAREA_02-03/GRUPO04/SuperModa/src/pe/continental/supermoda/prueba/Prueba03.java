
package pe.continental.supermoda.prueba;

import pe.continental.supermoda.service.SuperModaService;


public class Prueba03 {
    public static void main(String[] args) {
         // Datos
        double costoTotalLote = 62500.00;
        double unidadescomercializadas = 900;
        
        
        //proceso
        double costounidad = SuperModaService.calcularCostoUnidad(costoTotalLote, unidadescomercializadas);
        // reporte
        System.out.println("costo unidad :" + costounidad);
    }
    
}
