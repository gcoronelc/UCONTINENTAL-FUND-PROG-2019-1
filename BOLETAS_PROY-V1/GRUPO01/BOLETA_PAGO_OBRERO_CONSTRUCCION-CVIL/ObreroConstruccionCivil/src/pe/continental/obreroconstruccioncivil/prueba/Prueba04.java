

package pe.continental.obreroconstruccioncivil.prueba;

import pe.continental.obreroconstruccioncivil.service.ObreroConstruccionCivilService;

/**
 *
 * @author: Angie Cauti Guzman
 * @author: Sebastian Rodriguez Valdez
 */
public class Prueba04 {
    public static void main(String[] args) {
        // Datos:
        int diasLaborados = 5;
        // Proceso:
        double movilidad = ObreroConstruccionCivilService.determinarMovilidad(diasLaborados);
        // Reporte:
        System.out.println("Dias Laborados: " + diasLaborados);
        System.out.println("Movilidad: " + movilidad);
    }
}
