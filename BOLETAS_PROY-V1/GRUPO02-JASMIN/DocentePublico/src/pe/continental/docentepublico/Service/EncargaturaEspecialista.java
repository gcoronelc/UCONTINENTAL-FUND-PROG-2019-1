
package pe.continental.docentepublico.Service;


public class EncargaturaEspecialista {
    // constantes
    public static final String OCTAVA = "OCTAVA";
    public static final String SEPTIMA = "SEPTIMA";
    public static final String SEXTA = "SEXTA";
    public static final String QUINTA = "QUINTA";
    public static final String CUARTA = "CUARTA";
    public static final String TERCERA = "TERCERA";
    public static final String SEGUNDA = "SEGUNDA";
    public static final String PRIMERA = "PRIMERA";
    
    public static double calcularSalarioMensual(String categoria){
        //variable
        double salarioMensual = 0.0;
        //proceso
        switch (categoria) {
            case OCTAVA:
                salarioMensual = 1470.21 + 900;
                break;
            case SEPTIMA:
                salarioMensual = 1330.19 +900;
                break;
            case SEXTA:
                salarioMensual = 1225.18+900;
                break;
            case QUINTA:
                salarioMensual = 1050.15+900;
                break;
            case CUARTA:
                salarioMensual = 910.13+900;
                break;
            case TERCERA:
                salarioMensual = 840.12+900;
                break;
            case SEGUNDA:
                salarioMensual = 770.11+900;
                break;
            case PRIMERA:
                salarioMensual = 700.10+900;
                break;
                
        }
        // REPORTE
        return salarioMensual;
    }
    public static double calcularRemuneracionMensual(int numeroHijos, String categoria) {
        // variable 
        double remuneracionMensual;
        //proceso
        remuneracionMensual = calcularSalarioMensual(categoria)+calcularAsignacionFamiliar(numeroHijos)-calcularOnp(categoria)-calcularEssalud(categoria);
        // reporte:
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

    public static double calcularOtros(int numeroHijos, String categoria, double vacaciones) {
        //variable
        double otros;
        // proceso
        vacaciones = calcularRemuneracionMensual(numeroHijos, categoria);
        otros = vacaciones;
        // reporte
        return otros;
    }
    public static double calcularRemuneracionAnual(int numeroHijos, String categoria, double unidocente, double multigrado, double bilingue, double bilingueAcreditado, double cts, double vacaciones) {
        // variable 
        double remuneracionAnual;
        //proceso
        remuneracionAnual = calcularRemuneracionMensual(numeroHijos, categoria)*12+ calcularOtros(numeroHijos, categoria, vacaciones) + calcularBeneficios(cts, categoria)*2;
        //reporte
        return remuneracionAnual;
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
        onp = calcularSalarioMensual(categoria)* 0.13;
        // reporte
        return onp;
    }

    public static double calcularEssalud(String categoria) {
        // variable
        double essalud;
        //proceso
        essalud = calcularSalarioMensual(categoria)* 0.09;
        //reporte
        return essalud;
    }
}
                  