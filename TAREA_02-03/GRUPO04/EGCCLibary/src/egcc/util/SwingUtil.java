package egcc.util;

import javax.swing.JFrame;

public class SwingUtil {
  
  public static void showFormCenter( JFrame form){
    form.setLocationRelativeTo(null);
    form.setVisible(true);
  }
}
