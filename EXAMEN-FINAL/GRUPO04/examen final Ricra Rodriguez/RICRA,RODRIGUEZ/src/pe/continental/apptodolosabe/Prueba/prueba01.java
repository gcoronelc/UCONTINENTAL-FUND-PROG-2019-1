
package pe.continental.apptodolosabe.Prueba;
import pe.continental.apptodolosabe.dto.AppTodoLoSabeDto;
import pe.continental.apptodolosabe.Service.AppTodoLoSabeService;

public class prueba01 {
    
    public static void main(String[] args) {
        //datos
        AppTodoLoSabeDto dto = new AppTodoLoSabeDto();
        dto.setNivel(AppTodoLoSabeService.INTERMEDIO);
        //proceso
        AppTodoLoSabeService apptodolosabeservice = new AppTodoLoSabeService();
        dto = apptodolosabeservice.calcular(dto);
        
        //reporte
        System.out.println("duracion de la clase:"+ dto.getDuracion());
        
    }
    
}
