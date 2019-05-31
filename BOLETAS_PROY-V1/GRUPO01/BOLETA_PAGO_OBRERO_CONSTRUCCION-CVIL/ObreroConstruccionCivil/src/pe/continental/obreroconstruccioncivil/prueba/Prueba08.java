/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.obreroconstruccioncivil.prueba;

import pe.continental.obreroconstruccioncivil.service.ObreroConstruccionCivilService;

/**
 *
 * @author Angie
 */
public class Prueba08 {
    public static void main(String[] args) {
        // Datos:
        String categoria = ObreroConstruccionCivilService.PEON;
        String condicion = ObreroConstruccionCivilService.FIESTASPATRIAS;
        int diasLaborados = 5;
        // Proceso :
        double gratificacion = ObreroConstruccionCivilService.determinarGratificacion(categoria, condicion, diasLaborados);
        // Reporte:
        System.out.println("Categoria: " + categoria);
        System.out.println("Condicion: " + condicion);
        System.out.println("Dias Laborados: " + diasLaborados);
        System.out.println("Gratificacion:" + gratificacion);
        
    }
}
