package pe.continental.eventoperu.service;

import pe.continental.eventoperu.dto.EventoPeruDto;

/**
 *
 * @author Angie Cauti
 * @email 74972442@continental.edu.pe
 */
public class EventoPeruService {

  // Constantes de la Categoria:
  public static final String LOCAL = "LOCAL";
  public static final String INTERNACIONAL = "INTERNACIONAL";
  public static final String PREMIUN = "PREMIUN";

  // Constantes de la Ubicacion:
  public static final String LIMA = "LIMA";
  public static final String PROVINCIA = "PROVINCIA";

  public static EventoPeruDto calcular(EventoPeruDto dto) {

    // PROCESOS:
    double ingresos = 0;
    switch (dto.getCategoria()) {
      case LOCAL:
        ingresos = 0;
        if (dto.getCapacidad() >= 15000) {
          ingresos = dto.getCapacidad() * 10.0;
        }
        break;
      case INTERNACIONAL:
        ingresos = 0;
        if (dto.getCapacidad() >= 15000) {
          ingresos = dto.getCapacidad() * 20.0;
        }
        break;
      case PREMIUN:
        ingresos = 0;
        if (dto.getCapacidad() >= 15000) {
          ingresos = dto.getCapacidad() * 10.0;
        }
        break;
    }
    double publicidad = ingresos * 0.07;
    double logistica = ingresos * 0.10;
    double transporte = 0;
    switch (dto.getUbicacion()) {
      case LIMA:
        transporte = 0;
        break;
      case PROVINCIA:
        transporte = 0.04 * ingresos;
        break;

    }
    double pagoArtista = 0;
    switch (dto.getCategoria()) {
      case LOCAL:
        pagoArtista = 30000.0;
        break;
      case INTERNACIONAL:
        pagoArtista = 70000.0;
        break;
      case PREMIUN:
        pagoArtista = 100000.0;
        break;
    }
    double gastos = publicidad + logistica + transporte + pagoArtista;
    double rentabilidad = ingresos - gastos;

    // REPORTE:
    dto.setIngresos(Trunco2Deci(ingresos));
    dto.setPublicidad(Trunco2Deci(publicidad));
    dto.setLogistica(Trunco2Deci(logistica));
    dto.setTransporte(Trunco2Deci(transporte));
    dto.setPagoArtista(Trunco2Deci(pagoArtista));
    dto.setGastos(Trunco2Deci(gastos));
    dto.setRentabilidad(Trunco2Deci(rentabilidad));

    return dto;

  }

  public static double Trunco2Deci(double dato) {
    // Proceso
    dato = dato * 100;
    dato = Math.round(dato) * 1.0;
    dato = dato / 100.0;
    // Reporte
    return dato;
  }
}
