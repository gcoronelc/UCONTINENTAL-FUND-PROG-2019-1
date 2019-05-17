package pe.continental.comisionventa.prueba;

import pe.continental.comisionventa.service.Programacion;

public class Prueba01 {
  
    public static void main(String[] args) {
        // DATOS
        int participante = 15;
        // PROCESO
        double total = Programacion.determinarTotal(participante);
        double importe = Programacion.determinarImporte(participante);
        double impuesto = Programacion.determinarImpuesto(participante);
        double comision = Programacion.determinarComision(participante);
        //REPORTE
        System.out.println("Numero de participantes :" + participante);
        System.out.println("Importe :" + importe);
        System.out.println("Total:" + total);
        System.out.println("Comision :" + comision);
        System.out.println("Impuesto :" + impuesto);
    }
}
