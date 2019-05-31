package pe.continental.docentepublico.Service;

public class DocenteNombrado {

    public static double calcularAsignaciones(double unidocente, double multigrado, double bilingue, double bilingueAcreditado) {
        // variable
        double asignaciones;
        //proceso
        unidocente = 200;
        multigrado = 140;
        bilingue = 50;
        bilingueAcreditado = 100;

        asignaciones = unidocente + multigrado + bilingue + bilingueAcreditado;
        // reporte 
        return asignaciones;

    }

    // Constantes
    public static final String OCTAVA = "OCTAVA";
    public static final String SEPTIMA = "SEPTIMA";
    public static final String SEXTA = "SEXTA";
    public static final String QUINTA = "QUINTA";
    public static final String CUARTA = "CUARTA";
    public static final String TERCERA = "TERCERA";
    public static final String SEGUNDA = "SEGUNDA";
    public static final String PRIMERA = "PRIMERA";

    public static double calcularSalarioMensual(String categoria) {
        //variable
        double salarioMensual = 0.0;
        //proceso
        switch (categoria) {
            case OCTAVA:
                salarioMensual = 70.01 * 2.1 * 30;
                break;
            case SEPTIMA:
                salarioMensual = 70.01 * 1.9 * 30;
                break;
            case SEXTA:
                salarioMensual = 70.01 * 1.75 * 30;
                break;
            case QUINTA:
                salarioMensual = 70.01 * 1.5 * 30;
                break;
            case CUARTA:
                salarioMensual = 70.01 * 1.3 * 30;
                break;
            case TERCERA:
                salarioMensual = 70.01 * 1.2 * 30;
                break;
            case SEGUNDA:
                salarioMensual = 70.01 * 1.1 * 30;
                break;
            case PRIMERA:
                salarioMensual = 70.01 * 1 * 30;
                break;
        }
        //reporte
        return salarioMensual;
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

    public static double calcularOnp(String categoria) {
        // variable
        double onp;
        // proceso
        onp = calcularSalarioMensual(categoria) * 0.13;
        // reporte
        return onp;
    }

    public static double calcularEssalud(String categoria) {
        // variable
        double essalud;
        //proceso
        essalud = calcularSalarioMensual(categoria) * 0.09;
        //reporte
        return essalud;
    }

    public static double calcularRemuneracionMensual(int numeroHijos, String categoria, double unidocente, double multigrado, double bilingue, double bilingueAcreditado) {
        // variable 
        double remuneracionMensual;
        //proceso
        remuneracionMensual = calcularSalarioMensual(categoria) + calcularAsignaciones(unidocente, multigrado, bilingue, bilingueAcreditado)+calcularAsignacionFamiliar(numeroHijos)-calcularOnp(categoria)-calcularEssalud(categoria);
        // reporte
        return remuneracionMensual;
    }

    public static double calcularBeneficios(double cts, String categoria) {
        // variable
        double Beneficios;
        //proceso
        cts = 0.14;
        Beneficios = calcularSalarioMensual(categoria) * cts ;
        //reporte
        return Beneficios;

    }

    public static double calcularOtros(int numeroHijos, String categoria, double bilingueAcreditado, double vacaciones, double unidocente, double multigrado, double bilingue) {
        //variable
        double otros = 0.0;
        // proceso
        vacaciones = calcularRemuneracionMensual(numeroHijos, categoria, unidocente, multigrado, bilingue, bilingueAcreditado);
        switch (categoria) {
            case OCTAVA:
                otros = 3000 + vacaciones;
                break;
            case SEPTIMA:
                otros = 3000 + vacaciones;
                break;
            case SEXTA:
                otros = 3000 + vacaciones;
                break;
            case QUINTA:
                otros = 3000 + vacaciones;
                break;
            case CUARTA:
                otros = 1000 + vacaciones;
                break;
            case TERCERA:
                otros = 1000 + vacaciones;
                break;
            case SEGUNDA:
                otros = 1000 + vacaciones;
                break;
            case PRIMERA:
                otros = 1000 + vacaciones;
                break;
        }
        // reporte
        return otros;
    }

    public static double calcularRemuneracionAnual(int numeroHijos, String categoria, double unidocente, double multigrado, double bilingue, double bilingueAcreditado, double cts, double vacaciones) {
        // variable 
        double remuneracionAnual;
        //proceso
        remuneracionAnual = calcularRemuneracionMensual(numeroHijos, categoria, unidocente, multigrado, bilingue, bilingueAcreditado)*12 + calcularOtros(numeroHijos, categoria, bilingueAcreditado, vacaciones, unidocente, multigrado, bilingue) + calcularBeneficios(cts, categoria)*2;
        //reporte
        return remuneracionAnual;
    }
}
