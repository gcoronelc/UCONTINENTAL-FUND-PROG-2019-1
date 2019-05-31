

package pe.continental.obreroconstruccioncivil.prueba;

import pe.continental.obreroconstruccioncivil.service.ObreroConstruccionCivilService;

/**
 *
 * @author: Angie Cauti Guzman
 * @author: Sebastian Rodriguez Valdez
 */
public class Prueba07 {
    public static void main(String[] args) {
        // Datos:
        String categoria = ObreroConstruccionCivilService.OFICIAL;
        int diasLaborados = 5;
        int cantHijos = 2;
        // Proceso:
        double asignacion = ObreroConstruccionCivilService.determinarAsignacion(categoria, cantHijos, diasLaborados);
        // Reporte:
        System.out.println("Categoria: " + categoria);
        System.out.println("Dias Laborados: " + diasLaborados);
        System.out.println("Cantidad de Hijos " + cantHijos);
        System.out.println("Asignacion: " + asignacion);
    }
}
