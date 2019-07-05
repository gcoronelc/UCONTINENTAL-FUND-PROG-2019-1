/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.todolosabe.prueba;

import pe.continental.todolosabe.dto.TodoLoSabeDto;
import pe.continental.todolosabe.service.TodoLoSabeService;

/**
 *
 * @author SANGAY
 */
public class Prueba03 {
    
    public static void main(String[] args){
        // DATOS :
        TodoLoSabeDto dto = new TodoLoSabeDto();
        dto.setVacantes(10);
        dto.setCurso(TodoLoSabeService.ANGULARyREST);
        dto.setNivel(TodoLoSabeService.AVANZADO);
        
        // PROCESO :
        dto = TodoLoSabeService.procesarTodoLoSabe(dto);
        
        // REPORTE :
        System.out.println("DATOS: ");
        
        System.out.println("Curso: " + dto.getCurso());
        System.out.println("Nivel: " + dto.getNivel());
        System.out.println("Vacantes: " + dto.getVacantes());
        
        System.out.println("REPORTE: ");
        
        System.out.println("Ingreso: " + dto.getIngreso());
        
        System.out.println("Remuneración: " + dto.getRemuneracion());
        System.out.println("Publicidad: " + dto.getPublicidad());
        System.out.println("Logistica: " + dto.getLogistica());
        System.out.println("Material: " + dto.getMaterial());
        System.out.println("Gasto Total: " + dto.getGastoTotal());
        System.out.println("Utilidad: " + dto.getUtilidad());
        
    
    
    
    }
    
    
    
    
    
    
}
