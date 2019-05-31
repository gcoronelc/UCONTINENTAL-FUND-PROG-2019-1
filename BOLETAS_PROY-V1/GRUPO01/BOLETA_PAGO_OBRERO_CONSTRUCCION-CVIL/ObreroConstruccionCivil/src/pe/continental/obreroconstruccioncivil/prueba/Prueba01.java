

package pe.continental.obreroconstruccioncivil.prueba;

import pe.continental.obreroconstruccioncivil.service.ObreroConstruccionCivilService;

/**
 *
 * @author: Angie Cauti Guzman
 * @author: Sebastian Rodriguez Valdez
 */
public class Prueba01 {
    public static void main(String[] args) {
        // Datos:
        String categoria = ObreroConstruccionCivilService.OPERARIO;
        int diasLaborados = 4;
        // Proceso:
        double salarioJornal = ObreroConstruccionCivilService.determinarSalarioBasico(categoria, diasLaborados);
        // Reporte:
        System.out.println("Categoria: " + categoria);
        System.out.println("Dias Laborados: " + diasLaborados);
        System.out.println("Salario Jornal: " + salarioJornal);
    }       
}
