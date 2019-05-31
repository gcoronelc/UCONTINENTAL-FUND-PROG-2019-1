
package pe.continental.docentepublico.prueba;

import pe.continental.docentepublico.Service.EncargaturaJerarquico;


public class prueba7 {
    public static void main(String[] args) {
        //datos
        int numeroHijos = 2;
        String categoria = EncargaturaJerarquico.OCTAVA;
        double cts = 0.14;
        double vacaciones = EncargaturaJerarquico.calcularRemuneracionMensual(numeroHijos, categoria);
        
        //proceso
        double salarioMensual = EncargaturaJerarquico.calcularSalarioMensual(categoria);
        double asignacionFamiliar = EncargaturaJerarquico.calcularAsignacionFamiliar(numeroHijos);
        double onp = EncargaturaJerarquico.calcularOnp(categoria);
        double essalud = EncargaturaJerarquico.calcularEssalud(categoria);
        double remuneracionMensual = EncargaturaJerarquico.calcularRemuneracionMensual(numeroHijos, categoria);
        double beneficios= EncargaturaJerarquico.calcularBeneficios(cts, categoria);
        double otros = EncargaturaJerarquico.calcularOtros(numeroHijos, categoria, vacaciones);
        double remuneracionAnual = EncargaturaJerarquico.calcularRemuneracionAnual(numeroHijos, categoria, onp, otros, essalud, beneficios, cts, vacaciones);
       
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
