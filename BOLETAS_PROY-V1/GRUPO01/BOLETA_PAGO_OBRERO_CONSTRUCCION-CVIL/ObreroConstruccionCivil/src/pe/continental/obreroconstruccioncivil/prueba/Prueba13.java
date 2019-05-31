

package pe.continental.obreroconstruccioncivil.prueba;

import pe.continental.obreroconstruccioncivil.service.ObreroConstruccionCivilService;

/**
 *
 * @author: Angie Cauti Guzman
 * @author: Sebastian Rodriguez Valdez
 */
public class Prueba13 {
    public static void main(String[] args) {
        // Datos:
        String categoria = ObreroConstruccionCivilService.OFICIAL;
        int diasLaborados = 5;
        int dias60extra = 1;
        int dias100extra = 1;
        int cantHijos =2;
        String condicion = ObreroConstruccionCivilService.FIESTASPATRIAS;
        // Proceso:
        double importe = ObreroConstruccionCivilService.ImporteTotal(categoria, diasLaborados, cantHijos, dias60extra, dias100extra, condicion);
        // Reporte:
        System.out.println("Categoria: " + categoria);
        System.out.println("Condicion: " + condicion);
        System.out.println("Cantidad de hijos: " + cantHijos); 
        System.out.println("Dias Laborados: " + diasLaborados);
        System.out.println("Dias del 60%:" + dias60extra);
        System.out.println("Dias del 100%:" + dias100extra);
        System.out.println("Importe Total: " + importe);
    }
}
