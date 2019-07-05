
package pe.continental.todolosabe;

import javax.swing.JFrame;
import pe.continental.todolosabe.view.TodoLoSabeView;

/**
 *
 * @author DIANA
 */
public class TodoLoSabe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame form = new TodoLoSabeView();
        egcc.util.SwingUtil.showFormCenter(form);
    }
    }
    

