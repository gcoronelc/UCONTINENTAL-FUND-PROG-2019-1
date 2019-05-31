package pe.continental.docentepublico.Service;

public class AuxiliarNombrado {

    public static double calcularAsignaciones(double unidocente, double multigrado, double bilingue) {
        // variable
        double asignaciones;
        //proceso
        unidocente = 200;
        multigrado = 140;
        bilingue = 50;

        asignaciones = unidocente + multigrado + bilingue;
        // reporte 
        return asignaciones;

    }

    public static double calcularSalarioMensual(double modalidad) {
        //variable
        double salarioMensual;
        //proceso
        salarioMensual = modalidad;
        modalidad = 1330.0;
        //reporte
        return salarioMensual;
    }

    public static double calcularRemuneracionMensual(int numeroHijos, double modalidad, double multigrado, double unidocente, double bilingue) {
        // variable 
        double remuneracionMensual;
        //proceso
        remuneracionMensual = calcularSalarioMensual(modalidad) + calcularAsignaciones(unidocente, multigrado, bilingue) + calcularAsignacionFamiliar(numeroHijos) - calcularOnp(modalidad) - calcularEssalud(modalidad);
        // reporte
        return remuneracionMensual;
    }

    public static double calcularBeneficios(double cts, double modalidad) {
        // variable
        double Beneficios;
        //proceso
        cts = 0.14;
        Beneficios = calcularSalarioMensual(modalidad) * cts;
        //reporte
        return Beneficios;

    }

    public static double calcularOtros(int numeroHijos, double modalidad, double vacaciones, double unidocente, double multigrado, double bilingue) {
        //variable
        double otros;
        // proceso
        vacaciones = calcularRemuneracionMensual(numeroHijos, modalidad, multigrado, unidocente, bilingue);
        otros = vacaciones;
        // reporte
        return otros;
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

    public static double calcularOnp(double modalidad) {
        // variable
        double onp;
        // proceso
        onp = calcularSalarioMensual(modalidad) * 0.13;
        // reporte
        return onp;
    }

    public static double calcularEssalud(double modalidad) {
        // variable
        double essalud;
        //proceso
        essalud = calcularSalarioMensual(modalidad) * 0.09;
        //reporte
        return essalud;
    }

    public static double calcularRemuneracionAnual(int numeroHijos, double modalidad, double unidocente, double multigrado, double bilingue, double cts, double vacaciones) {
        // variable 
        double remuneracionAnual;
        //proceso
        remuneracionAnual = calcularRemuneracionMensual(numeroHijos, modalidad, multigrado, unidocente, bilingue)*12+calcularBeneficios(cts, modalidad)*2+calcularOtros(numeroHijos, modalidad, vacaciones, unidocente, multigrado, bilingue);
        //reporte
        return remuneracionAnual;
    }
}
