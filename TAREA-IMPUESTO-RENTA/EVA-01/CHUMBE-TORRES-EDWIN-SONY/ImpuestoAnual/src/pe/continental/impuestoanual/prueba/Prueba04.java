/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.impuestoanual.prueba;

import pe.continental.impuestoanual.service.ImpuestoAnualService;

/**
 *
 * @author EDWIN
 */
public class Prueba04 {
    public static void main (String[] args){
        //VARIABLES:
          double sueldo = 2000;
          double bono = 1000;
          double gratificacion = 4000;
          double vacaciones = 2000;
        //PROCESO:
          double impuestoProyectado = ImpuestoAnualService.calcularImpuestoProyectado(bono, bono, gratificacion, vacaciones);
        //REPORTE:
         System.out.println("impuestoProyectado:" + impuestoProyectado);
         System.out.println("Sueldo:" + sueldo);
         System.out.println("Bono:" + bono);
         System.out.println("Gratificacion:" + gratificacion);
         System.out.println("Vacaciones:" + vacaciones);
    
    }
}
