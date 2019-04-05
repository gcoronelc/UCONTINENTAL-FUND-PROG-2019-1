package pe.continental.apppromedio.service;

public class PromedioService {

  public static int notaMenor(int nota1, int nota2, int nota3, int nota4) {
    // variables
    int menor;
    //proceso
    menor = nota1;
    if (menor > nota2) {
      menor = nota2;
    }
    if (menor > nota3) {
      menor = nota3;
    }
    if (menor > nota4) {
      menor = nota4;
    }
    //reporte
    return menor;
  }

  public static int promediar(int nota1, int nota2, int nota3, int nota4) {
    //variables
    int menor;
    int promedio;
    //proceso
    menor = notaMenor(nota1, nota2, nota3, nota4);
    promedio = nota1 + nota2 + nota3 + nota4 - menor;
    promedio = promedio / 3;
    //reporte
    return promedio;

  }

  public static String condicion(int nota) {
    //variable
    String cond;
    //proceso
    if (nota >= 11) {
      cond = "aprobado";
    } else {
      cond = "desaprobado";
    }
    //reporte
    return cond;
  }
  
  
} // FIN DE CLASE
