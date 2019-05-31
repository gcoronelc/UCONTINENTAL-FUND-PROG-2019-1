package pe.continental.docentepublico.Service;



public class SueldoDocentePublico {
    
    public static final String CAT_AUXILIARCONTRATADO = "AUXILIARCONTRATADO";
    public static final String CAT_AUXILIARNOMBRADO = "AUXILIARNOMBRADO";
    public static final String CAT_DOCENTECONTRATADO = "DOCENTECONTRATADO";
    public static final String CAT_DOCENTENOMBRADO = "DOCENTENOMBRADO";
    public static final String CAT_ENCARGATURADIRECTOR = "ENCARGATURADIRECTOR";
    public static final String CAT_ENCARGATURASUBDIRECTOR = "ENCARGATURASUBDIRECTOR";
    public static final String CAT_ENCARGATURAJERARQUICO = "ENCARGATURAJERARQUICO";
    public static final String CAT_ENCARGATURAESPECIALISTA = "ENCARGATURAESPECIALISTA";
    
    public static double calcularSalarioMensual(String categoria, double modalidad, double jornadaLaboral) {
        // variable
        double salarioMensual = 0.0;
        // proceso
        switch (categoria.toUpperCase()) {
            case CAT_AUXILIARCONTRATADO:
                salarioMensual = AuxiliarContratado.calcularSalarioMensual(modalidad);
                break;
            case CAT_AUXILIARNOMBRADO:
                salarioMensual = AuxiliarNombrado.calcularSalarioMensual(modalidad);
                break;
            case CAT_DOCENTECONTRATADO:
                salarioMensual = DocenteContratado.calcularSalarioMensual(modalidad, jornadaLaboral);
                break;
            case CAT_DOCENTENOMBRADO:
                salarioMensual = DocenteNombrado.calcularSalarioMensual(categoria);
                break;
            case CAT_ENCARGATURADIRECTOR:
                salarioMensual = EncargaturaDirector.calcularSalarioMensual(categoria);
                break;
            case CAT_ENCARGATURASUBDIRECTOR:
                salarioMensual = EncargaturaSubdirector.calcularSalarioMensual(categoria);
                break;
            case CAT_ENCARGATURAJERARQUICO:
                salarioMensual = EncargaturaJerarquico.calcularSalarioMensual(categoria);
                break;
            case CAT_ENCARGATURAESPECIALISTA:
                salarioMensual = EncargaturaEspecialista.calcularSalarioMensual(categoria);
                break;    
            
        }
        // reporte
        return truncar2Dec(salarioMensual);
    }
    
    public static double calcularAsignaciones(String categoria, double bilingueAcreditado, double unidocente, double multigrado, double bilingue, double lenguaOrdinaria) {
        // variable
        double asignaciones = 0.0;
        // proceso
        switch (categoria.toUpperCase()) {
            case CAT_AUXILIARCONTRATADO:
                asignaciones = AuxiliarContratado.calcularAsignaciones(unidocente, multigrado, bilingue);
                break;
            case CAT_AUXILIARNOMBRADO:
                asignaciones = AuxiliarNombrado.calcularAsignaciones(unidocente, multigrado, bilingue);
                break;
            case CAT_DOCENTECONTRATADO:
                asignaciones = DocenteContratado.calcularAsignaciones(unidocente, multigrado, bilingue, lenguaOrdinaria);
                break;
            case CAT_DOCENTENOMBRADO:
                asignaciones = DocenteNombrado.calcularAsignaciones(unidocente, multigrado, bilingue, bilingueAcreditado);
                break;
            
        }
        // reporte
        return truncar2Dec(asignaciones);
    }
    
