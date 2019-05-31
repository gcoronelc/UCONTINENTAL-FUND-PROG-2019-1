

package pe.continental.obreroconstruccioncivil.prueba;

import pe.continental.obreroconstruccioncivil.service.ObreroConstruccionCivilService;

/**
 *
 * @author: Angie Cauti Guzman
 * @author: Sebastian Rodriguez Valdez
 */
public class Prueba11 {
    public static void main(String[] args) {
        // Datos:
        String categoria = ObreroConstruccionCivilService.OFICIAL;
        int diasLaborados = 5;
        // Proceso:
        double ONP = ObreroConstruccionCivilService.determinarONP(categoria, diasLaborados);
        // Reporte:
        System.out.println("Categoria: " + categoria);
        System.out.println("Dias Laborados: " + diasLaborados);
        System.out.println("Descuento ONP: " + ONP);
    }
}
