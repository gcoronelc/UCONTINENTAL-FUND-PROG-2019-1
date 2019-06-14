
package pe.continental.supermoda.prueba;

import pe.continental.supermoda.service.SuperModaService;


public class Prueba05 {
    public static void main(String[] args) {
         // Datos
        double precioventa = 208.32;
        
        //proceso
        double preciopublico = SuperModaService.calcularPrecioPublico(precioventa);
        // reporte
        System.out.println("precio al publico :" + preciopublico);
    }
    
}
