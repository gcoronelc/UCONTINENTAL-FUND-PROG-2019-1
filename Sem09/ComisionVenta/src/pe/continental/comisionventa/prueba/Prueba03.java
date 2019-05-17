package pe.continental.comisionventa.prueba;

import pe.continental.comisionventa.service.Administracion;

public class Prueba03 {
    public static void main(String[] args) {
         // DATOS
        int participante = 20;
        // PROCESO
        double total = Administracion.determinarTotal(participante);
        double importe = Administracion.determinarImporte(participante);
        double impuesto = Administracion.determinarImpuesto(participante);
        double comision = Administracion.determinarComision(participante);
        //REPORTE
        System.out.println("Numero de participantes :" + participante);
        System.out.println("Importe :" + importe);
        System.out.println("Total:" + total);
        System.out.println("Comision :" + comision);
        System.out.println("Impuesto :" + impuesto);
    }
}
