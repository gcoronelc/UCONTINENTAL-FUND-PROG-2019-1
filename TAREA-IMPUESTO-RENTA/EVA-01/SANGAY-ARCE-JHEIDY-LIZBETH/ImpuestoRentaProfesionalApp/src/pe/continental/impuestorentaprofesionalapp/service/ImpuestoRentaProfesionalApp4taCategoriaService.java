
package pe.continental.impuestorentaprofesionalapp.service;


public class ImpuestoRentaProfesionalApp4taCategoriaService {
    
   
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
    
    
    
     public static double calcularRentaImponible4taCategoria(double RentaNeta4taCategoria, double Deduccion7UIT){
       
        // VARIABLES
        double RentaImponible4taCategoria = 0.0;
        
        // PROCESO
        RentaImponible4taCategoria = RentaNeta4taCategoria - Deduccion7UIT;
        
        // REPORTE
        return truncar2Dec(RentaImponible4taCategoria);
     
    }
     
     
     
      public static double calcularImpuestoRenta4taCategoria(double RentaImponible4taCategoria) {   
    // Dato
    double ImpuestoRenta4taCategoria = 0.0;
    
    // Proceso
    int control = 0;
    while (RentaImponible4taCategoria > 0) {
      control++;
      switch (control) {
        case 1: // Rango 5 UIT
          if (RentaImponible4taCategoria > 20750) {
            ImpuestoRenta4taCategoria += 20750 * 0.08;
            RentaImponible4taCategoria -= 20750;
          } else {
            ImpuestoRenta4taCategoria += RentaImponible4taCategoria * 0.08;
            RentaImponible4taCategoria = 0;
          }
          break;
        case 2: // Rango 15 UIT
          if (RentaImponible4taCategoria > 83000) {
            ImpuestoRenta4taCategoria += 83000 * 0.14;
            RentaImponible4taCategoria -= 83000;
          } else {
            ImpuestoRenta4taCategoria += RentaImponible4taCategoria * 0.14;
            RentaImponible4taCategoria = 0;
          }
          break;
        case 3: // Rango 15 UIT
          if (RentaImponible4taCategoria > 145250) {
            ImpuestoRenta4taCategoria += 145250 * 0.17;
            RentaImponible4taCategoria -= 145250;
          } else {
            ImpuestoRenta4taCategoria += RentaImponible4taCategoria * 0.17;
            RentaImponible4taCategoria = 0;
          }
          break;
        case 4: // Rango 10 UIT
          if (RentaImponible4taCategoria > 186750) {
            ImpuestoRenta4taCategoria += 186750 * 0.20;
            RentaImponible4taCategoria -= 186750;
          } else {
            ImpuestoRenta4taCategoria += RentaImponible4taCategoria * 0.20;
            RentaImponible4taCategoria = 0;
          }
          break;
        case 5: // Resto
          ImpuestoRenta4taCategoria += RentaImponible4taCategoria * 0.30;
          RentaImponible4taCategoria = 0;
          break;
      }
    }
    
    // Reporte
    return truncar2Dec(ImpuestoRenta4taCategoria);

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







