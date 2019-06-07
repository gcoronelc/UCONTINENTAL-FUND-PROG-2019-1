
package pe.continental.docentepublico.prueba;

import pe.continental.docentepublico.Service.EncargaturaDirector;


public class prueba5 {
    public static void main(String[] args) {
        //datos
        int numeroHijos = 2;
        String categoria = EncargaturaDirector.OCTAVA;
        double cts = 0.14;
        double vacaciones = EncargaturaDirector.calcularRemuneracionMensual(numeroHijos, categoria);
        
        //proceso
        double salarioMensual = EncargaturaDirector.calcularSalarioMensual(categoria);
        double asignacionFamiliar = EncargaturaDirector.calcularAsignacionFamiliar(numeroHijos);
        double onp = EncargaturaDirector.calcularOnp(categoria);
        double essalud = EncargaturaDirector.calcularEssalud(categoria);
        double remuneracionMensual = EncargaturaDirector.calcularRemuneracionMensual(numeroHijos, categoria);
        double beneficios= EncargaturaDirector.calcularBeneficios(cts, categoria);
        double otros = EncargaturaDirector.calcularOtros(numeroHijos, categoria, vacaciones);
        double remuneracionAnual = EncargaturaDirector.calcularRemuneracionAnual(numeroHijos, categoria, onp, otros, essalud, beneficios, cts, vacaciones);
       
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
