
package pe.continental.supermoda;

import javax.swing.JFrame;
import pe.continental.supermoda.view.SuperModaView;

/**
 *
 * @author SANGAY
 */
public class SuperModa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //SuperModaView.main(args);
        
        JFrame form = new SuperModaView();
        egcc.util.SwingUtil.showFormCenter(form);
        
        
    }
    
}
