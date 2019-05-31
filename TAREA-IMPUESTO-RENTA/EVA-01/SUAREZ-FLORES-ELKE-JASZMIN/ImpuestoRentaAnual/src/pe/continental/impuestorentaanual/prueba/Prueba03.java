
package pe.continental.impuestorentaanual.prueba;

import pe.continental.impuestorentaanual.service.ImpuestoRentaAnualService;



public class Prueba03 {
    public static void main(String[] args) {
        //variable
        double salario = 2100;
        int numeroHijos = 5;
        double bonos = 500;
        double gratificacion = 4200;
        double vacaciones = 2100;
        
        //proceso
        double remuneracionBrutaAnual = ImpuestoRentaAnualService.determinarRemuneracionBrutaAnual(salario, numeroHijos, gratificacion, bonos, vacaciones);
        //reporte
        System.out.println("salario:" + salario);
        System.out.println("Bonos:" + bonos);
        System.out.println("Gratificacion:" + gratificacion);
        System.out.println("numero de hijos:" + numeroHijos);
        System.out.println("vacaciones:" + vacaciones);
        System.out.println("remuneracionBrutaAnual:" + remuneracionBrutaAnual);
                
                 
    }
}
