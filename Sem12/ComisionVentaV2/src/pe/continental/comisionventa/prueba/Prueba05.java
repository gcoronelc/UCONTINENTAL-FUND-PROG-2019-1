package pe.continental.comisionventa.prueba;

import pe.continental.comisionventa.service.VentaService;

public class Prueba05 {
    public static void main(String[] args) {
         // DATOS
         String categoria = VentaService.CAT_ADMINISTRACION;
        int participante = 20;
        // PROCESO
        double total = VentaService.determinarTotal(categoria,participante);
        double importe = VentaService.determinarImporte(categoria,participante);
        double impuesto = VentaService.determinarImpuesto(categoria,participante);
        double comision = VentaService.determinarComision(categoria,participante);
        double precio = VentaService.determinarPrecio(categoria);
        //REPORTE
        System.out.println("Precio :" + precio);
        System.out.println("Numero de participantes :" + participante);
        System.out.println("Importe :" + importe);
        System.out.println("Total:" + total);
        System.out.println("Comision :" + comision);
        System.out.println("Impuesto :" + impuesto);
    }
}
