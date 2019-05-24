/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.impuestorenta.prueba;

import pe.continental.impuestorenta.service.ImpuestoRentaService;

/**
 *
 * @author Angie
 */
public class Prueba01 {
    public static void main(String[] args) {
        //variable
        double mensual = 1300;
        // proceso
        double ImporteAnual = ImpuestoRentaService.calcularImporteAnual(mensual);
        // reporte
        System.out.println("Importe Mensual: " + mensual);
        System.out.println("Importe Anual : " + ImporteAnual);
        
    }
}
