
package pe.continental.impuestorentaprofesionalapp.prueba;

import pe.continental.impuestorentaprofesionalapp.service.ImpuestoRentaProfesionalApp4taY5taCategoriaService;




public class Prueba03 {
    
     public static void main(String[] args) {
       
        // DATOS
        double RentaBruta4taCategoria = 61330.00;
        double porcen = 0.20;//20%
        double RentaBruta5taCategoria = 52000.00;
        double Deduccion7UIT = 29050.00; // 7 UIT = 7 * 4150 = 29050.00
     
        // PROCESO
        double Deduccion = ImpuestoRentaProfesionalApp4taY5taCategoriaService.calcularDeduccion(RentaBruta4taCategoria, porcen);
        double RentaNeta4taCategoria = ImpuestoRentaProfesionalApp4taY5taCategoriaService.calcularRentaNeta4taCategoria(RentaBruta4taCategoria, Deduccion);
        double TotalRenta4taY5taCategoria = ImpuestoRentaProfesionalApp4taY5taCategoriaService.calcularTotalRenta4taY5taCategoria(RentaNeta4taCategoria, RentaBruta5taCategoria);
        double RentaImponible4taY5taCategoria = ImpuestoRentaProfesionalApp4taY5taCategoriaService.calcularRentaImponible4taY5taCategoria(TotalRenta4taY5taCategoria, Deduccion7UIT);
        double ImpuestoRenta4taY5taCategoria = ImpuestoRentaProfesionalApp4taY5taCategoriaService.calcularImpuestoRenta4taY5taCategoria(RentaNeta4taCategoria);
        
        // REPORTE
        System.out.println( " Renta Bruta 4ta Categoria: " + RentaBruta4taCategoria );
        System.out.println( " Deduccion: " + Deduccion );
        System.out.println( " Renta Neta de 4ta Categoria : " + RentaNeta4taCategoria );
        System.out.println( " Renta Bruta 5ta Categoria: " + RentaBruta5taCategoria );       
        System.out.println( " Total Renta de 4ta Y 5ta Categoria : " + TotalRenta4taY5taCategoria );
        System.out.println( " Deduccion de 7 UIT: " + Deduccion7UIT );
        System.out.println( " Renta Imponible 4ta Y 5ta Categoria : " + RentaImponible4taY5taCategoria );
        System.out.println( " Impuesto Renta 4ta Y 5ta Categoria : " + ImpuestoRenta4taY5taCategoria );
       
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
