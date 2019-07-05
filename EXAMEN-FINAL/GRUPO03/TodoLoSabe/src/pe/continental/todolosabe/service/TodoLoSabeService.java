package pe.continental.todolosabe.service;

import pe.continental.todolosabe.dto.TodoLoSabeDto;

/**
 *
 * @author Angie y Cinthia
 */
public class TodoLoSabeService {

    // Constantes del Curso:
    public static final String PHP = "Desarrollo Web con PHP";
    public static final String JAVA = "Desarrollo Web con Java";
    public static final String SPRING = "Desarrollo Web con Spring Framework";
    public static final String ANGULAR = "Desarrollo Web con Angular y Rest";

    // Constantes del Nivel:
    public static final String BASICO = "BASICO";
    public static final String INTERMEDIO = "INTERMEDIO";
    public static final String AVANZADO = "AVANZADO";

    public static TodoLoSabeDto procesarInstituto(TodoLoSabeDto dto) {
        // Parte 1: Calculo de Ingresos
        double ingresos = calcularIngresos(dto.getNivel(), dto.getCantidadAlumnos());
        // Parte 2: Calculo de Gastos
        double pagoProfesor = calcularPagoProfesor(dto.getNivel());
        double publicidad = ingresos * 0.07;
        double logistica = ingresos * 0.08;
        double material = ingresos * 0.06;
        double gastos = pagoProfesor + publicidad + logistica + material;
        // Parte 3 : Calculo de Utilidad
        double utilidad = ingresos - gastos;
        // Parte 4: Reporte
        dto.setIngresos(Trunco2Deci(ingresos));
        dto.setPagoProfesor(Trunco2Deci(pagoProfesor));
        dto.setPublicidad(Trunco2Deci(publicidad));
        dto.setLogistica(Trunco2Deci(logistica));
        dto.setMaterial(Trunco2Deci(material));
        dto.setGastos(Trunco2Deci(gastos));
        dto.setUtilidad(Trunco2Deci(utilidad));
        return dto;
    }

    private static double calcularIngresos(String nivel, int cantidadAlumnos) {
        double ingresos = 0.0;
        switch (nivel) {
            case BASICO:
                ingresos = 500.0 * cantidadAlumnos;
                break;
            case INTERMEDIO:
                ingresos = 700.0 * cantidadAlumnos;
                break;
            case AVANZADO:
                ingresos = 900.0 * cantidadAlumnos;
                break;
        }
        return ingresos;
    }

    private static double calcularPagoProfesor(String nivel) {
        double pagoProfesor = 0.0;
        switch (nivel) {
            case BASICO:
                pagoProfesor = 60.0 * 24;
                break;
            case INTERMEDIO:
                pagoProfesor = 80.0 * 30;
                break;
            case AVANZADO:
                pagoProfesor = 100.0 * 40;
                break;
        }
        return pagoProfesor;
    }

    public static double Trunco2Deci(double dato) {
        // Proceso
        dato = dato * 100;
        dato = Math.round(dato) * 1.0;
        dato = dato / 100.0;
        // Reporte
        return dato;
    }

}
