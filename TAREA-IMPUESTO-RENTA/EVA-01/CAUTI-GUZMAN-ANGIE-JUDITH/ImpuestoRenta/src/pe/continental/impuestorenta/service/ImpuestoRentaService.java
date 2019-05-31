/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.impuestorenta.service;

/**
 *
 * @author docente
 */
public class ImpuestoRentaService {
    public static double calcularImporteAnual(double mensual){
        // variable
        double ImporteAnual;
        //proceso
        ImporteAnual= mensual*12;
        // reporte
        return ImporteAnual;
    }
    public static double calcularAsignacion(int cantHijos){
        // variable
        double  asignacion = 0;
        //proceso
        if(cantHijos >= 1){
            asignacion = 93;
            
        }
        // reporte
        return asignacion;
    }
    
    public static double calcularRentaBruta(double mensual,int cantHijos, double gratificacion, double bonificacion, double vacaciones){
        //variables
        double rentaBruta;
        // proceso
        rentaBruta = mensual*12  + gratificacion + bonificacion + vacaciones + calcularAsignacion(cantHijos);
        // reporte 
        return rentaBruta;
    
}
    public static double calcularRentaTotal(double mensual,int cantHijos, double gratificacion, double bonificacion, double vacaciones){
        //variable
        double RentaTotalAnual = 0;
        double UIT;
        //proceso
        UIT = 4200.0;
        if (calcularRentaBruta(mensual, cantHijos, gratificacion, bonificacion, vacaciones)>=7*UIT){
        RentaTotalAnual = calcularRentaBruta(mensual, cantHijos, gratificacion, bonificacion, vacaciones)-7*UIT;
        }
       
        // reporte
        return RentaTotalAnual;
        
    
    }
    public static double calcularImpuesto5Categ(double mensual, int cantHijos, double gratificacion, double bonificacion, double vacaciones){
        //variables
        double RentaTotalAnual = 0;
        double UIT;
        double Impuesto5Cate = 0.0;        
        //proceso
        UIT = 4200.0;
        if (calcularRentaBruta(mensual, cantHijos, gratificacion, bonificacion, vacaciones)>=7*UIT){
        RentaTotalAnual = calcularRentaBruta(mensual, cantHijos, gratificacion, bonificacion, vacaciones)- 7*UIT;    
        }
        int control = 0;
        while (RentaTotalAnual > 0){
            control++;
            switch (control){
                case 1:
                    if (RentaTotalAnual >= 5*UIT){
                        Impuesto5Cate += 5*UIT*0.08;
                        RentaTotalAnual -= 5*UIT;
                    } else{
                        Impuesto5Cate += RentaTotalAnual*0.08;
                        RentaTotalAnual = 0;
                    }
                    break;
                case 2:
                    if (RentaTotalAnual > 15*UIT){
                        Impuesto5Cate += 15*UIT*0.14;
                        RentaTotalAnual -= 15*UIT;
                    } else{
                        Impuesto5Cate += RentaTotalAnual*0.14;
                        RentaTotalAnual = 0;
                    }    
                    break;
                 case 3:
                    if (RentaTotalAnual > 15*UIT){
                        Impuesto5Cate += 15*UIT*0.17;
                        RentaTotalAnual -= 15*UIT;
                    } else{
                        Impuesto5Cate += RentaTotalAnual*0.17;
                        RentaTotalAnual = 0;
                    } 
                    break;
                 case 4:
                    if (RentaTotalAnual > 10*UIT){
                        Impuesto5Cate += 10*UIT*0.20;
                        RentaTotalAnual -= 10*UIT;
                    } else{
                        Impuesto5Cate += RentaTotalAnual*0.20;
                        RentaTotalAnual = 0;
                    } 
                    break;
                 case 5:
                        Impuesto5Cate += RentaTotalAnual*0.30;
                        RentaTotalAnual = 0;
                        break;    
                      
            }
        }
        //reporte
        return Impuesto5Cate;
    }
    public static double calcularImpuesto4Categ(double mensual){
        //variable
        double Impuesto4Categ = 0;
        //proceso
        if(mensual>1500){
            Impuesto4Categ =(mensual - mensual *0.08)* 12;
                    
        }
        //reporte 
        return Impuesto4Categ;
        
    }
    public static double calcularImpuestoAnual(double mensual, int cantHijos, double gratificacion, double bonificacion, double vacaciones){
        //variable
        double ImpuestoTotal;
        //proceso
        ImpuestoTotal = calcularImpuesto4Categ(mensual)+ calcularImpuesto5Categ(mensual, cantHijos, gratificacion, bonificacion, vacaciones);
        // reporte 
        return ImpuestoTotal;
    }
}