    public static double calcularAsignacionFamiliar(int numeroHijos, String categoria) {
        // variable
        double asignacionFamiliar = 0.0;
        // proceso
        switch (categoria.toUpperCase()) {
            case CAT_AUXILIARCONTRATADO:
                asignacionFamiliar = AuxiliarContratado.calcularAsignacionFamiliar(numeroHijos);
                break;
            case CAT_AUXILIARNOMBRADO:
                asignacionFamiliar = AuxiliarNombrado.calcularAsignacionFamiliar(numeroHijos);
                break;
            case CAT_DOCENTECONTRATADO:
                asignacionFamiliar = DocenteContratado.calcularAsignacionFamiliar(numeroHijos);
                break;
            case CAT_DOCENTENOMBRADO:
                asignacionFamiliar = DocenteNombrado.calcularAsignacionFamiliar(numeroHijos);
                break;
            case CAT_ENCARGATURADIRECTOR:
                asignacionFamiliar = EncargaturaDirector.calcularAsignacionFamiliar(numeroHijos);
                break;
            case CAT_ENCARGATURASUBDIRECTOR:
                asignacionFamiliar = EncargaturaSubdirector.calcularAsignacionFamiliar(numeroHijos);
                break;
            case CAT_ENCARGATURAJERARQUICO:
                asignacionFamiliar = EncargaturaJerarquico.calcularAsignacionFamiliar(numeroHijos);
                break;
            case CAT_ENCARGATURAESPECIALISTA:
                asignacionFamiliar = EncargaturaEspecialista.calcularAsignacionFamiliar(numeroHijos);
                break;
            
        }
        // reporte
        return truncar2Dec(asignacionFamiliar);
    }
    
    public static double calcularOnp(String categoria, double modalidad, double jornadaLaboral) {
        // variable
        double onp = 0.0;
        // proceso
        switch (categoria.toUpperCase()) {
            case CAT_AUXILIARCONTRATADO:
                onp = AuxiliarContratado.calcularOnp(modalidad);
                break;
            case CAT_AUXILIARNOMBRADO:
                onp = AuxiliarNombrado.calcularOnp(modalidad);
                break;
            case CAT_DOCENTECONTRATADO:
                onp = DocenteContratado.calcularOnp(jornadaLaboral, modalidad);
                break;
            case CAT_DOCENTENOMBRADO:
                onp = DocenteNombrado.calcularOnp(categoria);
                break;
            case CAT_ENCARGATURADIRECTOR:
                onp = EncargaturaDirector.calcularOnp(categoria);
                break;
            case CAT_ENCARGATURASUBDIRECTOR:
                onp = EncargaturaSubdirector.calcularOnp(categoria);
                break;
            case CAT_ENCARGATURAJERARQUICO:
                onp = EncargaturaJerarquico.calcularOnp(categoria);
                break;
            case CAT_ENCARGATURAESPECIALISTA:
                onp = EncargaturaEspecialista.calcularOnp(categoria);
                break;
        }
        // reporte
        return truncar2Dec(onp);
    }
    
    public static double calcularEssalud(String categoria, double jornadaLaboral, double modalidad) {
        // variable
        double essalud = 0.0;
        // proceso
        switch (categoria.toUpperCase()) {
            case CAT_AUXILIARCONTRATADO:
                essalud = AuxiliarContratado.calcularEssalud(modalidad);
                break;
            case CAT_AUXILIARNOMBRADO:
                essalud = AuxiliarNombrado.calcularEssalud(modalidad);
                break;
            case CAT_DOCENTECONTRATADO:
                essalud = DocenteContratado.calcularEssalud(jornadaLaboral, modalidad);
                break;
            case CAT_DOCENTENOMBRADO:
                essalud = DocenteNombrado.calcularEssalud(categoria);
                break;
            case CAT_ENCARGATURADIRECTOR:
                essalud = EncargaturaDirector.calcularEssalud(categoria);
                break;
            case CAT_ENCARGATURASUBDIRECTOR:
                essalud = EncargaturaSubdirector.calcularEssalud(categoria);
                break;
            case CAT_ENCARGATURAJERARQUICO:
                essalud = EncargaturaJerarquico.calcularEssalud(categoria);
                break;
            case CAT_ENCARGATURAESPECIALISTA:
                essalud = EncargaturaEspecialista.calcularEssalud(categoria);
                break;
            
        }
        // reporte
        return truncar2Dec(essalud);
    }
    
