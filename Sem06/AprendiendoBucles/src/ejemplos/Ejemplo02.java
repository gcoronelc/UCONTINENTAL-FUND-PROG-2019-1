/*
* Ejemplo 02:
* Encontrar de un número entero sus divisores.
*/
package ejemplos;

public class Ejemplo02 {
  
  public static void main(String[] args) {
    // Datos
    int numero = 90;
    // Proceso
    int cont = 1;
    int resto;
    String divisores = "";
    while( cont <= numero ){
      resto = numero % cont;
      if( resto == 0 ){
        divisores += cont + "\n";
      }
      cont++;
    }
    // Reporte
    System.out.println(divisores);
  }
  
}
