package pe.continental.docentepublico.Service;

public class DocenteContratado {

    public static double calcularAsignaciones(double unidocente, double multigrado, double bilingue, double lenguaOrdinaria) {
        // variable
        double asignaciones;
        //proceso
        unidocente = 200;
        multigrado = 140;
        bilingue = 50;
        lenguaOrdinaria = 100;

        asignaciones = unidocente + multigrado + bilingue + lenguaOrdinaria;
        // reporte 
        return asignaciones;

    }

    public static double calcularSalarioMensual(double modalidad, double jornadaLaboral) {
        //variable
        double salarioMensual;
        //proceso
        salarioMensual = modalidad * jornadaLaboral;
        modalidad = 70.01;
        jornadaLaboral = 30;
        //reporte
        return salarioMensual;
    }

    public static double calcularRemuneracionMensual(double lenguaOrdinaria, double jornadaLaboral, double modalidad, double multigrado, double unidocente, double bilingue, int numeroHijos) {
        // variable 
        double remuneracionMensual;
        //proceso
        remuneracionMensual = calcularSalarioMensual(modalidad, jornadaLaboral) + calcularAsignaciones(unidocente, multigrado, bilingue, lenguaOrdinaria) + calcularAsignacionFamiliar(numeroHijos) - calcularOnp(jornadaLaboral, modalidad) - calcularEssalud(jornadaLaboral, modalidad);
        // reporte
        return remuneracionMensual;
    }

    public static double calcularBeneficios(double cts, double modalidad, double jornadaLaboral) {
        // variable
        double Beneficios;
        //proceso
        cts = 0.14;
        Beneficios = calcularSalarioMensual(modalidad, jornadaLaboral) * cts ;
        //reporte
        return Beneficios;

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

    public static double calcularOnp(double jornadaLaboral, double modalidad) {
        // variable
        double onp;
        // proceso
        onp = calcularSalarioMensual(modalidad, jornadaLaboral) * 0.13;
        // reporte
        return onp;
    }

    public static double calcularEssalud(double jornadaLaboral, double modalidad) {
        // variable
        double essalud;
        //proceso
        essalud = calcularSalarioMensual(modalidad, jornadaLaboral) * 0.09;
        //reporte
        return essalud;
    }

    public static double calcularOtros(int numeroHijos, double lenguaOrdinaria, double jornadaLoboral, double incentivoAprendizaje, double modalidad, double vacaciones, double unidocente, double multigrado, double bilingue) {
        //variable
        double otros;
        // proceso
        incentivoAprendizaje = 1000;
        vacaciones = calcularRemuneracionMensual(lenguaOrdinaria, jornadaLoboral, modalidad, multigrado, unidocente, bilingue, numeroHijos);
        otros = vacaciones + incentivoAprendizaje;
        // reporte
        return otros;
    }

    public static double calcularRemuneracionAnual(int numeroHijos, double jornadaLaboral, double modalidad, double unidocente, double multigrado, double lenguaOrdinaria, double incentivoAprendizaje, double bilingue, double cts, double vacaciones) {
        // variable 
        double remuneracionAnual;
        //proceso
        remuneracionAnual = calcularRemuneracionMensual(lenguaOrdinaria, jornadaLaboral, modalidad, multigrado, unidocente, bilingue, numeroHijos)*12 + calcularOtros(numeroHijos, lenguaOrdinaria, jornadaLaboral, incentivoAprendizaje, modalidad, vacaciones, unidocente, multigrado, bilingue) + calcularBeneficios(cts, modalidad, jornadaLaboral) * 2;
        //reporte
        return remuneracionAnual;
    }
}
