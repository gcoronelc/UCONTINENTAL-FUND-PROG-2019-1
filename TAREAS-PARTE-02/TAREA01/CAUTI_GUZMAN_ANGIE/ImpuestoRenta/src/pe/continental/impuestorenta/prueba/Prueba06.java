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
public class Prueba06 {
    public static void main(String[] args) {
        //variable
        double mensual = 1990;
        //proceso
        double Impuesto4cat = ImpuestoRentaService.calcularImpuesto4Categ(mensual);
        //reporte
        System.out.println("Importe mensual: " + mensual);
        System.out.println("Impuesto de cuarta categoria: " + Impuesto4cat);
                
                 
    }
}
