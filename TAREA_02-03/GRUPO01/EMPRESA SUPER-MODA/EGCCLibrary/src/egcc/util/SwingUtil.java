/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egcc.util;

import javax.swing.JFrame;

/**
 *
 * @author Angie
 */
public class SwingUtil {
    public static void showFormCenter (JFrame form){
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }
}
