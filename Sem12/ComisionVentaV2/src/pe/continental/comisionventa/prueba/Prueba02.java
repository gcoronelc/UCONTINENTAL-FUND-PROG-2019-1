/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.comisionventa.prueba;

import pe.continental.comisionventa.service.Ofimatica;

/**
 *
 * @author soporte
 */
public class Prueba02 {
    public static void main(String[] args) {
         // DATOS
        int participante = 12;
        // PROCESO
        double total = Ofimatica.determinarTotal(participante);
        double importe = Ofimatica.determinarImporte(participante);
        double impuesto = Ofimatica.determinarImpuesto(participante);
        double comision = Ofimatica.determinarComision(participante);
        //REPORTE
        System.out.println("Numero de participantes :" + participante);
        System.out.println("Importe :" + importe);
        System.out.println("Total:" + total);
        System.out.println("Comision :" + comision);
        System.out.println("Impuesto :" + impuesto);
        
    }
}
