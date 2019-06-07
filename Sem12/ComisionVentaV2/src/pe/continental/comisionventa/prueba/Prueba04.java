/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.comisionventa.prueba;

import pe.continental.comisionventa.service.Otros;

/**
 *
 * @author soporte
 */
public class Prueba04 {
    public static void main(String[] args) {
         // DATOS
        int participante = 18;
        // PROCESO
        double total = Otros.determinarTotal(participante);
        double importe = Otros.determinarImporte(participante);
        double impuesto = Otros.determinarImpuesto(participante);
        double comision = Otros.determinarComision(participante);
        //REPORTE
        System.out.println("Numero de participantes :" + participante);
        System.out.println("Importe :" + importe);
        System.out.println("Total:" + total);
        System.out.println("Comision :" + comision);
        System.out.println("Impuesto :" + impuesto);
    }
}
