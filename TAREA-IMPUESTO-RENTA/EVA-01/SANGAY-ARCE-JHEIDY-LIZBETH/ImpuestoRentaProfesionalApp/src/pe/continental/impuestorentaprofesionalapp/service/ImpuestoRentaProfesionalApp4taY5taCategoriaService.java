
package pe.continental.impuestorentaprofesionalapp.service;


public class ImpuestoRentaProfesionalApp4taY5taCategoriaService {
    
    public static final double Deduccion7UIT = 29050.00; // 7 UIT = 7 * 4150 = 29050.00
    
    
     public static double calcularDeduccion(double RentaBruta4taCategoria, double porcen){
       
        // VARIABLES
        double Deduccion = 0.0;
        
        // PROCESO
        Deduccion = RentaBruta4taCategoria * porcen; // 20%
        
        // REPORTE
        return truncar2Dec(Deduccion);
     
    }
    
    public static double calcularRentaNeta4taCategoria(double RentaBruta4taCategoria, double Deduccion){
       
        // VARIABLES
        double RentaNeta4taCategoria = 0.0;
        
        // PROCESO
        RentaNeta4taCategoria = RentaBruta4taCategoria - Deduccion;
        
        // REPORTE
        return truncar2Dec(RentaNeta4taCategoria);
     
    }
    
    
    
    
    public static double calcularTotalRenta4taY5taCategoria(double RentaNeta4taCategoria, double RentaBruta4taCategoria){
       
        // VARIABLES
        double TotalRenta4taY5taCategoria = 0.0;
        
        // PROCESO
        TotalRenta4taY5taCategoria = RentaNeta4taCategoria + RentaBruta4taCategoria;
        
        // REPORTE
        return truncar2Dec(TotalRenta4taY5taCategoria);
     
    }
    
    
    public static double calcularRentaImponible4taY5taCategoria(double TotalRenta4taY5taCategoria, double Deduccion7UIT){
       
        // VARIABLES
        double RentaImponible4taY5taCategoria = 0.0;
        
        // PROCESO
        RentaImponible4taY5taCategoria = TotalRenta4taY5taCategoria - Deduccion7UIT;
        
        // REPORTE
        return truncar2Dec(RentaImponible4taY5taCategoria);
     
    }
    
    
    public static double calcularImpuestoRenta4taY5taCategoria(double RentaImponible4taY5taCategoria){
       
        // VARIABLES
        double ImpuestoRenta4taY5taCategoria = 0.0;
        
        // PROCESO
       
        int control = 0;
    while (RentaImponible4taY5taCategoria > 0) {
      control++;
      switch (control) {
        case 1: // Rango 5 UIT
          if (RentaImponible4taY5taCategoria > 20750) {
            ImpuestoRenta4taY5taCategoria += 20750 * 0.08;
            RentaImponible4taY5taCategoria -= 20750;
          } else {
            ImpuestoRenta4taY5taCategoria += RentaImponible4taY5taCategoria * 0.08;
            RentaImponible4taY5taCategoria = 0;
          }
          break;
        case 2: // Rango 15 UIT
          if (RentaImponible4taY5taCategoria > 83000) {
            ImpuestoRenta4taY5taCategoria += 83000 * 0.14;
            RentaImponible4taY5taCategoria -= 83000;
          } else {
            ImpuestoRenta4taY5taCategoria += RentaImponible4taY5taCategoria * 0.14;
            RentaImponible4taY5taCategoria = 0;
          }
          break;
        case 3: // Rango 15 UIT
          if (RentaImponible4taY5taCategoria > 145250) {
            ImpuestoRenta4taY5taCategoria += 145250 * 0.17;
            RentaImponible4taY5taCategoria -= 145250;
          } else {
            ImpuestoRenta4taY5taCategoria += RentaImponible4taY5taCategoria * 0.17;
            RentaImponible4taY5taCategoria = 0;
          }
          break;
        case 4: // Rango 10 UIT
          if (RentaImponible4taY5taCategoria > 186750) {
            ImpuestoRenta4taY5taCategoria += 186750 * 0.20;
            RentaImponible4taY5taCategoria -= 186750;
          } else {
            ImpuestoRenta4taY5taCategoria += RentaImponible4taY5taCategoria * 0.20;
            RentaImponible4taY5taCategoria = 0;
          }
          break;
        case 5: // Resto
          ImpuestoRenta4taY5taCategoria += RentaImponible4taY5taCategoria * 0.30;
          RentaImponible4taY5taCategoria = 0;
          break;
      }
    }
        
        // REPORTE
        return truncar2Dec(ImpuestoRenta4taY5taCategoria);
     
    }
    
    private static double truncar2Dec(double dato) {
       // Proceso
       dato = dato * 100;
       dato = Math.round(dato) * 1.0;
       dato = dato / 100.0;
       
       // Reporte
      return dato;
     
    }
    
}
