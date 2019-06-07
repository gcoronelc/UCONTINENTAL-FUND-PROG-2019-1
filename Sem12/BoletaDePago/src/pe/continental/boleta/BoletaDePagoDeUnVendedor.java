package pe.continental.boleta;

import javax.swing.JFrame;
import pe.continental.boleta.view.BoletaView;

/**
 *
 * @author SANGAY
 */
public class BoletaDePagoDeUnVendedor {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    //BoletaDePagoDeUnVendedorView.main(args);
    
    JFrame form = new BoletaView();
    egcc.util.SwingUtil.showFormCenter(form);

  }

}
