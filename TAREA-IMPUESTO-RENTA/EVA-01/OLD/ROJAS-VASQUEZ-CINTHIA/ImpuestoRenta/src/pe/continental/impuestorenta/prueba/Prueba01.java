
package pe.continental.impuestorenta.prueba;

import pe.continental.impuestorenta.service.ImpuestoRentaService;

public class Prueba01 {
    
    public static void main(String[] args) {
        //Datos
        double sueldo = 10000;
        //Proceso
        double SueldoAnual = ImpuestoRentaService.calcularSueldoAnual(sueldo);
        //Reporte
        System.out.println("Sueldo :" + sueldo);
       
        System.out.println("Remuneracion Bruta Anual :" + SueldoAnual);
    }
}


