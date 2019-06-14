package pe.continental.precioventaproducto.service;

import pe.continental.precioventaproducto.dto.PrecioVentaProductoDTO;

public class PrecioVentaProductoSERVICE {

    public PrecioVentaProductoDTO determinar(PrecioVentaProductoDTO dto) {
        // proceso
        double UnidadesAComercializar = determinarUnidadesAComercializar(dto.getTamañoDelLote());
        double CostoTotalDelLote = determinarCostoTotalDelLote(dto.getPrecioDelLote(), dto.getGastosAdministrativos());
        double CostoPorUnidad = determinarCostoPorUnidad(dto.getPrecioDelLote(), dto.getGastosAdministrativos(), dto.getTamañoDelLote());
        double PrecioDeVenta = determinarPrecioDeVenta(dto.getPrecioDelLote(), dto.getGastosAdministrativos(), dto.getTamañoDelLote(), dto.getGananciaUnitaria());
        double PrecioAlPublico = determinarPrecioAlPublico(dto.getPrecioDelLote(), dto.getGastosAdministrativos(), dto.getTamañoDelLote(), dto.getGananciaUnitaria());

        // reportes
        dto.setUnidadesAComercializar(UnidadesAComercializar);
        dto.setCostoTotalLote(CostoTotalDelLote);
        dto.setCostoPorUnidad(CostoPorUnidad);
        dto.setPrecioDeVenta(PrecioDeVenta);
        dto.setPrecioAlPublico(PrecioAlPublico);
        return dto;

    }

    public static double truncar2Deci(double dato) {
        // proceso
        dato = dato * 100;
        dato = Math.round(dato) * 1.0;
        dato = dato / 100.0;
        // reporte
        return dato;
    }

    public static double determinarUnidadesAComercializar(double TamañoDelLote) {
        // proceso
        double UnidadesAComercializar = 0.90 * TamañoDelLote;  //90% del tamaño del lote
        // reporte
        return truncar2Deci(UnidadesAComercializar);

    }

    public static double determinarCostoTotalDelLote(double PrecioDelLote, double GastosAdministrativos) {
        // proceso
        double CostoTotalLote = PrecioDelLote * (1 + GastosAdministrativos);    // PrecioDelLote + PrecioDelLote*GastosAdministrativos
        // reporte
        return truncar2Deci(CostoTotalLote);
    }

    public static double determinarCostoPorUnidad(double precioDelLote, double gastosAdministrativos, double tamañoDelLote) {
        // proceso
        double CostoPorUnidad = determinarCostoTotalDelLote(precioDelLote, gastosAdministrativos) / determinarUnidadesAComercializar(tamañoDelLote);
        // reporte
        return truncar2Deci(CostoPorUnidad);
    }

    public static double determinarPrecioDeVenta(double precioDelLote, double gastosAdministrativos, double tamañoDelLote, double gananciaUnitaria) {
        // proceso
        double PrecioDeVenta = determinarCostoPorUnidad(precioDelLote, gastosAdministrativos, tamañoDelLote) + (determinarCostoPorUnidad(precioDelLote, gastosAdministrativos, tamañoDelLote) * gananciaUnitaria);

        // reporte
        return truncar2Deci(PrecioDeVenta);
    }

   public static double determinarPrecioAlPublico(double precioDelLote, double gastosAdministrativos, double tamañoDelLote, double gananciaUnitaria) {
        //proceso
        double PrecioAlPublico = determinarPrecioDeVenta(precioDelLote, gastosAdministrativos, tamañoDelLote, gananciaUnitaria) + (determinarPrecioDeVenta(precioDelLote, gastosAdministrativos, tamañoDelLote, gananciaUnitaria) * 0.18);    // precio de venta + igv
        // reporte 
        return truncar2Deci(PrecioAlPublico);
    }

}
