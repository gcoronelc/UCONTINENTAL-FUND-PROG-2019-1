package pe.continental.todolosabe.prueba;

import pe.continental.todolosabe.dto.TodoLoSabeDto;
import pe.continental.todolosabe.service.TodoLoSabeService;

/**
 *
 * @author Angie y Cinthia
 */
public class Prueba04 {

    public static void main(String[] args) {
        // Datos:
        TodoLoSabeDto dto = new TodoLoSabeDto();
        dto.setCantidadAlumnos(25);
        dto.setNivel(TodoLoSabeService.INTERMEDIO);
        dto.setCurso(TodoLoSabeService.SPRING);

        // Proceso:
        dto = TodoLoSabeService.procesarInstituto(dto);

        // Reporte:
        System.out.println("DATOS:");
        System.out.println("Curso: " + dto.getCurso());
        System.out.println("Nivel: " + dto.getNivel());
        System.out.println("Cantidad de Alumnos: " + dto.getCantidadAlumnos() + "\n");
        System.out.println("REPORTE: ");
        System.out.println("Publicidad: " + dto.getPublicidad());

    }
}