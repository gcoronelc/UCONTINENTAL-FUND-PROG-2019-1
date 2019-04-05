package pe.continental.apppromedio.prueba;

import pe.continental.apppromedio.service.PromedioService;

public class Prueba03 {

  public static void main(String[] args) {
    //datos
    int nota = 10;
    // proceso
    String cond = PromedioService.condicion(nota);
    //reporte
    System.out.println("condicion:" + cond);

  }
}
