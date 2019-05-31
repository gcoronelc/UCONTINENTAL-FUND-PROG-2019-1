
package pe.continental.impuestorentaanual.prueba;


import pe.continental.impuestorentaanual.service.ImpuestoRentaAnualService;

public class Prueba06 {
    public static void main(String[] args) {
          //variable
        double salario = 2100;
        double bonos = 500;
        double gratificacion = 4200;
        int numeroHijos = 5;
        double vacaciones = 2100;
        //proceso
        double impuestoanualproyectado = ImpuestoRentaAnualService.hallarImpuestoAnualProyectado(salario, numeroHijos, gratificacion, bonos, vacaciones);
        //reporte
        System.out.println("salario:" + salario);
        System.out.println("Bonos:" + bonos);
           System.out.println("vacaciones:" + vacaciones);
        System.out.println("Gratificacion:" + gratificacion);
        System.out.println("Numero de hijos:" + numeroHijos);
        System.out.println("Impuesto anual proyectado :" + impuestoanualproyectado);
                
                 
    }
}


