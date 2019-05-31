
package pe.continental.impuestorentaanual.prueba;

import pe.continental.impuestorentaanual.service.ImpuestoRentaAnualService;



public class Prueba04 {
    public static void main(String[] args) {
        //variable
        double salario = 2100;
        int numeroHijos = 6;
        double bonos = 500;
        double gratificacion = 4200;
        double vacaciones = 2100;
        
        //proceso
        double remuneracionNetaAnual = ImpuestoRentaAnualService.determinarRemuneracionNetaAnual(salario, numeroHijos, gratificacion, bonos, vacaciones);
        //reporte
        System.out.println("salario:" + salario);
        System.out.println("Bonos:" + bonos);
        System.out.println("Gratificacion:" + gratificacion);
        System.out.println("numero de hijos:" + numeroHijos);
        System.out.println("vacaciones:" + vacaciones);
        System.out.println("remuneracionNetaAnual:" + remuneracionNetaAnual);
                
                 
    }
}
