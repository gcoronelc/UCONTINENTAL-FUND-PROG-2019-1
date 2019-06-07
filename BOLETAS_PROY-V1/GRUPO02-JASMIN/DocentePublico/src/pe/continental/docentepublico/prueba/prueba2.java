
package pe.continental.docentepublico.prueba;

import pe.continental.docentepublico.Service.AuxiliarNombrado;


public class prueba2 {
    public static void main(String[] args) {
        //datos
        int numeroHijos = 2;
        double unidocente = 200;
        double multigrado = 140;
        double bilingue = 50;
        double modalidad = 1330.0;
        double cts = 0.14;
        double vacaciones= AuxiliarNombrado.calcularRemuneracionMensual(numeroHijos, modalidad, multigrado, unidocente, bilingue);
        //proceso
        double salarioMensual = AuxiliarNombrado.calcularSalarioMensual(modalidad);
        double asignaciones = AuxiliarNombrado.calcularAsignaciones(unidocente, multigrado, bilingue);
        double asignacionFamiliar = AuxiliarNombrado.calcularAsignacionFamiliar(numeroHijos);
        double onp = AuxiliarNombrado.calcularOnp(modalidad);
        double essalud = AuxiliarNombrado.calcularEssalud(modalidad);
        double remuneracionMensual = AuxiliarNombrado.calcularRemuneracionMensual(numeroHijos, modalidad, multigrado, unidocente, bilingue);
        double beneficios= AuxiliarNombrado.calcularBeneficios(cts, modalidad);
        double otros = AuxiliarNombrado.calcularOtros(numeroHijos, modalidad, vacaciones, unidocente, multigrado, bilingue);
        double remuneracionAnual = AuxiliarNombrado.calcularRemuneracionAnual(numeroHijos, modalidad, unidocente, multigrado, bilingue, cts, vacaciones);
       
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
