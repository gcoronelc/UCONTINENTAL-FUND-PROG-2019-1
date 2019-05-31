package pe.continental.impuestorentaanual.service;

public class ImpuestoRentaAnualService {

   public static double hallarSueldoAnual(double salario) {
      // variable
      double sueldoAnual;
      //proceso
      sueldoAnual = salario * 12;

      // reporte
      return sueldoAnual;
   }

   public static double calcularAsignacionFamiliar(int numeroHijos) {
      // variable
      double asignacionFamiliar = 0;
      //proceso
      if (numeroHijos > 1) {
         asignacionFamiliar = 93;

      }
      // reporte
      return asignacionFamiliar;
   }

   public static double determinarRemuneracionBrutaAnual(double salario, int numeroHijos, double gratificacion, double bonos, double vacaciones) {
      //variables
      double remuneracionBrutaAnual;
      // proceso
      remuneracionBrutaAnual = (hallarSueldoAnual(salario) + calcularAsignacionFamiliar(numeroHijos) + gratificacion + bonos + vacaciones);
      // reporte 
      return remuneracionBrutaAnual;

   }

   public static double determinarRemuneracionNetaAnual(double salario, int numeroHijos, double gratificacion, double bonos, double vacaciones) {
      //variable
      double remuneracionNetaAnual = 0;
      //proceso
      if (determinarRemuneracionBrutaAnual(salario, numeroHijos, gratificacion, bonos, vacaciones) >= 7 * 4200) {
         remuneracionNetaAnual = determinarRemuneracionBrutaAnual(salario, numeroHijos, gratificacion, bonos, vacaciones) - 7 * 4200;
      }

      //reporte 
      return remuneracionNetaAnual;

   }

   public static double hallarImpuestoAnualProyectado(double salario, int numeroHijos, double gratificacion, double bonos, double vacaciones) {
      // variable
      double impuestoAnualProyectado = 0.0;
      double RemuneracionNetaAnual;
      // proceso
      RemuneracionNetaAnual = determinarRemuneracionBrutaAnual(salario, numeroHijos, gratificacion, bonos, vacaciones) - 7 * 4200;
      int control = 0;
      while (RemuneracionNetaAnual > 0) {
         control++;
         switch (control) {
            case 1:
               if (RemuneracionNetaAnual > 4200 * 5) {
                  impuestoAnualProyectado += 4200 * 5 * 0.08;

               } else {
                  impuestoAnualProyectado += RemuneracionNetaAnual * 0.08;
                  RemuneracionNetaAnual = 0;
               }
               break;
            case 2:
               if (RemuneracionNetaAnual > 4200 * 15) {
                  impuestoAnualProyectado += 4200 * 15 * 0.14;

               } else {
                  impuestoAnualProyectado += RemuneracionNetaAnual * 0.14;
                  RemuneracionNetaAnual = 0;
               }
               break;
            case 3:
               if (RemuneracionNetaAnual > 4200 * 15) {
                  impuestoAnualProyectado += 4200 * 15 * 0.17;

               } else {
                  impuestoAnualProyectado += RemuneracionNetaAnual * 0.17;
                  RemuneracionNetaAnual = 0;
               }
               break;
            case 4:
               if (RemuneracionNetaAnual > 4200 * 10) {
                  impuestoAnualProyectado += 4200 * 10 * 0.20;

               } else {
                  impuestoAnualProyectado += RemuneracionNetaAnual * 0.20;
                  RemuneracionNetaAnual = 0;
               }
               break;
            case 5:

               impuestoAnualProyectado += RemuneracionNetaAnual * 0.30;
               RemuneracionNetaAnual = 0;
               break;
         }

      }
      // reporte
      return impuestoAnualProyectado;

   }

   public static double calcularImpuesto4Categoria(double salario, int numeroHijos, double gratificacion, double bonos, double vacaciones) {
      //variable
      double impuesto4Categoria = 0;
      //proceso
      if (salario > 1500) {
         impuesto4Categoria = determinarRemuneracionNetaAnual(salario, numeroHijos, gratificacion, bonos, vacaciones) - determinarRemuneracionNetaAnual(salario, numeroHijos, gratificacion, bonos, vacaciones) * 0.08;

      }
      //reporte 
      return impuesto4Categoria;

   }
}
