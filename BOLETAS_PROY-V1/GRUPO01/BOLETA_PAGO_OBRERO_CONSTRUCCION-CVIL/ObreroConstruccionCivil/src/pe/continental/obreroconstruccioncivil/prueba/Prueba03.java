

package pe.continental.obreroconstruccioncivil.prueba;

import pe.continental.obreroconstruccioncivil.service.ObreroConstruccionCivilService;

/**
 *
 * @author: Angie Cauti Guzman
 * @author: Sebastian Rodriguez Valdez
 */
public class Prueba03 {
    public static void main(String[] args) {
        // Datos:
        String categoria = ObreroConstruccionCivilService.OFICIAL;
        int diasLaborados = 5;
        // Proceso:
        double BUC = ObreroConstruccionCivilService.determinarBUC(categoria, diasLaborados);
        // Reporte:
        System.out.println("Categoria: " + categoria);
        System.out.println("Dias Laborados: " + diasLaborados);
        System.out.println("BUC: " + BUC);
    }
}