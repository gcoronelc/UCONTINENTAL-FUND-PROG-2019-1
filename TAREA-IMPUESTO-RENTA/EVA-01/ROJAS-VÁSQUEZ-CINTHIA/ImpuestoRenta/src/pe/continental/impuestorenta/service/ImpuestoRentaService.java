
package pe.continental.impuestorenta.service;


public class ImpuestoRentaService {
    
       public static double calcularSueldoAnual(double sueldo) {
        // variable
        double sueldoanual;
        //proceso
        sueldoanual = sueldo*12;

        // reporte
        return sueldoanual;
    }

    public static double calcularAsignacionFamiliar(int hijos) {
        // variable
        int asignacionFamiliar = 0;
        //proceso
        if (hijos > 1) {
            
            asignacionFamiliar = 93*12;
        }
        // reporte
        return asignacionFamiliar;
    }

    
    public static double calcularRemuneracionBrutaAnual(double sueldo, int hijos, double gratificaciones, double horasextras) {
        //variables
        double remuneracionBrutaAnual;
         double horasesxtras = 0;
        // proceso
        remuneracionBrutaAnual = (calcularSueldoAnual(sueldo ) + calcularAsignacionFamiliar(hijos) + gratificaciones + horasesxtras);
        // reporte 
        return remuneracionBrutaAnual;

    }

    public static double calcularRemuneracionNetaAnual(double sueldo, int hijos, double gratificaciones, double horasextras) {
        //variable
        double remuneracionNetaAnual;
        //proceso
        remuneracionNetaAnual = calcularRemuneracionBrutaAnual(sueldo, hijos, gratificaciones, horasextras) - 29400;
        //reporte 
        return remuneracionNetaAnual;

    }

    public static double calcularImpuestoAnual(double sueldo, int hijos, double gratificaciones,  double horasextras) {
        // variable
        double impuestoAnual = 0.0;
        // proceso
        int control = 0;
        while (calcularRemuneracionNetaAnual(sueldo, hijos, gratificaciones, horasextras) > 0) {
            control++;
            switch (control) {
                case 1:
                    if (calcularRemuneracionNetaAnual(sueldo, hijos, gratificaciones, horasextras)< 4200 * 5) {
                        impuestoAnual += 4200*5*0.08;

                    } 
                    else  {
                        impuestoAnual += calcularRemuneracionNetaAnual(sueldo, hijos, gratificaciones, horasextras) * 0.08;
                        
                      

                    }
                    break;
                case 2 :
                    
                     if (calcularRemuneracionNetaAnual(sueldo, hijos, gratificaciones, horasextras) > 4200 * 5) {
                        impuestoAnual += 4200*8*0.08;

                    } 
                    else  {
                        impuestoAnual += calcularRemuneracionNetaAnual(sueldo, hijos, gratificaciones, horasextras) * 0.14;
                        
                      
                    
            }
        }
        // reporte
        return impuestoAnual;

    }
  
       public static double calcularImpuesto5Categoria(double sueldo, int hijos, double gratificaciones, double horasextras) {
        //variable
        double impuesto5Categoria = 0;
        //proceso
        if (sueldo > 2450) {
            impuesto5Categoria = calcularRemuneracionNetaAnual(sueldo, hijos, gratificaciones, horasextras) - calcularRemuneracionNetaAnual(sueldo, hijos, gratificaciones, horasextras) * 0.08;

        }
        //reporte 
        return impuesto5Categoria;

    }

    public static double calcularRemuneracionBruta(double sueldo, int hijos, double gratificaciones, double horasextras) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static double calcularRemuneracionNeta(double sueldo, int hijos, double gratificaciones, double horasextras) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
 

