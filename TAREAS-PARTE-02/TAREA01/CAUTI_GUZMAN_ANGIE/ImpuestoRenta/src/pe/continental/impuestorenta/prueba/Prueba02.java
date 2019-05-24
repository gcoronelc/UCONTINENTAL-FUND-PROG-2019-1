/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.impuestorenta.prueba;

import pe.continental.impuestorenta.service.ImpuestoRentaService;

/**
 *
 * @author docente
 */
public class Prueba02 {
    public static void main(String[] args) {
        //variable
        int cantHijos = 6;
        //PROCESO
        double asignacion = ImpuestoRentaService.calcularAsignacion(cantHijos);
        // reporte
        System.out.println("Cantidad de hijos: " + cantHijos);
        System.out.println("Asignacion: " + asignacion);
        
        
       
    }
}
