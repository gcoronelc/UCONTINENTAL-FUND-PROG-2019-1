
package pe.continental.docentepublico.prueba;

import pe.continental.docentepublico.Service.DocenteNombrado;


public class prueba4 {
    public static void main(String[] args) {
        //datos
        int numeroHijos = 2;
        String categoria = DocenteNombrado.OCTAVA;
        double unidocente = 200;
        double multigrado = 140;
        double bilingue = 50;
        double modalidad = 70.01;
        double cts = 0.14;
        double bilingueAcreditado = 100;
        double vacaciones = DocenteNombrado.calcularRemuneracionMensual(numeroHijos, categoria, unidocente, multigrado, bilingue, bilingueAcreditado);
        
        //proceso
        double salarioMensual = DocenteNombrado.calcularSalarioMensual(categoria);
        double asignaciones = DocenteNombrado.calcularAsignaciones(unidocente, multigrado, bilingue, bilingueAcreditado);
        double asignacionFamiliar = DocenteNombrado.calcularAsignacionFamiliar(numeroHijos);
        double onp = DocenteNombrado.calcularOnp(categoria);
        double essalud = DocenteNombrado.calcularEssalud(categoria);
        double remuneracionMensual = DocenteNombrado.calcularRemuneracionMensual(numeroHijos, categoria, unidocente, multigrado, bilingue, bilingueAcreditado);
        double beneficios= DocenteNombrado.calcularBeneficios(cts, categoria);
        double otros = DocenteNombrado.calcularOtros(numeroHijos, categoria, bilingueAcreditado, vacaciones, unidocente, multigrado, bilingue);
        double remuneracionAnual = DocenteNombrado.calcularRemuneracionAnual(numeroHijos, categoria, unidocente, multigrado, bilingue, bilingueAcreditado, cts, vacaciones);
       
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
