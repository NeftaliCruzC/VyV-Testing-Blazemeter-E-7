/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfaces;

import Controlador.BD.Conexion;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.luna.LunaLookAndFeel;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import com.jtattoo.plaf.noire.NoireLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import com.jtattoo.plaf.texture.TextureLookAndFeel;
import java.sql.Connection;
import javax.swing.UIManager;

/**
 *
 * @author brand
 */
public class SpaVG {

    /**
     * @param args the command line arguments
     */
    
        Conexion con = new Conexion();
        Connection cn;
        
    public static void main(String[] args) {
        
        
        try {
            
           LunaLookAndFeel.setTheme("Giant-Font");
            
            UIManager.setLookAndFeel(new LunaLookAndFeel());
            
            
        } catch (javax.swing.UnsupportedLookAndFeelException e) { 
        }
        
            Login menu = new Login();
            
            menu.setVisible(true);
        
    }
    
}
