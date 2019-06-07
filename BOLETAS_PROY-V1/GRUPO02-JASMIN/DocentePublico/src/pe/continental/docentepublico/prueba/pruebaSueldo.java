
package pe.continental.docentepublico.prueba;

import pe.continental.docentepublico.Service.SueldoDocentePublico;



public class pruebaSueldo {
    public static void main(String[] args) {
        //datos
        int numeroHijos = 2;
        String categoria = SueldoDocentePublico.CAT_AUXILIARCONTRATADO;
        double unidocente = 200;
        double modalidad = 1230;
        double multigrado = 140;
        double bilingue = 50;
        double bilingueAcreditado =100;
        double cts = 0.14;
        double lenguaOrdinaria = 100;
        double jornadaLaboral = 30;
        double incentivoAprendizaje = 1000;
        double vacaciones= SueldoDocentePublico.calcularSalarioMensual(categoria, modalidad, jornadaLaboral);
        //proceso
        double salarioMensual = SueldoDocentePublico.calcularSalarioMensual(categoria, modalidad, jornadaLaboral);
        double asignaciones = SueldoDocentePublico.calcularAsignaciones(categoria, bilingueAcreditado, unidocente, multigrado, bilingue, lenguaOrdinaria);
        double asignacionFamiliar = SueldoDocentePublico.calcularAsignacionFamiliar(numeroHijos, categoria);
        double onp = SueldoDocentePublico.calcularOnp(categoria, modalidad, jornadaLaboral);
        double essalud = SueldoDocentePublico.calcularEssalud(categoria, jornadaLaboral, modalidad);
        double remuneracionMensual = SueldoDocentePublico.calcularRemuneracionMensual(numeroHijos, categoria, modalidad, jornadaLaboral, bilingueAcreditado, unidocente, multigrado, bilingue, lenguaOrdinaria);
        double beneficios= SueldoDocentePublico.calcularBeneficios(cts, modalidad, jornadaLaboral, categoria);
        double otros =SueldoDocentePublico.calcularOtros(numeroHijos, categoria, modalidad, incentivoAprendizaje, jornadaLaboral, bilingueAcreditado, unidocente, multigrado, bilingue, lenguaOrdinaria, vacaciones, cts);
        double remuneracionAnual = SueldoDocentePublico.calcularRemuneracionAnual(numeroHijos, categoria, cts, modalidad, jornadaLaboral, bilingueAcreditado, unidocente, multigrado, bilingue, lenguaOrdinaria, vacaciones, incentivoAprendizaje);
       
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
