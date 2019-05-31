package pe.continental.impuestorentaprofesionalapp.service;

public class ImpuestoRentaProfesionalApp5taCategoriaService {
   
    public static final double Deduccion7UIT = 29050.00; // 7 UIT = 7 * 4150 = 29050.00
    
    
    public static double calcularRentaImponible5taCategoria(double RentaBruta5taCategoria, double Deduccion7UIT) {
        
        // VARIABLE
        double RentaImponible5taCategoria = 0.0;
        
        // PROCESO
        RentaImponible5taCategoria = RentaBruta5taCategoria - Deduccion7UIT;
        
        // REPORTE
        return truncar2Dec(RentaImponible5taCategoria);
        
    }
    
    
    
    public static double calcularImpuestoRenta5taCategoria(double RentaImponible5taCategoria) {
        
        // VARIABLE
        double ImpuestoRenta5taCategoria = 0.0;
        
        // PROCESO
        int control = 0;
    while (RentaImponible5taCategoria > 0) {
      control++;
      switch (control) {
        case 1: // Rango 5 UIT
          if (RentaImponible5taCategoria > 20750) {
            ImpuestoRenta5taCategoria += 20750 * 0.08;
            RentaImponible5taCategoria -= 20750;
          } else {
            ImpuestoRenta5taCategoria += RentaImponible5taCategoria * 0.08;
            RentaImponible5taCategoria = 0;
          }
          break;
        case 2: // Rango 15 UIT
          if (RentaImponible5taCategoria > 83000) {
            ImpuestoRenta5taCategoria += 83000 * 0.14;
            RentaImponible5taCategoria -= 83000;
          } else {
            ImpuestoRenta5taCategoria += RentaImponible5taCategoria * 0.14;
            RentaImponible5taCategoria = 0;
          }
          break;
        case 3: // Rango 15 UIT
          if (RentaImponible5taCategoria > 145250) {
            ImpuestoRenta5taCategoria += 145250 * 0.17;
            RentaImponible5taCategoria -= 145250;
          } else {
            ImpuestoRenta5taCategoria += RentaImponible5taCategoria * 0.17;
            RentaImponible5taCategoria = 0;
          }
          break;
        case 4: // Rango 10 UIT
          if (RentaImponible5taCategoria > 186750) {
            ImpuestoRenta5taCategoria += 186750 * 0.20;
            RentaImponible5taCategoria -= 186750;
          } else {
            ImpuestoRenta5taCategoria += RentaImponible5taCategoria * 0.20;
            RentaImponible5taCategoria = 0;
          }
          break;
        case 5: // Resto
          ImpuestoRenta5taCategoria += RentaImponible5taCategoria * 0.30;
          RentaImponible5taCategoria = 0;
          break;
      }
    }
      
        // REPORTE
        return truncar2Dec(ImpuestoRenta5taCategoria);
      
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
