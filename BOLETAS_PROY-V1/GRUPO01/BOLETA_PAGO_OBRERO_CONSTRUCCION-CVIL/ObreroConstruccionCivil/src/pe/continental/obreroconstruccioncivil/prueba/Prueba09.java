

package pe.continental.obreroconstruccioncivil.prueba;

import pe.continental.obreroconstruccioncivil.service.ObreroConstruccionCivilService;

/**
 *
 * @author: Angie Cauti Guzman
 * @author: Sebastian Rodriguez Valdez
 */
public class Prueba09 {
    public static void main(String[] args) {
        // Datos:
        String categoria = ObreroConstruccionCivilService.OFICIAL;
        int diasLaborados = 5;
        int dias60extra = 1;
        // Proceso:
        double pago60extra = ObreroConstruccionCivilService.Pago60Extra(categoria, diasLaborados, dias60extra);
        // Reporte:
        System.out.println("Categoria: " + categoria);
        System.out.println("Dias Laborados: " + diasLaborados);
        System.out.println("Dias del 60%:" + dias60extra);
        System.out.println("Pago Extra del 60%: " + pago60extra);
    }
}
