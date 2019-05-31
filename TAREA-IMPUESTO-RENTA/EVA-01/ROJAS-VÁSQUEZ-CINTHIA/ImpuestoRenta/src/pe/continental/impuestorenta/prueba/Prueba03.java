
package pe.continental.impuestorenta.prueba;

import pe.continental.impuestorenta.service.ImpuestoRentaService;
public class Prueba03 {
     
        public static void main(String[] args) {
        //variable
        double sueldo = 5000;
        int hijos = 6;
        double horasextras= 30;
        double gratificaciones = 10000;
      
        
        //proceso
        double remuneracionBruta;
            remuneracionBruta = ImpuestoRentaService.calcularRemuneracionBruta(sueldo, hijos, gratificaciones, horasextras);
        //reporte
        System.out.println("sueldo :" + sueldo);
        System.out.println("Horas Extras:" + horasextras);
        System.out.println("Gratificaciones :" + gratificaciones);
        System.out.println("Hijos:" + hijos);
        System.out.println("remuneracionBruta:" + remuneracionBruta);
                
                 
    }
}

