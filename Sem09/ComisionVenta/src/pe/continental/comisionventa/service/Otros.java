package pe.continental.comisionventa.service;

public class Otros {
    public static double determinarTotal (int participante){
        //VARIABLE
        double total ;
        //Proceso
        total = 1000.0 * participante;
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
        comision = determinarImporte(participante)*0.04;
        if (participante > 12){
            comision = determinarImporte(participante)*0.06;
        }
        //reporte
        return comision;
    }
    
}
