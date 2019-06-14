/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.supermoda;

import javax.swing.JFrame;
import pe.continental.supermoda.view.SuperModaView;

/**
 *
 * @author DIANA
 */
public class SuperModa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        JFrame form = new SuperModaView();
    egcc.util.SwingUtil.showFormCenter(form);

    }
    
}
