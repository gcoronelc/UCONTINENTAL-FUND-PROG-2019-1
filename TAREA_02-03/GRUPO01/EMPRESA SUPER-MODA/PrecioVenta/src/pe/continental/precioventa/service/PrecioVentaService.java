/*
     * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.precioventa.service;

import egcc.util.Mate;
import pe.continental.precioventa.dto.PrecioVentaDto;

/**
 *
 * @author Angie
 */
public class PrecioVentaService {
    public  PrecioVentaDto calcular (PrecioVentaDto dto){
        //Procesos:
        double totalUnidades = calculoTotalUnidades(dto.getTamañoLote());
        double costoTotal = calculoCostoTotal(dto.getPrecioLote(), dto.getGastos());
        double costoUnidad = calculoCostoUnidad(dto.getPrecioLote(), dto.getGastos(), dto.getTamañoLote());
        double precioVenta = calculoPrecioVenta(dto.getPrecioLote(),dto.getGastos(), dto.getTamañoLote(), dto.getGanancia());
        double precioPublico = calculoPrecioPublico(dto.getPrecioLote(), dto.getGastos(), dto.getTamañoLote(), dto.getGanancia());
        //Reportes:
        dto.setTotalUnidades(totalUnidades);
        dto.setCostoTotal(costoTotal);
        dto.setCostoUnidad(costoUnidad);
        dto.setPrecioVenta(precioVenta);
        dto.setPrecioPublico(precioPublico);
        return dto;
       
    }

    public static double calculoTotalUnidades(int tamañoLote) {
        //Proceso:
        double totalUnidades = 0.90 * tamañoLote;
        //Reporte:
        return totalUnidades;
    }

    public static double calculoCostoTotal(double precioLote, double gastos) {
        //Proceso:
        double costoTotal = precioLote + precioLote*(gastos/100);
        //Reporte
        return Mate.dosDec(costoTotal);
    }

    public static double calculoCostoUnidad(double precioLote, double gastos, int tamañoLote) {
        //Proceso:
        double costoUnidad = calculoCostoTotal(precioLote, gastos)/ calculoTotalUnidades(tamañoLote);
        //Reporte:
        return Mate.dosDec(costoUnidad);
    }

    public static double calculoPrecioVenta(double precioLote, double gastos, int tamañoLote, double ganancia) {
        //Proceso:
        double precioVenta = calculoCostoUnidad(precioLote, gastos, tamañoLote)* (1 + (ganancia/100));
        //Reporte:
        return Mate.dosDec(precioVenta);
    }

    public static double calculoPrecioPublico(double precioLote, double gastos, int tamañoLote, double ganancia) {
        //Proceso:
        double precioPublico = calculoPrecioVenta(precioLote, gastos, tamañoLote, ganancia)* 1.18; // IGV:18%
        //Reporte:
        return Mate.dosDec(precioPublico);
    }
}
