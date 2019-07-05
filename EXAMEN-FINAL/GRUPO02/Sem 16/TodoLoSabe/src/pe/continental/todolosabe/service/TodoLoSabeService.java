
package pe.continental.todolosabe.service;

import egcc.util.Mate;
import pe.continental.todolosabe.dto.TodoLoSabeDto;

public class TodoLoSabeService {
     // Categoria (K)
        public static final String BASICO = "BASICO";
        public static final String INTERMEDIO = "INTERMEDIO";
        public static final String AVANZADO = "AVANZADO";
        
        public static TodoLoSabeDto procesar (TodoLoSabeDto dto){
            //proceso
         double costoCurso = 0;
            
            switch (dto.getNivel()){
                case BASICO:
                    costoCurso = 500.00;
                    
            break;
                case INTERMEDIO:
                    costoCurso = 700.00;
                    
            break;
                case AVANZADO:
                    costoCurso = 900.00;
            break;
            }
            
         double ingresos = costoCurso * dto.getAlumnos();
         int duracion = 0;
            
            switch (dto.getNivel()){
                case BASICO:
                    duracion = 24;
                    
            break;
                case INTERMEDIO:
                    duracion = 30;
                    
            break;
                case AVANZADO:
                    duracion = 40;
            break;
            }
            
         double pagoHora = 0;
            
            switch (dto.getNivel()){
                case BASICO:
                    pagoHora = 60.00;
                    
            break;
                case INTERMEDIO:
                    pagoHora = 80.00;
                    
            break;
                case AVANZADO:
                    pagoHora = 100.00;
            break;
            }
            
            
            //gastos
            
            double publicidad = ingresos * 0.07;
            double logistica = ingresos * 0.08;
            double material = ingresos * 0.06;
            double pagoProfesor = duracion * pagoHora;
            
            // gasto total
            double gastos = publicidad + logistica + material + pagoProfesor;
            
            //rentabilidad
            
            double utilidad = ingresos - gastos;
            
            
            //reporte
        
        dto.setIngresos(Mate.dosDec(ingresos));
        dto.setPublicidad(Mate.dosDec(publicidad));
        dto.setLogistica(Mate.dosDec(logistica));
        dto.setMaterial(Mate.dosDec(material));
        dto.setGastos(Mate.dosDec(gastos));
        dto.setUtilidad(Mate.dosDec(utilidad));
        dto.setCostocurso(Mate.dosDec(costoCurso));
        dto.setPagoHora(Mate.dosDec(pagoHora));
        dto.setDuracion(duracion);
        dto.setPagoProfesor(Mate.dosDec(pagoProfesor));
        return dto;
        }
}
