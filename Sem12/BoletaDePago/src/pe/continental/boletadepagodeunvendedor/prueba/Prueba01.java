
package pe.continental.boletadepagodeunvendedor.prueba;

import pe.continental.boletadepagodeunvendedor.service.BoletaDePagoDeUnVendedorService;

/**
 *
 * @author SANGAY
 */
public class Prueba01 {
    public static void main(String[] args) {
        
    // PARA INGRESOS REMUNERATIVOS
    
        // DATOS
        double DiasTrabajados = 30;
        double PagoDiario = 31.00;
        double DiasFeriados = 2;
        double PagoFeriado = 62.00;
        double VentaTotal = 6000.00;
        
        
        // PROCESO
        double RemuneracionBruta = BoletaDePagoDeUnVendedorService.CalcularRemuneracionBruta(DiasTrabajados, PagoDiario);
        double Feriado = BoletaDePagoDeUnVendedorService.CalcularFeriado(DiasFeriados, PagoFeriado);
        double ComisionVenta = BoletaDePagoDeUnVendedorService.CalcularComisionVenta(VentaTotal);
      
        
        // REPORTE
        System.out.println("Remuneracion Bruta : " + RemuneracionBruta);
        System.out.println("Feriado : " + Feriado);
        System.out.println("Comision Venta : " + ComisionVenta);
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
}
