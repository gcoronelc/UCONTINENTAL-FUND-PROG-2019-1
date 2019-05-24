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
public class Prueba03 {
    public static void main(String[] args) {
        //variable
        double mensual = 4000;
        double bonificacion = 720;
        double gratificacion = 8000;
        int cantHijos = 0;
        double vacaciones = 0;
        //proceso
        double rentaBruta = ImpuestoRentaService.calcularRentaBruta(mensual, cantHijos, gratificacion, bonificacion, vacaciones);
        //reporte
        System.out.println("Importe mensual: " + mensual);
        System.out.println("Bonificacion: " + bonificacion);
        System.out.println("Gratificacion: " + gratificacion);
        System.out.println("Cantidad de hijos: " + cantHijos);
         System.out.println("Importe por vacaciones: " + vacaciones);
        System.out.println("Renta Bruta: " + rentaBruta);
        
                
                 
    }
}
