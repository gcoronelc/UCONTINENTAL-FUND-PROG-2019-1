package pe.continental.apppromedio.prueba;

import pe.continental.apppromedio.service.PromedioService;

public class Prueba01 {

  public static void main(String[] args) {
    //datos
    int nota1 = 17;
    int nota2 = 18;
    int nota3 = 15;
    int nota4 = 04;
    //proceso
    int menor = PromedioService.notaMenor(nota1, nota2, nota3, nota4);
    //reporte
    System.out.println("menor: " + menor);
  }
}
