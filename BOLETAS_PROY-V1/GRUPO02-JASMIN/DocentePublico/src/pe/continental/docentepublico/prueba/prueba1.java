
package pe.continental.docentepublico.prueba;

import pe.continental.docentepublico.Service.AuxiliarContratado;


public class prueba1 {
    public static void main(String[] args) {
        //datos
        int numeroHijos = 2;
        double unidocente = 200;
        double multigrado = 140;
        double bilingue = 50;
        double modalidad = 1230.0;
        double cts = 0.14;
        double vacaciones= AuxiliarContratado.calcularRemuneracionMensual(numeroHijos, modalidad, multigrado, unidocente, bilingue);
        //proceso
        double salarioMensual = AuxiliarContratado.calcularSalarioMensual(modalidad);
        double asignaciones = AuxiliarContratado.calcularAsignaciones(unidocente, multigrado, bilingue);
        double asignacionFamiliar = AuxiliarContratado.calcularAsignacionFamiliar(numeroHijos);
        double onp = AuxiliarContratado.calcularOnp(modalidad);
        double essalud = AuxiliarContratado.calcularEssalud(modalidad);
        double remuneracionMensual = AuxiliarContratado.calcularRemuneracionMensual(numeroHijos, modalidad, multigrado, unidocente, bilingue);
        double beneficios= AuxiliarContratado.calcularBeneficios(cts, modalidad);
        double otros = AuxiliarContratado.calcularOtros(numeroHijos, modalidad, vacaciones, unidocente, multigrado, bilingue);
        double remuneracionAnual = AuxiliarContratado.calcularRemuneracionAnual(numeroHijos, modalidad, unidocente, multigrado, bilingue, cts, vacaciones);
       
        //reporte
        System.out.println("salario mensual :" + salarioMensual);
        System.out.println("bonificaciones :" + asignaciones);
        System.out.println("asignacion familiar :" + asignacionFamiliar);
        System.out.println("onp :" + onp);
        System.out.println("numero de hijos :" + numeroHijos);
        System.out.println("essalud :" + essalud);
        System.out.println("remuneracion Mensual :" + remuneracionMensual);
        System.out.println("beneficios:" + beneficios);
        System.out.println("vacaciones :" + otros);
        System.out.println("remuneracion anual :" + remuneracionAnual);
        
        
    }
}
