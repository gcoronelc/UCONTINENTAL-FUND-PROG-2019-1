package pe.continental.impuestoalarenta2018.prueba;

import pe.continental.impuestoalarenta2018.service.ImpuestoALaRentaService;

public class Prueba07 {
    public static void main(String[] args) {
    // Datos
        double RNIT = 184968.74;
        //proceso
        double IRA = ImpuestoALaRentaService.CalcularImpuestoALaRentaAnual(RNIT);
        // reporte
        
        System.out.println("Impuesto a la renta anual :" + RNIT);
        System.out.println("RNIT :" + IRA);
    }
}

