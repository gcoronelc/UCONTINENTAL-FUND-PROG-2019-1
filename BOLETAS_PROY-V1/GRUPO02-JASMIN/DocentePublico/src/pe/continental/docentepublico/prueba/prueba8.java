
package pe.continental.docentepublico.prueba;

import pe.continental.docentepublico.Service.EncargaturaSubdirector;


public class prueba8 {
    public static void main(String[] args) {
        //datos
        int numeroHijos = 2;
        String categoria = EncargaturaSubdirector.OCTAVA;
        double cts = 0.14;
        double vacaciones = EncargaturaSubdirector.calcularRemuneracionMensual(numeroHijos, categoria);
        
        //proceso
        double salarioMensual = EncargaturaSubdirector.calcularSalarioMensual(categoria);
        double asignacionFamiliar = EncargaturaSubdirector.calcularAsignacionFamiliar(numeroHijos);
        double onp = EncargaturaSubdirector.calcularOnp(categoria);
        double essalud = EncargaturaSubdirector.calcularEssalud(categoria);
        double remuneracionMensual = EncargaturaSubdirector.calcularRemuneracionMensual(numeroHijos, categoria);
        double beneficios= EncargaturaSubdirector.calcularBeneficios(cts, categoria);
        double otros = EncargaturaSubdirector.calcularOtros(numeroHijos, categoria, vacaciones);
        double remuneracionAnual = EncargaturaSubdirector.calcularRemuneracionAnual(numeroHijos, categoria, onp, otros, essalud, beneficios, cts, vacaciones);
       
        //reporte
        System.out.println("salario mensual :" + salarioMensual);
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
