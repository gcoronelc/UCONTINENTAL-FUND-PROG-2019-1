
package pe.continental.impuestorentaprofesionalapp.prueba;

import pe.continental.impuestorentaprofesionalapp.service.ImpuestoRentaProfesionalApp4taCategoriaService;


public class Prueba01 {
    
    public static void main(String[] args) {
        
        // DATOS
        double RentaBruta4taCategoria = 61330.00;
        double Deduccion7UIT = 29050.00; // 7 UIT = 7 * 4150 = 29050.00
        double porcen = 0.20;//20%
     
        
        // PROCESO
        
        double Deduccion = ImpuestoRentaProfesionalApp4taCategoriaService.calcularDeduccion(RentaBruta4taCategoria, porcen);
        double RentaNeta4taCategoria = ImpuestoRentaProfesionalApp4taCategoriaService.calcularRentaNeta4taCategoria(RentaBruta4taCategoria, Deduccion);
        double RentaImponible4taCategoria = ImpuestoRentaProfesionalApp4taCategoriaService.calcularRentaImponible4taCategoria(RentaNeta4taCategoria, Deduccion7UIT);
        double ImpuestoRenta4taCategoria = ImpuestoRentaProfesionalApp4taCategoriaService.calcularImpuestoRenta4taCategoria(RentaImponible4taCategoria);
        
        // REPORTE
        System.out.println( " Renta Bruta 4ta Categoria: " + RentaBruta4taCategoria );
        System.out.println( " Deduccion: " + Deduccion );
        System.out.println( " Renta Neta de 4ta Categoria: " + RentaNeta4taCategoria );
        System.out.println(" Deduccion de 7 Uit: " + Deduccion7UIT );
        System.out.println( " Renta Imponible de 4ta Categoria: " + RentaImponible4taCategoria );
        System.out.println( " Impuesto Renta de 4ta Categoria: " + ImpuestoRenta4taCategoria );
        
    }
      
    
}
