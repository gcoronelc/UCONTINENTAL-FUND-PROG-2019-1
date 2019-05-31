
package pe.continental.docentepublico.prueba;

import pe.continental.docentepublico.Service.EncargaturaEspecialista;


public class prueba6 {
    public static void main(String[] args) {
        //datos
        int numeroHijos = 2;
        String categoria = EncargaturaEspecialista.OCTAVA;
        double cts = 0.14;
        double vacaciones = EncargaturaEspecialista.calcularRemuneracionMensual(numeroHijos, categoria);
        
        //proceso
        double salarioMensual = EncargaturaEspecialista.calcularSalarioMensual(categoria);
        double asignacionFamiliar = EncargaturaEspecialista.calcularAsignacionFamiliar(numeroHijos);
        double onp = EncargaturaEspecialista.calcularOnp(categoria);
        double essalud = EncargaturaEspecialista.calcularEssalud(categoria);
        double remuneracionMensual = EncargaturaEspecialista.calcularRemuneracionMensual(numeroHijos, categoria);
        double beneficios= EncargaturaEspecialista.calcularBeneficios(cts, categoria);
        double otros = EncargaturaEspecialista.calcularOtros(numeroHijos, categoria, vacaciones);
        double remuneracionAnual = EncargaturaEspecialista.calcularRemuneracionAnual(numeroHijos, categoria, onp, otros, essalud, beneficios, cts, vacaciones);
       
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
