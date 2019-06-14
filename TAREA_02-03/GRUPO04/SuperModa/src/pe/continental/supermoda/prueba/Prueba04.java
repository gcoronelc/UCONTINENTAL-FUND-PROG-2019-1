
package pe.continental.supermoda.prueba;

import pe.continental.supermoda.service.SuperModaService;


public class Prueba04 {
    public static void main(String[] args) {
         // Datos
        double costoUnidad = 69.44;
        double gananciaUnidad = 200;
        
        
        //proceso
        double precioventa = SuperModaService.calcularPrecioVenta(costoUnidad, gananciaUnidad);
        // reporte
        System.out.println("precio de venta :" + precioventa);
    }
    
}
