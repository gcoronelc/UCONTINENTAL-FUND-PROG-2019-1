/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.hablabien.prueba;

import pe.continental.hablabien.service.HablaBienService;

/**
 *
 * @author soporte
 */
public class Prueba05 {
    public static void main(String[] args) {
        // datos
        int consumo= 481 ;
        // proceso
        double importe = HablaBienService.calcularImporte(consumo);
        double donacion = HablaBienService.calcularDonacion(consumo);
        // reporte 
        System.out.println("consumo: " + consumo);
        System.out.println("importe: " + importe);
        System.out.println("donacion:" + donacion);
        
    }
}
