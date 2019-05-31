
package pe.continental.impuestorenta.prueba;

import pe.continental.impuestorenta.service.ImpuestoRentaService;
public class Prueba02 {
    
    public static void main(String[] args) {
        //variable
        int hijos = 2;
        //PROCESO
        double asignacionFamiliar = ImpuestoRentaService.calcularAsignacionFamiliar(hijos);
        // reporte
        System.out.println("Hijos: " + hijos);
        System.out.println("Asignacion familiar: " + asignacionFamiliar);
        
        
       
    }
}
  

