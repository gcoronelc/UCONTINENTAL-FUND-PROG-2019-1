
package pe.continental.impuestorentaprofesionalapp.prueba;

import pe.continental.impuestorentaprofesionalapp.service.ImpuestoRentaProfesionalApp5taCategoriaService;


public class Prueba02 {
    
    public static void main(String[] args) {
       
        // DATOS
        double RentaBruta5taCategoria = 52000.00;
        double Deduccion7UIT = 29050.00; // 7 UIT = 7 * 4150 = 29050.00
        
        // PROCESO
        
        double RentaImponible5taCategoria = ImpuestoRentaProfesionalApp5taCategoriaService.calcularRentaImponible5taCategoria(RentaBruta5taCategoria, Deduccion7UIT);
        double ImpuestoRenta5taCategoria = ImpuestoRentaProfesionalApp5taCategoriaService.calcularImpuestoRenta5taCategoria(RentaImponible5taCategoria);
        
        // REPORTE
        System.out.println( " Renta Bruta de 5ta Categoria: " + RentaBruta5taCategoria );
        System.out.println( " Deduccion de 7 UIT: " + Deduccion7UIT );
        System.out.println( " Renta Imponible de 5ta Categoria: " + RentaImponible5taCategoria );
        System.out.println( " Impuesto Renta 5ta Categoria: " + ImpuestoRenta5taCategoria );
        
    }
    
    
    
}
