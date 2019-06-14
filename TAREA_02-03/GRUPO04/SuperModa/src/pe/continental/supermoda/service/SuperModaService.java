
package pe.continental.supermoda.service;

import pe.continental.supermoda.dto.SuperModaDto;

public class SuperModaService {
  
     public SuperModaDto procesar ( SuperModaDto dto){
    // Proceso
    
    double unidadescomercializar = calcularUnidadesComercializar(dto.getLote());
    double costototallote = calcularCostoTotalLote(dto.getPrecioLote(), dto.getGastosAdministrativos());
    double costounidad = calcularCostoUnidad(dto.getCostoTotalLote(), dto.getUnidadesComercializar());
    double precioventa = calcularPrecioVenta(dto.getCostoUnidad(), dto.getGananciaUnidad());
    double preciopublico = calcularPrecioPublico(dto.getPrecioVenta());
    
    // Reporte
    dto.setUnidadesComercializar(unidadescomercializar);
    dto.setCostoTotalLote(costototallote);
    dto.setCostoUnidad(costounidad);
    dto.setPrecioVenta(precioventa);
    dto.setPrecioPublico(preciopublico);
     
    return dto;
    
     }
     public static double calcularUnidadesComercializar(double lote){
         //Proceso
         double unidadescomercializar = lote - lote * 0.10;
         // Reporte
         return dosDec(unidadescomercializar);
         
     }

    public static double calcularCostoTotalLote(double precioLote, double gastosAdministrativos) {
         //Proceso
         double costototallote = precioLote + precioLote * gastosAdministrativos/100;
         // Reporte
         return dosDec(costototallote);
         
    }

    public static double calcularCostoUnidad(double costoTotalLote, double unidadesComercializar) {
         //Proceso
         double costounidad = costoTotalLote/unidadesComercializar;
         // Reporte
         return dosDec(costounidad);
         
    }

    public static double calcularPrecioVenta(double costoUnidad, double gananciaUnidad) {
         //Proceso
         double precioventa = costoUnidad + costoUnidad * gananciaUnidad / 100;
         // Reporte
         return dosDec(precioventa);
         
    }

    public static double calcularPrecioPublico(double precioVenta) {
        //Proceso
         double preciopublico = precioVenta + precioVenta * 0.18;
         // Reporte
         return dosDec(preciopublico);
         
    }
     
     public static double dosDec( double num){
    num *= 100;
    num = Math.round(num);
    num /= 100.0;
    return num;
  }
  
}
     
