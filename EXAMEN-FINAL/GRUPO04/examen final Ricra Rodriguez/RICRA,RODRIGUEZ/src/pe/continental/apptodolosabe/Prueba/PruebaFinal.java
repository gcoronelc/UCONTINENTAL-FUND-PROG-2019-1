package pe.continental.apptodolosabe.Prueba;
import pe.continental.apptodolosabe.dto.AppTodoLoSabeDto;
import pe.continental.apptodolosabe.Service.AppTodoLoSabeService;

public class PruebaFinal {
    
 public static void main(String[] args) {
        //datos
        AppTodoLoSabeDto dto = new AppTodoLoSabeDto();
        
        dto.setNivel(AppTodoLoSabeService.INTERMEDIO);
        dto.setCantidad(30);
        
        //proceso
        
        dto = AppTodoLoSabeService.calcular(dto);
        
        //reporte
        
        System.out.println("duracion de la clase:"+ dto.getDuracion());
        System.out.println("Costo de la clase:"+ dto.getCosto());
        System.out.println("INGRESO BRUTO: "+ dto.getIngreso());
        System.out.println("publicidad: "+ dto.getPublicidad());
        System.out.println("logistica: "+ dto.getLogistica());
        System.out.println("material: "+ dto.getMaterial());
        System.out.println("pago al profesor: "+ dto.getPagoProfesor());
        System.out.println(" ");
        System.out.println("GASTO TOTAL: "+ dto.getMaterial());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("UTILIDAD: "+ dto.getUtilidad());     
    
    }