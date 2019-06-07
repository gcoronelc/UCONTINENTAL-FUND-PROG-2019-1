
package pe.continental.docentepublico.prueba;

import pe.continental.docentepublico.Service.DocenteContratado;


public class prueba3 {
    public static void main(String[] args) {
        //datos
        int numeroHijos = 2;
        double unidocente = 200;
        double multigrado = 140;
        double bilingue = 50;
        double modalidad = 70.01;
        double cts = 0.14;
        double lenguaOrdinaria = 100;
        double jornadaLaboral = 30;
        double incentivoAprendizaje = 1000;
        double vacaciones = DocenteContratado.calcularRemuneracionMensual(lenguaOrdinaria, jornadaLaboral, modalidad, multigrado, unidocente, bilingue, numeroHijos);
        
        //proceso
        double salarioMensual = DocenteContratado.calcularSalarioMensual(modalidad, jornadaLaboral);
        double asignaciones = DocenteContratado.calcularAsignaciones(unidocente, multigrado, bilingue, lenguaOrdinaria);
        double asignacionFamiliar = DocenteContratado.calcularAsignacionFamiliar(numeroHijos);
        double onp = DocenteContratado.calcularOnp(jornadaLaboral, modalidad);
        double essalud = DocenteContratado.calcularEssalud(jornadaLaboral, modalidad);
        double remuneracionMensual = DocenteContratado.calcularRemuneracionMensual(lenguaOrdinaria, jornadaLaboral, modalidad, multigrado, unidocente, bilingue, numeroHijos);
        double beneficios= DocenteContratado.calcularBeneficios(cts, modalidad, jornadaLaboral);
        double otros = DocenteContratado.calcularOtros(numeroHijos, lenguaOrdinaria, jornadaLaboral, incentivoAprendizaje, modalidad, vacaciones, unidocente, multigrado, bilingue);
        double remuneracionAnual = DocenteContratado.calcularRemuneracionAnual(numeroHijos, jornadaLaboral, modalidad, unidocente, multigrado, lenguaOrdinaria, incentivoAprendizaje, bilingue, cts, vacaciones);
       
        //reporte
        System.out.println("salario mensual :" + salarioMensual);
        System.out.println("bonificaciones :" + asignaciones);
        System.out.println("asignacion familiar :" + asignacionFamiliar);
        System.out.println("onp :" + onp);
        System.out.println("numero de hijos :" + numeroHijos);
        System.out.println("essalud :" + essalud);
        System.out.println("remuneracion Mensual :" + remuneracionMensual);
        System.out.println("beneficios:" + beneficios);
        System.out.println("otros ingresos :" + otros);
        System.out.println("remuneracion anual :" + remuneracionAnual);
        
        
    }
}
