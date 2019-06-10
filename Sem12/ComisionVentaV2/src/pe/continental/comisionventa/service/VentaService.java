package pe.continental.comisionventa.service;

import egcc.util.Mate;

public class VentaService {

  // Constantes
  public static final String CAT_ADMINISTRACION = "ADMINISTRACION";
  public static final String CAT_OFIMATICA = "OFIMATICA";
  public static final String CAT_PROGRAMACION = "PROGRAMACION";
  public static final String CAT_OTROS = "OTROS TEMAS";

  public static double determinarTotal(String categoria, int participante) {
    // Variable
    double total = 0.0;
    // Proceso
    switch (categoria.toUpperCase()) {
      case CAT_ADMINISTRACION:
        total = Administracion.determinarTotal(participante);
        break;
      case CAT_OFIMATICA:
        total = Ofimatica.determinarTotal(participante);
        break;
      case CAT_PROGRAMACION:
        total = Programacion.determinarTotal(participante);
        break;
      case CAT_OTROS:
        total = Otros.determinarTotal(participante);
        break;
    }
    // Reporte
    return Mate.dosDec(total);
  }

  public static double determinarImporte(String categoria, int participante) {
    // VARIABLE 
    double importe = 0.0;
    // PROCESO
    switch (categoria.toUpperCase()) {
      case CAT_ADMINISTRACION:
        importe = Administracion.determinarImporte(participante);
        break;
      case CAT_OFIMATICA:
        importe = Ofimatica.determinarImporte(participante);
        break;
      case CAT_PROGRAMACION:
        importe = Programacion.determinarImporte(participante);
        break;
      case CAT_OTROS:
        importe = Otros.determinarImporte(participante);
        break;
    }
    // REPORTE
    return Mate.dosDec(importe);
  }

  public static double determinarImpuesto(String categoria, int participante) {
    // VARIABLE
    double impuesto = 0.0;
    // PROCESO
    switch (categoria.toUpperCase()) {
      case CAT_ADMINISTRACION:
        impuesto = Administracion.determinarImpuesto(participante);
        break;
      case CAT_OFIMATICA:
        impuesto = Ofimatica.determinarImpuesto(participante);
        break;
      case CAT_PROGRAMACION:
        impuesto = Programacion.determinarImpuesto(participante);
        break;
      case CAT_OTROS:
        impuesto = Otros.determinarImpuesto(participante);
        break;
    }
    // REPORTE
    return Mate.dosDec(impuesto);
  }

  public static double determinarComision(String categoria, int participante) {
    //VARIABLE
    double comision = 0.0;
    //PROCESO
    switch (categoria.toUpperCase()) {
      case CAT_ADMINISTRACION:
        comision = Administracion.determinarComision(participante);
        break;
      case CAT_OFIMATICA:
        comision = Ofimatica.determinarComision(participante);
        break;
      case CAT_PROGRAMACION:
        comision = Programacion.determinarComision(participante);
        break;
      case CAT_OTROS:
        comision = Otros.determinarComision(participante);
        break;
    }
    //reporte
    return Mate.dosDec(comision);
  }

  public static double determinarPrecio(String categoria) {
    //VARIABLE
    double precio = 0.0;
    //PROCESO
    switch (categoria.toUpperCase()) {
      case CAT_ADMINISTRACION:
        precio = Administracion.determinarPrecio(categoria);
        break;
      case CAT_OFIMATICA:
        precio = Ofimatica.determinarPrecio(categoria);
        break;
      case CAT_PROGRAMACION:
        precio = Programacion.determinarPrecio(categoria);
        break;
      case CAT_OTROS:
        precio = Otros.determinarPrecio(categoria);
        break;
    }
    //reporte
    return Mate.dosDec(precio);
  }

  
}
