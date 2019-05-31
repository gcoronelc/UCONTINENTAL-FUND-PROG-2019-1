
package pe.continental.impuestorentaanual.prueba;

import pe.continental.impuestorentaanual.service.ImpuestoRentaAnualService;


public class prueba01 {
    public static void main(String[] args) {
        // variable
        double salario = 1800 ;
        // proceso
        double sueldoAnual = ImpuestoRentaAnualService.hallarSueldoAnual(salario);
        // reporte
        System.out.println("salario: " + salario);
        System.out.println("sueldo anual: " + sueldoAnual);
    }
 
}
