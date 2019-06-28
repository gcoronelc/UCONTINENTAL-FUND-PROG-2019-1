package pe.continental.eventoperu.prueba;

import pe.continental.eventoperu.dto.EventoPeruDto;
import pe.continental.eventoperu.service.EventoPeruService;

/**
 *
 * @author Angie Cauti
 * @email 74972442@continental.edu.pe
 */
public class Prueba02 {

    public static void main(String[] args) {
        // Datos:
        EventoPeruDto dto = new EventoPeruDto();
        dto.setCapacidad(100000);
        dto.setCategoria(EventoPeruService.PREMIUN);
        dto.setUbicacion(EventoPeruService.PROVINCIA);

        // Proceso :
        EventoPeruService eventoPeruService = new EventoPeruService();
        dto = eventoPeruService.calcular(dto);

        // Reporte:
        System.out.println("DATOS: ");
        System.out.println("Capacidad del Local: " + dto.getCapacidad());
        System.out.println("Categoria: " + dto.getCategoria());
        System.out.println("REPORTE: ");
        System.out.println("Publicidad: " + dto.getIngresos());
        System.out.println("Logistica: " + dto.getLogistica());
        System.out.println("Transporte: " + dto.getTransporte());
        System.out.println("Pago al Artista: " + dto.getPagoArtista());
        System.out.println("Gastos: " + dto.getGastos());
        System.out.println("Rentabilidad: " + dto.getRentabilidad());
        
        
        
        
    }
}
