/*
* Ejemplo 01:
* Mostrar el mensaje "NO ME VOY A DORMIR EN CLASE" 10 veces.
*/
package ejemplos;

public class Ejemplo01 {
  
  public static void main(String[] args) {
    // Variable
    int cont = 0;
    String mensaje = "NO VOY A DORMIR EN CLASE!!!";
    // Proceso
    while( cont < 10 ){
      cont++;
      System.out.println(cont + ".- " + mensaje);
    }
  }
  
}
