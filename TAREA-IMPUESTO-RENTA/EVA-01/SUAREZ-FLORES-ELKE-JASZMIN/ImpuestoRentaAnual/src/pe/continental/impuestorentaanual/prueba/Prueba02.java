
package pe.continental.impuestorentaanual.prueba;

import pe.continental.impuestorentaanual.service.ImpuestoRentaAnualService;


public class Prueba02 {
    public static void main(String[] args) {
        //variable
        int numeroHijos = 4;
        //PROCESO
        double asignacionFamiliar = ImpuestoRentaAnualService.calcularAsignacionFamiliar(numeroHijos);
        // reporte
        System.out.println("numero de hijos: " + numeroHijos);
        System.out.println("asignacion familiar: " + asignacionFamiliar);
        
        
       
    }
}
