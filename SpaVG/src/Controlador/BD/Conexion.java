/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.BD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author BAJJC
 */
public class Conexion {
    
       Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spabd", "root", "");
        } catch (Exception e) {
            e.printStackTrace(); // Imprime la excepción si hay algún error
        }
    }
    
    public Connection getConnection(){
        return con;
    }

}
