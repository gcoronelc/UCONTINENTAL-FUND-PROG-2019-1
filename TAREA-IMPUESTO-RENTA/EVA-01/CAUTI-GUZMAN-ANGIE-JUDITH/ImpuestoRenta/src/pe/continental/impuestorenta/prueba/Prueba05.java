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
public class Prueba05 {
    public static void main(String[] args) {
        //variable
        double mensual = 2000;
        double bonificacion = 500;
        double gratificacion = 4000;
        int cantHijos = 1;
        double vacaciones = 2000;
        //proceso
        double Impuesto5Cate = ImpuestoRentaService.calcularImpuesto5Categ(mensual, cantHijos, gratificacion, bonificacion, vacaciones);
        //reporte
        System.out.println("Importe mensual: " + mensual);
        System.out.println("Bonificacion: " + bonificacion);
        System.out.println("Gratificacion: " + gratificacion);
        System.out.println("Cantidad de hijos: " + cantHijos);
        System.out.println("Importe por vacaciones: " + vacaciones);
        System.out.println("Impuesto de la 5ta Categoria: " + Impuesto5Cate);
                
                 
    }
}