    public static double calcularRemuneracionMensual(int numeroHijos, String categoria, double modalidad, double jornadaLaboral, double bilingueAcreditado, double unidocente, double multigrado, double bilingue, double lenguaOrdinaria) {
        // variable
        double remuneracionMensual = 0.0;
        // proceso
        switch (categoria.toUpperCase()) {
            case CAT_AUXILIARCONTRATADO:
                remuneracionMensual = AuxiliarContratado.calcularRemuneracionMensual(numeroHijos, modalidad, multigrado, unidocente, bilingue);
                break;
            case CAT_AUXILIARNOMBRADO:
                remuneracionMensual = AuxiliarNombrado.calcularRemuneracionMensual(numeroHijos, modalidad, multigrado, unidocente, bilingue);
                break;
            case CAT_DOCENTECONTRATADO:
                remuneracionMensual = DocenteContratado.calcularRemuneracionMensual(lenguaOrdinaria, jornadaLaboral, modalidad, multigrado, unidocente, bilingue, numeroHijos);
                break;
            case CAT_DOCENTENOMBRADO:
                remuneracionMensual = DocenteNombrado.calcularRemuneracionMensual(numeroHijos, categoria, unidocente, multigrado, bilingue, bilingueAcreditado);
                break;
            case CAT_ENCARGATURADIRECTOR:
                remuneracionMensual = EncargaturaDirector.calcularRemuneracionMensual(numeroHijos, categoria);
                break;
            case CAT_ENCARGATURASUBDIRECTOR:
                remuneracionMensual = EncargaturaSubdirector.calcularRemuneracionMensual(numeroHijos, categoria);
                break;
            case CAT_ENCARGATURAJERARQUICO:
                remuneracionMensual = EncargaturaJerarquico.calcularRemuneracionMensual(numeroHijos, categoria);
                break;
            case CAT_ENCARGATURAESPECIALISTA:
                remuneracionMensual = EncargaturaEspecialista.calcularRemuneracionMensual(numeroHijos, categoria);
                break;
        }
        // reporte
        return truncar2Dec(remuneracionMensual);
    }
    public static double calcularBeneficios(double cts, double modalidad, double jornadaLaboral, String categoria){
         // variable
        double beneficios = 0.0;
        // proceso
        switch (categoria.toUpperCase()) {
            case CAT_AUXILIARCONTRATADO:
                beneficios = AuxiliarContratado.calcularBeneficios(cts, modalidad);
                break;
            case CAT_AUXILIARNOMBRADO:
                beneficios = AuxiliarNombrado.calcularBeneficios(cts, modalidad);
                break;
            case CAT_DOCENTECONTRATADO:
                beneficios = DocenteContratado.calcularBeneficios(cts, modalidad, jornadaLaboral);
                break;
            case CAT_DOCENTENOMBRADO:
                beneficios = DocenteNombrado.calcularBeneficios(cts, categoria);
                break;
            case CAT_ENCARGATURADIRECTOR:
                beneficios = EncargaturaDirector.calcularBeneficios(cts, categoria);
                break;
            case CAT_ENCARGATURASUBDIRECTOR:
                beneficios = EncargaturaSubdirector.calcularBeneficios(cts, categoria);
                break;
            case CAT_ENCARGATURAJERARQUICO:
                beneficios = EncargaturaJerarquico.calcularBeneficios(cts, categoria);
                break;
            case CAT_ENCARGATURAESPECIALISTA:
                beneficios = EncargaturaEspecialista.calcularBeneficios(cts, categoria);
                break;
        }
        // reporte
        return truncar2Dec(beneficios);
    }
    
