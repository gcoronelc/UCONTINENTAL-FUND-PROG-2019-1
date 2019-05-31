

package pe.continental.obreroconstruccioncivil.prueba;

import pe.continental.obreroconstruccioncivil.service.ObreroConstruccionCivilService;

/**
 *
 * @author: Angie Cauti Guzman
 * @author: Sebastian Rodriguez Valdez
 */
public class Prueba10 {
    public static void main(String[] args) {
        // Datos:
        String categoria = ObreroConstruccionCivilService.OFICIAL;
        int diasLaborados = 5;
        int dias100extra = 1;
        // Proceso:
        double pago100extra = ObreroConstruccionCivilService.Pago100Extra(categoria, diasLaborados, dias100extra);
        // Reporte:
        System.out.println("Categoria: " + categoria);
        System.out.println("Dias Laborados: " + diasLaborados);
        System.out.println("Dias del 100%:" + dias100extra);
        System.out.println("Pago Extra del 100%: " + pago100extra);
    }
}
