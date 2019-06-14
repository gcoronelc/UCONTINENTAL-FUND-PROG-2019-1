/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.precioventa.prueba;

import pe.continental.precioventa.dto.PrecioVentaDto;
import pe.continental.precioventa.service.PrecioVentaService;

/**
 *
 * @author Angie
 */
public class Prueba05 {
    public static void main(String[] args) {
        // Datos:
        PrecioVentaDto dto = new PrecioVentaDto();
        dto.setTamañoLote(1000);
        dto.setPrecioLote(50000);
        dto.setGastos(25);
        dto.setGanancia(200);
        
        // Proceso:
        PrecioVentaService precioVentaService = new PrecioVentaService();
        dto = precioVentaService.calcular(dto);
       
        // Reportes:
        System.out.println("DATOS:");
        System.out.println("Tamaño del lote: " + dto.getTamañoLote());
        System.out.println("Precio del lote: " + dto.getPrecioLote());
        System.out.println("Ganancia: " + dto.getGanancia());
        System.out.println("Gastos administrativos: " + dto.getGastos() + "\n");
        System.out.println("REPORTE: ");
        System.out.println("Unidades a comercializar: " + dto.getTotalUnidades());
        System.out.println("Costo Total del lote: " + dto.getCostoTotal());
        System.out.println("Costo por unidad: " + dto.getCostoUnidad());
        System.out.println("Precio de Venta: " + dto.getPrecioVenta());
        System.out.println("Precio al Publico: " + dto.getPrecioPublico());
        
        
        
        
        
    }
}