    public static double calcularOtros(int numeroHijos, String categoria, double modalidad, double incentivoAprendizaje, double jornadaLaboral, double bilingueAcreditado, double unidocente, double multigrado, double bilingue, double lenguaOrdinaria, double vacaciones, double cts) {
         // variable
        double otros = 0.0;
        // proceso
        switch (categoria.toUpperCase()) {
            case CAT_AUXILIARCONTRATADO:
                otros = AuxiliarContratado.calcularOtros(numeroHijos, modalidad, vacaciones, unidocente, multigrado, bilingue);
                break;
            case CAT_AUXILIARNOMBRADO:
                otros = AuxiliarNombrado.calcularOtros(numeroHijos, modalidad, vacaciones, unidocente, multigrado, bilingue);
                break;
            case CAT_DOCENTECONTRATADO:
                otros = DocenteContratado.calcularOtros(numeroHijos, lenguaOrdinaria, jornadaLaboral, incentivoAprendizaje, modalidad, vacaciones, unidocente, multigrado, bilingue);
                break;
            case CAT_DOCENTENOMBRADO:
                otros = DocenteNombrado.calcularOtros(numeroHijos, categoria, bilingueAcreditado, vacaciones, unidocente, multigrado, bilingue);
                break;
            case CAT_ENCARGATURADIRECTOR:
                otros = EncargaturaDirector.calcularOtros(numeroHijos, categoria, vacaciones);
                break;
            case CAT_ENCARGATURASUBDIRECTOR:
                otros = EncargaturaSubdirector.calcularOtros(numeroHijos, categoria, vacaciones);
                break;
            case CAT_ENCARGATURAJERARQUICO:
                otros = EncargaturaJerarquico.calcularOtros(numeroHijos, categoria, vacaciones);
                break;
            case CAT_ENCARGATURAESPECIALISTA:
                otros = EncargaturaEspecialista.calcularOtros(numeroHijos, categoria, vacaciones);
                break;
        }
        // reporte
        return truncar2Dec(otros);
    }
    public static double calcularRemuneracionAnual(int numeroHijos, String categoria, double cts, double modalidad, double jornadaLaboral, double bilingueAcreditado, double unidocente, double multigrado, double bilingue, double lenguaOrdinaria, double vacaciones,double incentivoAprendizaje){
        // variable
        double remuneracionAnual = 0.0;
        // proceso
        switch (categoria.toUpperCase()) {
            case CAT_AUXILIARCONTRATADO:
                remuneracionAnual = AuxiliarContratado.calcularRemuneracionAnual(numeroHijos, modalidad, unidocente, multigrado, bilingue, cts, vacaciones);
                break;
            case CAT_AUXILIARNOMBRADO:
                remuneracionAnual = AuxiliarNombrado.calcularRemuneracionAnual(numeroHijos, modalidad, unidocente, multigrado, bilingue, cts, vacaciones);
                break;
            case CAT_DOCENTECONTRATADO:
                remuneracionAnual = DocenteContratado.calcularRemuneracionAnual(numeroHijos, jornadaLaboral, modalidad, unidocente, multigrado, lenguaOrdinaria, incentivoAprendizaje, bilingue, cts, vacaciones);
                break;
            case CAT_DOCENTENOMBRADO:
                remuneracionAnual = DocenteNombrado.calcularRemuneracionAnual(numeroHijos, categoria, unidocente, multigrado, bilingue, bilingueAcreditado, cts, vacaciones);
                break;
            case CAT_ENCARGATURADIRECTOR:
                remuneracionAnual = EncargaturaDirector.calcularRemuneracionAnual(numeroHijos, categoria, unidocente, multigrado, bilingue, bilingueAcreditado, cts, vacaciones);
                break;
            case CAT_ENCARGATURASUBDIRECTOR:
                remuneracionAnual = EncargaturaSubdirector.calcularRemuneracionAnual(numeroHijos, categoria, unidocente, multigrado, bilingue, bilingueAcreditado, cts, vacaciones);
                break;
            case CAT_ENCARGATURAJERARQUICO:
                remuneracionAnual = EncargaturaJerarquico.calcularRemuneracionAnual(numeroHijos, categoria, unidocente, multigrado, bilingue, bilingueAcreditado, cts, vacaciones);
                break;
            case CAT_ENCARGATURAESPECIALISTA:
                remuneracionAnual = EncargaturaEspecialista.calcularRemuneracionAnual(numeroHijos, categoria, unidocente, multigrado, bilingue, bilingueAcreditado, cts, vacaciones);
                break;
        }
        // reporte
        return truncar2Dec(remuneracionAnual);
    }
    private static double truncar2Dec(double dato) {
        //proceso
        dato = dato * 100;
        dato = Math.round(dato) * 1.0;
        dato = dato / 100.0;
        // reporte
        return dato;

    }
}
