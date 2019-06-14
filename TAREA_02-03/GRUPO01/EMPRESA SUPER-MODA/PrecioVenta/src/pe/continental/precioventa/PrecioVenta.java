/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.precioventa;

import egcc.util.SwingUtil;
import pe.continental.precioventa.view.PrecioVentaView;

/**
 *
 * @author Angie
 */
public class PrecioVenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrecioVentaView view = new PrecioVentaView();
        SwingUtil.showFormCenter(view);
        
    }
    
}
