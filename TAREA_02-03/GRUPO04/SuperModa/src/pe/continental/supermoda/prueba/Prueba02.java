
package pe.continental.supermoda.prueba;

import pe.continental.supermoda.service.SuperModaService;


public class Prueba02 {
    public static void main(String[] args) {
         // Datos
        double lote = 1000.00;
        double precioLote = 50000;
        double gastosAdministrativos = 25;
        
        //proceso
        double costototallote = SuperModaService.calcularCostoTotalLote(precioLote, gastosAdministrativos);
        // reporte
        System.out.println("costo total lote :" + costototallote);
    }
    
}
