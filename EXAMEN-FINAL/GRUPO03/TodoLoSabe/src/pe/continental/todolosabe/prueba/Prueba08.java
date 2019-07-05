package pe.continental.todolosabe.prueba;

import pe.continental.todolosabe.dto.TodoLoSabeDto;
import pe.continental.todolosabe.service.TodoLoSabeService;

/**
 *
 * @author Angie y Cinthia
 */
public class Prueba08 {

    public static void main(String[] args) {
        // Datos:
        TodoLoSabeDto dto = new TodoLoSabeDto();
        dto.setCantidadAlumnos(20);
        dto.setNivel(TodoLoSabeService.INTERMEDIO);
        dto.setCurso(TodoLoSabeService.JAVA);

        // Proceso:
        dto = TodoLoSabeService.procesarInstituto(dto);

        // Reporte:
        System.out.println("DATOS:");
        System.out.println("Curso: " + dto.getCurso());
        System.out.println("Nivel: " + dto.getNivel());
        System.out.println("Cantidad de Alumnos: " + dto.getCantidadAlumnos() + "\n");
        System.out.println("INGRESOS:");
        System.out.println("Ingresos: " + dto.getIngresos() + "\n");
        System.out.println("GASTOS:" );
        System.out.println("Pago al Profesor: " + dto.getPagoProfesor());
        System.out.println("Publicidad: " + dto.getPublicidad());
        System.out.println("Logistica: " + dto.getLogistica());
        System.out.println("Material: " + dto.getMaterial());
        System.out.println("Gastos Totales: " + dto.getGastos() + "\n");
        System.out.println("UTILIDAD:");
        System.out.println("Utlidad: " + dto.getUtilidad());
        

    }
}
