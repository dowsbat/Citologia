/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author Oscar Rivera
 */
public class Util {
    
    public static String PATRON_FECHA_MYSQL = "YYYY-MM-dd";

    public static String aFechaMySQL(Date date) {
        String fecha;
        SimpleDateFormat adf = new SimpleDateFormat(PATRON_FECHA_MYSQL);
        fecha = adf.format(date);

        return fecha;
    }

    public static void informar(Component c, String mensaje, String titulo) {
        JOptionPane.showMessageDialog(c, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void advertir(Component c, String mensaje, String titulo) {
        JOptionPane.showMessageDialog(c, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean confirmar (Component c, String mensaje, String titulo){
        int respuesta = JOptionPane.showConfirmDialog(c, mensaje, titulo, JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION) {
            return true;
        }else{
            return false;
        }
        
    }
            
}
