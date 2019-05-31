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
public class Prueba07 {
    public static void main(String[] args) {
        //variable
        double mensual = 2500;
        double bonificacion = 900;
        double gratificacion = 5000;
        int cantHijos = 6;
        double vacaciones = 2500;
        //proceso
        double ImpuestoAnual = ImpuestoRentaService.calcularImpuestoAnual(mensual, cantHijos, gratificacion, bonificacion, vacaciones);
        //reporte
        System.out.println("Importe mensual: " + mensual);
        System.out.println("Bonificacion: " + bonificacion);
        System.out.println("Gratificacion: " + gratificacion);
        System.out.println("Cantidad de hijos: " + cantHijos);
        System.out.println("Importe por vacaciones: " + vacaciones);
        System.out.println("Impuesto de Renta Anual : " + ImpuestoAnual);
                
                 
    }
}
