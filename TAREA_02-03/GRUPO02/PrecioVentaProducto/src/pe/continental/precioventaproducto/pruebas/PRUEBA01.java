package pe.continental.precioventaproducto.pruebas;

import pe.continental.precioventaproducto.dto.PrecioVentaProductoDTO;
import pe.continental.precioventaproducto.service.PrecioVentaProductoSERVICE;

public class PRUEBA01 {

    public static void main(String[] args) {
        // datos
        PrecioVentaProductoDTO dto = new PrecioVentaProductoDTO();
        dto.setGananciaUnitaria(2.00);
        dto.setGastosAdministrativos(0.25);
        dto.setPrecioDelLote(1000000);
        dto.setTamañoDelLote(2000);
        // proceso
        PrecioVentaProductoSERVICE precioVentaProductoSERVICE = new PrecioVentaProductoSERVICE();
        dto = precioVentaProductoSERVICE.determinar(dto);
        // reporte
        System.out.println("DATOS:");
        System.out.println("ganancia por unidad:" + dto.getGananciaUnitaria());
        System.out.println("gastos administrativos:" + dto.getGastosAdministrativos());
        System.out.println("precio del lote:" + dto.getPrecioDelLote());
        System.out.println("tamaño del lote:" + dto.getTamañoDelLote() + "\n" + "\n");
        System.out.println("REPORTE:");
        System.out.println("Precio al Publico:" + dto.getPrecioAlPublico());
        System.out.println("Precio de venta:" + dto.getPrecioDeVenta());
        System.out.println("Costo por unidad:" + dto.getCostoPorUnidad());
        System.out.println("costo total del lote:" + dto.getCostoTotalLote());
        System.out.println("unidades a comercializar:" + dto.getUnidadesAComercializar());

    }
}
