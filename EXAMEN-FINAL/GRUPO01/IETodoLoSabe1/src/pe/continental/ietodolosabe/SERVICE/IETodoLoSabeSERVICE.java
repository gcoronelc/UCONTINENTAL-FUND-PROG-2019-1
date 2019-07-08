package pe.continental.ietodolosabe.SERVICE;

import pe.continental.ietodolosabe.DTO.IETodoLoSabeDTO;

public class IETodoLoSabeSERVICE {

    // CONSTANTES:
    // Categoria: Lista de Cursos
    public static final String WebConPHP = "WebConPHP";
    public static final String WebConJAVA = "WebConJAVA";
    public static final String WebConSpringFramework = "WebConSpringFramework";
    public static final String WebConAngularRest = "WebConAngularRest";

    // Categoria: Nivel
    public static final String Basico = "Basico";
    public static final String Intermedio = "Intermedio";
    public static final String Avanzado = "Avanzado";
    
    public static IETodoLoSabeDTO determinar(IETodoLoSabeDTO dto) {

        // PROCESO
        double Duracion = 0;
        switch (dto.getNivel()) {
            case Basico:
                Duracion = 24;      // 24 horas
                break;
            case Intermedio:
                Duracion = 30;       //30 horas
                break;
            case Avanzado:
                Duracion = 40;        //40 horas 
                break;
        }
        
        double CostoDelCurso = 0;
        switch (dto.getNivel()) {
            case Basico:
                CostoDelCurso = 500.0;
                break;
            case Intermedio:
                CostoDelCurso = 700.0;
                break;
            case Avanzado:
                CostoDelCurso = 900.0;
                break;
        }
        
        double PagoPorHora = 0;
        switch (dto.getNivel()) {
            case Basico:
                PagoPorHora = 60.0;
                break;
            case Intermedio:
                PagoPorHora = 80.0;
                break;
            case Avanzado:
                PagoPorHora = 100.0;
                break;
        }
        
        double SueldoDocente = PagoPorHora * Duracion;
        
        double IngresoBruto = 0;
        switch (dto.getNivel()) {
            case Basico:
                if (dto.getCantidadDeVacantes() > 1) {
                    IngresoBruto = CostoDelCurso * dto.getCantidadDeVacantes();
                }
                break;
            
            case Intermedio:
                if (dto.getCantidadDeVacantes() > 1) {
                    IngresoBruto = CostoDelCurso * dto.getCantidadDeVacantes();
                }
                break;
            case Avanzado:
                if (dto.getCantidadDeVacantes() > 1) {
                    IngresoBruto = CostoDelCurso * dto.getCantidadDeVacantes();
                }
                break;
        }
        
        double Publicidad = IngresoBruto * 0.07;        // 7% del ingleso bruto
        double Logistica = IngresoBruto * 0.08;         // 8 % del ingreso bruto
        double Material = IngresoBruto * 0.06;          // 6% del ingreso bruto
        double Gastos = Publicidad + Logistica + Material + SueldoDocente;
        double utilidad = IngresoBruto - Gastos;

        //REPORTE:
        dto.setPublicidad(Trunco2Deci(Publicidad));
        dto.setLogistica(Trunco2Deci(Logistica));
        dto.setMaterial(Trunco2Deci(Material));
        dto.setIngresoBruto(Trunco2Deci(IngresoBruto));
        dto.setSueldoDocente(Trunco2Deci(SueldoDocente));
        dto.setGastos(Trunco2Deci(Gastos));
        dto.setUtilidad(Trunco2Deci(utilidad));
        dto.setDuracion(Trunco2Deci(Duracion));
        dto.setCostoDelCurso(Trunco2Deci(CostoDelCurso));
        dto.setPagoPorHora(Trunco2Deci(PagoPorHora));
        
        return dto;
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
