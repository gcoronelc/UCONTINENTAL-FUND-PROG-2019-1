package pe.continental.ietodolosabe.PRUEBA;

import pe.continental.ietodolosabe.DTO.IETodoLoSabeDTO;
import pe.continental.ietodolosabe.SERVICE.IETodoLoSabeSERVICE;

public class Prueba3 {

    public static void main(String[] args) {
        // DATOS
        IETodoLoSabeDTO dto = new IETodoLoSabeDTO();
        dto.setCantidadDeVacantes(50);
        dto.setListaDeCursos(IETodoLoSabeSERVICE.WebConSpringFramework);
        dto.setNivel(IETodoLoSabeSERVICE.Avanzado);
        // PROCESO
        IETodoLoSabeSERVICE iETodoLoSabeSERVICE = new IETodoLoSabeSERVICE();
        dto = IETodoLoSabeSERVICE.determinar(dto);
        // REPORTE
        System.out.println("DATOS:");
        System.out.println("Cantidad de vacantes:" + dto.getCantidadDeVacantes());
        System.out.println("Lista de Cursos:" + IETodoLoSabeSERVICE.WebConSpringFramework);
        System.out.println("Nivel de Educacion:" + IETodoLoSabeSERVICE.Avanzado + "\n" + "\n");

        System.out.println("REPORTE:");
        System.out.println("Ingreso Bruto:" + dto.getIngresoBruto());
        System.out.println("Publicidad:" + dto.getPublicidad());
        System.out.println("Logistica:" + dto.getLogistica());
        System.out.println("Material:" + dto.getMaterial());
        System.out.println("Gastos:" + dto.getGastos());
        System.out.println("Utilidad:" + dto.getUtilidad());
        System.out.println("Sueldo Docente:" + dto.getSueldoDocente());

    }

}
