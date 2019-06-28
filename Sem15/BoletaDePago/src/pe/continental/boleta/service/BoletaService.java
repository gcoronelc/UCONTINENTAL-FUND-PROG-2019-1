package pe.continental.boleta.service;

import egcc.util.Mate;
import pe.continental.boleta.dto.BoletaDto;

/**
 *
 * @author SANGAY
 */
public class BoletaService {
  
  
  public static BoletaDto procesar( BoletaDto dto){
    // Proceso
    double sueldoBruto = dto.getDias() * dto.getPagoDia();
    double sueldoFeriado = dto.getFeriados() * dto.getPagoDia() * 2;
    double comision = dto.getVentaMes() * 0.10;
    double sueldoImponible = sueldoBruto + sueldoFeriado + comision;
    double transporte = dto.getDias() * dto.getCostoPasaje();
    double totalIngresos = sueldoImponible + transporte;
    double afpFondo = sueldoImponible * 0.10;
    double afpSeguro = sueldoImponible * 0.0136;
    double afpComision = sueldoImponible * 0.0155;
    double dctoTotal = afpFondo + afpSeguro + afpComision;
    double essalud = sueldoImponible * 0.09;
    double sueldoNeto = totalIngresos - dctoTotal;
    // Reporte
    dto.setSueldoBruto(Mate.dosDec(sueldoBruto));
    dto.setSueldoFeriado(Mate.dosDec(sueldoFeriado));
    dto.setComision(Mate.dosDec(comision));
    dto.setSueldoImponible(Mate.dosDec(sueldoImponible));
    dto.setTransporte(Mate.dosDec(transporte));
    dto.setTotalIngresos(Mate.dosDec(totalIngresos));
    dto.setAfpComision(Mate.dosDec(afpComision));
    dto.setAfpFondo(Mate.dosDec(afpFondo));
    dto.setAfpSeguro(Mate.dosDec(afpSeguro));
    dto.setDctoTotal(Mate.dosDec(dctoTotal));
    dto.setEssalud(Mate.dosDec(essalud));
    dto.setSueldoNeto(Mate.dosDec(sueldoNeto));
    return dto;
  }
  

}
