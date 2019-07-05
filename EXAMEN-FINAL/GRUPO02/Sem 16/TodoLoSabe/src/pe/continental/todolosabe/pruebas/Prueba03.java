
package pe.continental.todolosabe.pruebas;

import pe.continental.todolosabe.dto.TodoLoSabeDto;
import pe.continental.todolosabe.service.TodoLoSabeService;

public class Prueba03 {
    public static void main(String[] args) {
     //datos
        TodoLoSabeDto dto = new TodoLoSabeDto();
        dto.setNivel(TodoLoSabeService.AVANZADO);
        dto.setAlumnos(100);
        
        
        //proceso
        TodoLoSabeService todoLoSabeService = new TodoLoSabeService();
        dto = TodoLoSabeService.procesar(dto);
        
        //reporte
        System.out.println("Datos : " + "\n");
        System.out.println("NIVEL: " + dto.getDuracion());
        System.out.println("ALUMNOS: " + dto.getAlumnos()+ "\n");
        System.out.println("REPORTE: " + "\n");
        System.out.println("DURACION: " + dto.getDuracion());
        System.out.println("GASTOS POR LOGISTICA: " + dto.getLogistica());
        System.out.println("INGRESOS :" + dto.getIngresos());
        System.out.println("GASTOS POR PUBLICIDAD: " + dto.getPublicidad());
        System.out.println("GASTOS POR MATERIAL: " + dto.getMaterial());
        System.out.println("PAGO AL PROFESOR: " + dto.getPagoProfesor());
        System.out.println("GASTOS TOTALES: " + dto.getGastos());
        System.out.println("RENTABILIDAD O UTILIDAD: " + dto.getUtilidad());
    }
    
}
