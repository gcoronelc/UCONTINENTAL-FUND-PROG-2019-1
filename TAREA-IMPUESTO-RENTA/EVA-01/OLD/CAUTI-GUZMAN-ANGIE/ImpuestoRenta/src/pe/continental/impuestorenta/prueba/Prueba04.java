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
public class Prueba04 {
    public static void main(String[] args) {
        //variable
        double mensual = 6000;
        double bonificacion = 840;
        double gratificacion = 12000;
        int cantHijos = 2;
        double vacaciones = 6000;
        //proceso
        double rentaTotal = ImpuestoRentaService.calcularRentaTotal(mensual, cantHijos, gratificacion, bonificacion, vacaciones);
        //reporte 
        System.out.println("Importe mensual: " + mensual);
        System.out.println("Bonificacion: " + bonificacion);
        System.out.println("Gratificacion: " + gratificacion);
        System.out.println("Cantidad de hijos: " + cantHijos);
        System.out.println("Importe por vacaciones: " + vacaciones);
        System.out.println("Renta total: " + rentaTotal);
        
                
                 
    }
}
