package pe.continental.comisionventa.service;

public class Ofimatica {
    public static double determinarTotal (int participante){
        //VARIABLE
        double total ;
        //Proceso
        total = 500.0 * participante;
        //Reporte
        return total;  
    }
    
    public static double determinarImporte (int participante){
        //VARIABLE 
        double importe;
        //PROCESO
        importe = determinarTotal(participante) / 1.18;
        // REPORTE
        return importe;  
    }
    
    public static double determinarImpuesto (int participante){
        //VARIABLE
        double impuesto ;
        //PROCESO
        impuesto = determinarTotal(participante)- determinarImporte(participante);
        //REPORTE
        return impuesto; 
    }
    
    public static double determinarComision (int participante){
        //VARIABLE
        double comision;
        //PROCESO
        comision = determinarImporte(participante)*0.03;
        if (participante > 12){
            comision = determinarImporte(participante)*0.05;
        }
        //reporte
        return comision;
    }
    
}
