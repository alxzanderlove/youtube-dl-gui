/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube.dl.gui;

import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author lts
 */
public class YoutubeDlGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         try {
            NimRODLookAndFeel nimRODLookAndFeel = new NimRODLookAndFeel();
            UIManager.setLookAndFeel(nimRODLookAndFeel);
            //JTerminal terminal;
             
        } catch (Exception ex) {
        }

        new MainFrame().setVisible(true); 
        
       
        
    }
}
